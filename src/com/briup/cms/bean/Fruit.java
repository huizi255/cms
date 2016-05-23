package com.briup.cms.bean;

public class Fruit {
	private Long id;
	private String name;
	private Double price;
	private String place;
	
	public Fruit() {
		
	}
	public Fruit(String name, Double price, String place) {
		super();
		this.name = name;
		this.price = price;
		this.place = place;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
