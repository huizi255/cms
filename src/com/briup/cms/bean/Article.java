package com.briup.cms.bean;

import java.util.Date;

public class Article {
	private Long id;     //编号
	private String title;  //标题
	private String author; //作者
	private String content;  //内容
	private Date publisureDate;  //发布日期
	private Integer clicksTimes;  //点击次数
	private Long c_id;   //所属栏目的id
	
	public Article() {
		
	}

	public Article(String title, String author, String content,
			Date publisureDate, Integer clicksTimes, Long c_id) {
		super();
		this.title = title;
		this.author = author;
		this.content = content;
		this.publisureDate = publisureDate;
		this.clicksTimes = clicksTimes;
		this.c_id = c_id;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
