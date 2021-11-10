package com.knoldus.kup.controller;

import com.knoldus.kup.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    AppService appService;

    @RequestMapping("/status")
    public String getStatusWithTime(){
        return appService.getStatusWithTime();
    }
}
