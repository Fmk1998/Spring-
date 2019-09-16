package com.igeek.ioc;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	public void test(){
		//spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取bean
		CustomerService customerService=(CustomerService) applicationContext.getBean("customer");
		customerService.save();
		
	}
	@Test
	public void testLifeCycle() throws Exception{
		//spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//单例；此时初始化的方法已经被调用
		LifeCycleBean lifeCycleBean = (LifeCycleBean)applicationContext.getBean("lifeCycleBean");
        //方案一：
        //((ClassPathXmlApplicationContext)applicationContext).close();
        //方案二：
		//反射的机制调用close方法。
		//接口只是引用了一个对象。对象本身有这个方法。
		//目标：通过接口引用，调用对象本来的拥有的方法
		//1。获取对象具体类的某个方法:参数1方法名，参数2：方法里面的参数类型
		Method method = applicationContext.getClass().getMethod("close");
		//参数1：拥有该方法的对象的名字,参数2：方法里面的参数的值
		method.invoke(applicationContext);
		
	}
	@Test
	public void testLifeCycleScope() throws Exception{
		//spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//单例；此时初始化的方法已经被调用
		LifeCycleBean lifeCycleBean1 = (LifeCycleBean)applicationContext.getBean("lifeCycleBean");
		LifeCycleBean lifeCycleBean2 = (LifeCycleBean)applicationContext.getBean("lifeCycleBean");
		System.out.println(lifeCycleBean1);
		System.out.println(lifeCycleBean2);
	}
}
