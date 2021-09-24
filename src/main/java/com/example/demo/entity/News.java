package com.example.demo.entity;

import lombok.Data;

@Data
public class News {
    private Integer id;
    private String newsTitle;
    private String newsContent;
    private Integer newsTime;
    private String keyWord;
}
