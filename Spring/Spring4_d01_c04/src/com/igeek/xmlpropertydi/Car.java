package com.igeek.xmlpropertydi;

//目标，构造器参数注入，new car直接将参数的值直接赋值
public class Car {
	private Integer id;
	private String name;
	private Double price;
	//有参构造
	public Car(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//取值要用getter
	public Integer getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
