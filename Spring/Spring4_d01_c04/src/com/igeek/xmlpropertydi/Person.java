package com.igeek.xmlpropertydi;
/**
 * 定义人类
 * setter方法属性注入
 * 相当于new Person();
 */
public class Person {
	private Integer id;
	private String name;
	private Car car;
	//必须提供setter属性方法
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
}