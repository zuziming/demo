package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class News {
    private Integer id;
    private String title;
    private String content;
    private Date time;
    private String keyWord;
}
