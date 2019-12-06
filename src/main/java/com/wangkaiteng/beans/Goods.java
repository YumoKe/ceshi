package com.wangkaiteng.beans;

import java.io.Serializable;

public class Goods implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;
	
	private String sex;
	
	private Integer age;
	
	private Double price;

	public Goods() {
		super();
	}

	public Goods(Integer id, String name, String sex, Integer age, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", price=" + price + "]";
	}
	
}
