package com.igeek;

//实例工厂:必须new工厂--》bean
public class Bean3Factory {
	//普通的方法，非静态方法
		public Bean3 getBean3(){
			//初始化实例对象返回
			return new Bean3();
		}
}
