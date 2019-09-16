package com.igeek.ioc.mixed;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void test(){
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-mixed.xml");
		//��ȡbean
		ProductService productService=(ProductService) applicationContext.getBean("productService");
		productService.save();
		
	}
	
}