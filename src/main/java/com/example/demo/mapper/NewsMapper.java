package com.example.demo.mapper;

import com.example.demo.entity.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsMapper {
    News getNewsById(Integer id);
    Integer addNews(News news);
    Integer delNews(Integer id);
    Integer updateNews(News news);
    /**
     * 查询全部用户
     * @return
     */
    List<News> selectAll();

    /**
     * 分页查询用户
     * @return
     */
    List<News> selectPage();
}
