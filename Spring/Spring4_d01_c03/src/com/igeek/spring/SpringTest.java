package com.igeek.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//����
public class SpringTest {
	@Test
	//ģ����ֲ�
	public void testOld(){
		//spring�����÷�ʽ��IOC���Ʒ�ת
		//����һ��spring�Ĺ�����ʹ��applicationContext.xml��spring�ĺ��������ļ�����ȡ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��spring������ʹ�ö���ı�ʶ��ȡ����
		IUserService userService = (IUserService) ac.getBean("userService");
		userService.login();
	}
}
