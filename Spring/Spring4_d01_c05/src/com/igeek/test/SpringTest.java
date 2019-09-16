package com.igeek.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//Ŀ�꣺����һ��spring��bean��ĳЩ����
@RunWith(SpringJUnit4ClassRunner.class)//junit����spring�Ĳ���//��������spring��ע��
@ContextConfiguration(locations="classpath:applicationContext.xml")//���غ��������ļ����Զ�����spring����
public class SpringTest {
	//ʹ��ע��ע��Ҫ���Ե�bean
	@Autowired
	private HelloService helloService;
	
	@Test
	public void testSayHello(){
		//��ȡspring����
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��spring�����л�ȡbean����
//		HelloService helloService=(HelloService)applicationContext.getBean("helloService");
		//����ҵ����
		helloService.sayHello();
		
	}
}