package com.javapapo.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(PersonController.class)
public class PersonControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetPersonONE() throws Exception {
        mvc.perform(get("/person/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Peter")));

    }

    @Test
    public void testGetPersonTwoSurname() throws Exception {
        mvc.perform(get("/person/2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.surname", is("Jackson")));

    }


}
