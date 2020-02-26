package com.yh.service;


import com.github.pagehelper.PageInfo;
import com.yh.pojo.Article;
import com.yh.pojo.Condition;

public interface ArticleService {

	PageInfo<Article> selects(int pageNum, int pageSize, Condition con);

}
