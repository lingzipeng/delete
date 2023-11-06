package com.itemheima.service;

import com.itemheima.pojo.Article;
import com.itemheima.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);
    //查询文章
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
