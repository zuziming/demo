package com.example.demo.mapper;

import com.example.demo.entity.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsMapper {
    News getNewsById(Integer id);
    Integer addNews(News news);
    Integer delNews(Integer id);
    Integer updateNews(News news);
    News queryNews(News news);
}
