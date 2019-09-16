package com.igeek;

import org.junit.Test;

public class SpringTest {
	//目标：使用动态代理，对原来的方法进行功能增强,而无需更改原来的代码。
	//JDK动态代理：基于接口的（对象的类型，必须实现接口！）
	@Test
	public void testJdkProxy(){
		//target（目标对象）
		ICustomerService target = new CustomerServiceImpl();
		//实例化注入目标对象
		JdkProxyFactory jdkProxyFactory = new JdkProxyFactory(target);
		//获取Proxy Object代理对象:基于目标对象类型的接口的类型的子类型的对象
		ICustomerService proxy = (ICustomerService)jdkProxyFactory.getProxyObject();
		//调用目标对象的方法
		proxy.save();
		System.out.println("————————————————————————————————————————");
		proxy.find();
	}
}
