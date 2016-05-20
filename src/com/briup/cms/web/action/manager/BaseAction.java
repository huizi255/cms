package com.briup.cms.web.action.manager;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Article;
import com.briup.cms.bean.Category;
import com.briup.cms.service.IArticleService;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.ArticleServiceImpl;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private ICategoryService categoryService = 
			                  new CategoryServiceImpl();
	private IArticleService articleService = 
			        new ArticleServiceImpl();
	private List<Category> categoryList;
	private List<Article> articleList;

	/**
	 * author:辉子 后台页面跳转 * ip:port/命名空间/url
	 * http://localhost:8888/manager/toIndex.action
	 * */
	@Action(value = "toIndex", results = { @Result(name = "success", location = "/WEB-INF/jsp/manager/index.jsp") })
	public String toIndex() {
		return "success";
	}

	
	/**
	 * 添加栏目页面跳转
	 * */
	@Action(value = "toAddCategory", results = { 
			@Result(name = "success", location = "/WEB-INF/jsp/manager/AddCategory.jsp") })
	public String toAddCategory() {
		return "success";
	}

	/**
	 * 栏目管理页面跳转
	 * */
	@Action(value = "toCategoryManager", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/manager/CategoryManager.jsp") })
	public String toCategoryManager() {
		categoryList = categoryService.list();  //查询栏目信息；
		return "success";
	}

	/**
	 * 信息发布页面跳转
	 * */
	@Action(value = "toMessagePublish", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/manager/MessagePublish.jsp") })
	public String toMessagePublish() {
		categoryList = categoryService.list();
		return "success";
	}
	
	/**
	 * 信息管理页面跳转
	 * */
	@Action(value = "toMessageManager", results = {
			@Result(name = "success", location = "/WEB-INF/jsp/manager/MessageManager.jsp") })
	public String toMessageManager() {
		articleList = articleService.list();
		return "success";
	}
	
	/**
	 * 添加学生页面跳转
	 * */
	@Action(value = "toAddStudent", results = { 
			@Result(name = "success", location = "/WEB-INF/jsp/manager/AddStudent.jsp") })
	public String toAddStudent() {
		return "success";
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}


	public List<Article> getArticleList() {
		return articleList;
	}


	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}
	
}
