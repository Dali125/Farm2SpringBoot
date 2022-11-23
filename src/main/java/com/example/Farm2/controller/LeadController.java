package com.example.Farm2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class LeadController {


    @GetMapping(path = "/all")
    public String getLeads(){
        return "users";
    }
}
