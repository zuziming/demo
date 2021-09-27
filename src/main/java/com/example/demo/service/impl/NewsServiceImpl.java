package com.example.demo.service.impl;

import com.example.demo.entity.News;
import com.example.demo.util.PageRequest;
import com.example.demo.mapper.NewsMapper;
import com.example.demo.service.NewsService;
import com.example.demo.util.PageResult;
import com.example.demo.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<News> findAll() {
        return newsMapper.selectAll();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    @Override
    public List<News> sqlPage(News page) {
        return newsMapper.sqlPage(page.pageNo,page.pageSize);
    }

    @Override
    public List<News> findConditions(News title) {
        return newsMapper.findConditions(title);
    }

    @Override
    public List<News> sqlPage(Integer pageNo, Integer pageSize) {
        return newsMapper.sqlPage(pageNo,pageSize);
    }

    /**
     * 调用分页插件完成分页
     * @param
     * @return
     */
    private PageInfo<News> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<News> sysMenus = newsMapper.selectPage();
        return new PageInfo<News>(sysMenus);
    }


}
