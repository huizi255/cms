package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Article;

public interface IArticleService {
	//添加栏目
	void save(Article article);
	
	//查询栏目信息
	List<Article> list();
	
	//通过id删除栏目
	void delete(Long id);

}
