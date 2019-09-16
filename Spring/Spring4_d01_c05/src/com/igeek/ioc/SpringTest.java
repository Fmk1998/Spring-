package com.igeek.ioc;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	public void test(){
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡbean
		CustomerService customerService=(CustomerService) applicationContext.getBean("customer");
		customerService.save();
		
	}
	@Test
	public void testLifeCycle() throws Exception{
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������ʱ��ʼ���ķ����Ѿ�������
		LifeCycleBean lifeCycleBean = (LifeCycleBean)applicationContext.getBean("lifeCycleBean");
        //����һ��
        //((ClassPathXmlApplicationContext)applicationContext).close();
        //��������
		//����Ļ��Ƶ���close������
		//�ӿ�ֻ��������һ�����󡣶����������������
		//Ŀ�꣺ͨ���ӿ����ã����ö�������ӵ�еķ���
		//1����ȡ����������ĳ������:����1������������2����������Ĳ�������
		Method method = applicationContext.getClass().getMethod("close");
		//����1��ӵ�и÷����Ķ��������,����2����������Ĳ�����ֵ
		method.invoke(applicationContext);
		
	}
	@Test
	public void testLifeCycleScope() throws Exception{
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������ʱ��ʼ���ķ����Ѿ�������
		LifeCycleBean lifeCycleBean1 = (LifeCycleBean)applicationContext.getBean("lifeCycleBean");
		LifeCycleBean lifeCycleBean2 = (LifeCycleBean)applicationContext.getBean("lifeCycleBean");
		System.out.println(lifeCycleBean1);
		System.out.println(lifeCycleBean2);
	}
}
