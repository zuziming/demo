package com.example.demo.controller;

import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @ResponseBody
    @GetMapping("/{id}")
    public News getNewsById(@PathVariable Integer id){
        return newsService.getNewsById(id);
    }
    @PostMapping
    public Integer addNews(@RequestBody News news){
        return newsService.addNews(news);
    }
    @DeleteMapping("/{id}")
    public Integer delNews(@PathVariable Integer id){
        return newsService.delNews(id);
    }
    @PutMapping("/{id}")
    public Integer updateNews(@RequestBody News news,@PathVariable Integer id){
        news.setId(id);
        return newsService.updateNews(news);
    }
    @RequestMapping
    public News queryNews(@RequestBody News news){
        return newsService.queryNews(news);
    }
}
