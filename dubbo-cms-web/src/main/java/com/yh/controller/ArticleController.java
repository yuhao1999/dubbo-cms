package com.yh.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yh.pojo.Article;
import com.yh.pojo.Condition;
import com.yh.service.ArticleService;

@Controller
public class ArticleController {

	@Reference(version = "2.7.3",url="dubbo://127.0.0.1:20881")
	ArticleService articleService;
	
	@RequestMapping("selects")
	public String selects(Model model, @RequestParam(defaultValue = "1") int pageNum,
			@RequestParam(defaultValue = "10") int pageSize, Condition con) {
		PageInfo<Article> selects = articleService.selects(pageNum, pageSize, con);
		model.addAttribute("con", con);
		model.addAttribute("info", selects);
		
		return "list";
	}
}
