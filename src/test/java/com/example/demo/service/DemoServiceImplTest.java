package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceImplTest {

    DemoService demoService = new DemoServiceImpl();
    @Test
    public void test1(){
        String a = null;
        assertEquals(demoService.getInformation(a),"Ой!!!" );
    }

    @Test
    public void test2(){
        String a = "Дима";
        assertEquals(demoService.getInformation(a),"Привет, Дима!" );
    }
}