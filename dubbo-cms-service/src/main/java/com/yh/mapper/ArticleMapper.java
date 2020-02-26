package com.yh.mapper;

import java.util.List;

import com.yh.pojo.Article;
import com.yh.pojo.Condition;



public interface ArticleMapper {

	List<Article> selects(Condition con);

}
