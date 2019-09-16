package com.igeek;

import org.springframework.beans.factory.FactoryBean;

//4。实现FactoryBean接口的方式
//泛型：你要返回什么类型的对象，泛型就是什么
public class Bean4FactoryBean implements FactoryBean<Bean4>{

	@Override
	public Bean4 getObject() throws Exception {
		//写一些初始化数据库连接等等其他代码
		return new Bean4();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
