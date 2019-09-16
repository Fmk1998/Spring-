package com.igeek.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//目标：测试一下spring的bean的某些功能
@RunWith(SpringJUnit4ClassRunner.class)//junit整合spring的测试//立马开启了spring的注解
@ContextConfiguration(locations="classpath:applicationContext.xml")//加载核心配置文件，自动构建spring容器
public class SpringTest {
	//使用注解注入要测试的bean
	@Autowired
	private HelloService helloService;
	
	@Test
	public void testSayHello(){
		//获取spring容器
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从spring容器中获取bean对象
//		HelloService helloService=(HelloService)applicationContext.getBean("helloService");
		//测试业务功能
		helloService.sayHello();
		
	}
}