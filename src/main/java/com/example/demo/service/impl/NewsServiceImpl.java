package com.example.demo.service.impl;

import com.example.demo.entity.News;
import com.example.demo.mapper.NewsMapper;
import com.example.demo.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewsServiceImpl implements NewsService {


    private NewsMapper newsMapper;

    @Override
    public News getNewsById(Integer id){
        return newsMapper.getNewsById(id);
    }

    @Override
    public Integer addNews(News news) {
        return newsMapper.addNews(news);
    }

    @Override
    public Integer delNews(Integer id) {
        return newsMapper.delNews(id);
    }

    @Override
    public Integer updateNews(News news) {
        return newsMapper.updateNews(news);
    }

    @Override
    public News queryNews(News news) {
        return null;
    }


}
