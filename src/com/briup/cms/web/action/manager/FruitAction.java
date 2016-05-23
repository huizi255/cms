package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Fruit;
import com.briup.cms.service.IFruitService;
import com.briup.cms.service.impl.FruitServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FruitAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private IFruitService fruitService = new FruitServiceImpl();
	
	private String name;
	private Double price;
	private String place;
	private Long id;
	private Fruit fruit;
	
	@Action("AddFruit")
	public void AddFruit(){
		Fruit fruit = new Fruit(name, price, place);
		fruitService.save(fruit);
	}
	@Action("delFruit")
	public void delFruit(){
		fruitService.delete(id);
	}
	/**
	 *跳转到水果修改界面 
	 * */
		@Action(value = "toUpdFruit", results = { 
				@Result(name = "success", location = "/WEB-INF/jsp/manager/updFruit.jsp") })
		public String toUpdFruit() {
			fruit = fruitService.findById(id);
			return "success";
		}
		@Action("UpdFruit")
		public void UpdFruit(){
			Fruit fruit = new Fruit(name, price, place);
			fruit.setId(id);
			fruitService.update(fruit);
		}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

}
