package com.igeek.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试
public class SpringTest {
	@Test
	//模拟表现层
	public void testOld(){
		//spring的配置方式，IOC控制反转
		//构建一个spring的工厂，使用applicationContext.xml（spring的核心配置文件）获取对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从spring工厂中使用对象的标识获取对象
		IUserService userService = (IUserService) ac.getBean("userService");
		userService.login();
	}
}
