package com.example.restservice;

import com.assessment.assescor.controller.CSVController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
public class ApiTest {

    private MockMvc mockMvc;

    @InjectMocks
    private CSVController csvController;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(csvController).build();
    }

    @Test
    public void testCSVController() throws Exception{

        String jsonResult = "{\"mLastName\": \"Müller\", \"mFirstName\": \"Hans\", \"mZipCode\": \"67742\", \"mCity\": \"Lauterecken\", \"mColor\": \"blau\", \"id\": 1}";

        mockMvc.perform(MockMvcRequestBuilders.
                get("/api/csv/users/{Id}", 1).
                accept(MediaType.APPLICATION_JSON)).
                andDo(print()).
                andExpect(status().isOk()).
                andExpect(MockMvcResultMatchers.jsonPath("$.mLastName").value("Müller"));

    }

}
