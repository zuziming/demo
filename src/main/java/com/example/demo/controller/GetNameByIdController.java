package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class GetNameByIdController {
    @GetMapping("/list")
    public String getNameById(@RequestParam Integer id){
        return "yourName";
    }
}
