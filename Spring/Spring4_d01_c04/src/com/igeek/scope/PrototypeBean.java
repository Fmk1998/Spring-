package com.igeek.scope;

//多例bean
public class PrototypeBean {
	public PrototypeBean() {
		System.out.println("--PrototypeBean初始化了多例的");
	}
}