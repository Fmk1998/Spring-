package com.igeek.xmlpropertydi;
/**
 * ��������
 * setter��������ע��
 * �൱��new Person();
 */
public class Person {
	private Integer id;
	private String name;
	private Car car;
	//�����ṩsetter���Է���
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