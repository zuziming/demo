package com.example.demo.controller;

import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;
    @RequestMapping ("/getNewsById")
    public News getNewsById(@RequestParam Integer id){
        return newsService.getNewsById(id);
    }
    @RequestMapping("/addNews")
    public Integer addNews(@RequestBody News news){
        return newsService.addNews(news);
    }
    @RequestMapping("/delNews")
    public Integer delNews(@RequestParam Integer id){
        return newsService.delNews(id);
    }
    @RequestMapping("/updateNews")
    public Integer updateNews(@RequestBody News news){
        return newsService.updateNews(news);
    }
    @RequestMapping("/query")
    public News queryNews(@RequestBody News news){
        return newsService.queryNews(news);
    }
}
