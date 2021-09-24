package com.example.demo.service;

import com.example.demo.entity.News;


public interface NewsService {
     News getNewsById(Integer id);

    Integer addNews(News news);

    Integer delNews(Integer id);

    Integer updateNews(News news);

    News queryNews(News news);
}
