package com.rushedstudio.domino.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PermissionControllerTest {

    @Autowired
    private PermissionController controller;
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void controllerInitializedCorectly(){
        assertNotNull(controller);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllPermissions() {
    }

    @Test
    public void getPermissionById() {
    }

    @Test
    public void getPermissionById1() {
    }

    @Test
    public void getPermissionByRole() {
    }
}
