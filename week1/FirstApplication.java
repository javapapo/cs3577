package com.myfirstproject;

import java.util.Arrays;
import java.util.List;

public class FirstApplication {

    private String name;

    public FirstApplication(String aName){
        this.name
                = aName;
    }

    public static void main(String[] args) {

        List<String>        words = Arrays.asList("one",
                "two",
                "three");

        if(true){
            System.out
                    .println("Hello");
        }

    }


}
