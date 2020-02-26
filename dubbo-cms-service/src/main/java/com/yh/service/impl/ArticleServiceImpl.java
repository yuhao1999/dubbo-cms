package com.yh.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yh.mapper.ArticleMapper;
import com.yh.pojo.Article;
import com.yh.pojo.Condition;
import com.yh.service.ArticleService;

@Service(interfaceClass = ArticleService.class)
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	public PageInfo<Article> selects(int pageNum, int pageSize, Condition con) {
		
		System.err.println("-------------------------service----------");
		PageHelper.startPage(pageNum, pageSize);

		List<Article> selects = articleMapper.selects(con);
		return new PageInfo<Article>(selects);
	}
}
