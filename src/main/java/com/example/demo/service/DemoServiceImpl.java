package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getInformation(String name) {
        if(name == null) {return "Ой!!!";
        } else  if (name.equals("Дима")) {
            return "Привет, Дима!";
        } else {
            return "Ты не Дима!";
        }
      }
}
