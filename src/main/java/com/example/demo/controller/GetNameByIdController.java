package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class GetNameByIdController {
    public String getNameById(@RequestParam Integer id){
        return "yourName";
    }
}
