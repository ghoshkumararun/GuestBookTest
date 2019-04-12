package com.testcases;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.View;

import com.arun.test.controllers.EntryController;

public class EntryControllerTest {

	/*
    @InjectMocks
    EntryController controller;

  

    @Mock
    View mockView;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = standaloneSetup(controller)
                .setSingleView(mockView)
                .build();
    }

    @Test
    public void testListPeopleInGroup() throws Exception {
        List expectedPeople = asList(new Person());
        when(mockPeopleService.listPeople("someGroup")).thenReturn(expectedPeople);

        mockMvc.perform(get("/people/someGroup"))
                .andExpect(status().isOk());
    }
    
    */
}