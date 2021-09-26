package com.example.demo.controller;

import com.example.demo.entity.News;
import com.example.demo.util.PageRequest;
import com.example.demo.service.NewsService;
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

    @GetMapping("/findAll")
    public Object findAll() {
        return newsService.findAll();
    }

    @PostMapping("/findPage")
    public Object findPage(@RequestBody PageRequest pageQuery) {
        return newsService.findPage(pageQuery);
    }
    //    @GetMapping
//    public News queryNews(News news, boolean type){
//        return newsService.queryNews(news);
//    }
}
