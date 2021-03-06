package com.javapapo;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

public class UserLookUpService {

    //Bret //Antonette //Samantha
    private static final String USERS_BY_USERNAME_URL = "https://jsonplaceholder.typicode.com/users?username=";
    private HttpClient client;
    private JsonParser parser;

    public UserLookUpService() {
        client = HttpClientBuilder.create().build();
        parser = new JsonParser();
    }

    public Optional<String> getFullName(String aUserName) {
        Optional result = Optional.empty();
        if (Objects.nonNull(aUserName)) {
            HttpGet request = prepareRequest(aUserName);
            try {
                Optional<String> responseEntity = getJSONresponse(request);
                JsonArray ar = parser.parse(responseEntity.get()).getAsJsonArray();
                if (ar.get(0) != null) {
                    JsonObject obj = ar.get(0).getAsJsonObject();
                    result = Optional.ofNullable(obj.get("name").getAsString());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return result;
    }


    public Optional<String> getPhoneNumberByUsername(String aUserName) {
        Optional result = Optional.empty();
        if (Objects.nonNull(aUserName)) {
            HttpGet request = prepareRequest(aUserName);

            try {
                Optional<String> responseEntity = getJSONresponse(request);
                if (responseEntity.isPresent()) {
                    JsonArray ar = parser.parse(responseEntity.get()).getAsJsonArray();
                    if (ar.get(0) != null) {
                        JsonObject obj = ar.get(0).getAsJsonObject();
                        result = Optional.ofNullable(obj.get("phone").getAsString());
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


    private HttpGet prepareRequest(String aUserName) {
        String finalUrl = USERS_BY_USERNAME_URL + aUserName;
        return new HttpGet(finalUrl);

    }

    private Optional<String> getJSONresponse(HttpGet request) throws IOException {
        Optional<String> result = Optional.empty();
        HttpResponse response = client.execute(request);
        HttpEntity responseEntity = response.getEntity();
        if (responseEntity != null) {
            result = Optional.ofNullable(EntityUtils.toString(responseEntity));
        }
        return result;
    }


}
