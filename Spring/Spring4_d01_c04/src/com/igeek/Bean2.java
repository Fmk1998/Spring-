package com.igeek;

//1.静态工厂方法构造：用来在初始化bean2的时候，可以初始化其他的东西
public class Bean2 {
	//静态方法，用来返回对象的实例
		public static Bean2 getBean2(){
			//在做实例化的时候，可以做其他的事情，即可以在这里写初始化其他对象的代码
			//Connection conn....
			return new Bean2();
		}
}
