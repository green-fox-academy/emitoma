package com.example.restworkshop;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ArrayHandlerControllerTest {
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void arrayHandlerSum() throws Exception {
        mockMvc.perform(post("/arrays").
                contentType(contentType)
                .content("{ \"WHAT\" : \"sum\", \"numbers\": \"[1, 2, 5, 10]\" }"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(18)));
    }
}
