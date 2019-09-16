package com.igeek;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.igeek.scope.PrototypeBean;
import com.igeek.scope.SingletonBean;
import com.igeek.xmllifecycle.LifeCycleBean;
import com.igeek.xmlpropertydi.Car;
import com.igeek.xmlpropertydi.CollectionBean;
import com.igeek.xmlpropertydi.Person;

public class SpringTest {

	@Test
	public void testCar(){
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡcar
		Car car =(Car) applicationContext.getBean("car");
	    System.out.println(car);
	}
	@Test
	public void testPerson(){
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");		
		//��ȡ��
		Person person=(Person)applicationContext.getBean("person");
		System.out.println(person);
	}
	@Test
	public void testPerson2(){
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person2=(Person)applicationContext.getBean("person2");
		System.out.println(person2);
	}
	@Test
	public void testPerson3(){
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person3=(Person)applicationContext.getBean("person3");
		System.out.println(person3);
	}
	@Test
	public void testPerson4(){
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person4=(Person)applicationContext.getBean("person4");
		System.out.println(person4);
	}
	@Test
	public void test5(){
		//spring����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean collectionBean=(CollectionBean)applicationContext.getBean("collectionBean");
		System.out.println(collectionBean);
	}
}
