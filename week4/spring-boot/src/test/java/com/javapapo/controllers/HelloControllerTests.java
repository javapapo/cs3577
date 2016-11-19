package com.javapapo.controllers;

import com.javapapo.controllers.HelloController;
import com.javapapo.controllers.PersonController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testStatus() throws Exception {
        mvc.perform(get("/test"))
                .andExpect(status().isOk());

    }

    @Test
    public void testResponseContent() throws Exception {
        mvc.perform(get("/test"))
                 .andExpect(content().string("This is a test"));

    }

}
