package com.igeek.xmlpropertydi;

//Ŀ�꣬����������ע�룬new carֱ�ӽ�������ֱֵ�Ӹ�ֵ
public class Car {
	private Integer id;
	private String name;
	private Double price;
	//�вι���
	public Car(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//ȡֵҪ��getter
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
