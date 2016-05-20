package com.briup.cms.web.action.manager;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;

import com.briup.cms.bean.Article;
import com.briup.cms.service.IArticleService;
import com.briup.cms.service.impl.ArticleServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private IArticleService articleService = 
            new ArticleServiceImpl();
	private String title;  //标题
	private String author; //作者
	private String content;  //内容
	private Date publisureDate;  //发布日期
	private Integer clicksTimes;  //点击次数
	private Long c_id;   //所属栏目的id
    private Long id;
	/**
	 * 文章的添加
	 * */
	@Action(value="AddArticle")
	public void AddArticle(){
		Article article = new Article();
		article.setTitle(title);
		article.setAuthor(author);
		article.setC_id(c_id);
		article.setContent(content);
		article.setPublisureDate(new Date());
		article.setClicksTimes(0);
		articleService.save(article);
	}
	/**
	 * 通过id文章的删除
	 * */
	@Action(value="delArticle")
	public void delArticle(){
		articleService.delete(id);
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getPublisureDate() {
		return publisureDate;
	}


	public void setPublisureDate(Date publisureDate) {
		this.publisureDate = publisureDate;
	}


	public Integer getClicksTimes() {
		return clicksTimes;
	}


	public void setClicksTimes(Integer clicksTimes) {
		this.clicksTimes = clicksTimes;
	}


	public Long getC_id() {
		return c_id;
	}


	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
