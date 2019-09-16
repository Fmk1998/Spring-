package com.igeek;

import org.junit.Test;

public class SpringTest {
	//Ŀ�꣺ʹ�ö�̬������ԭ���ķ������й�����ǿ,���������ԭ���Ĵ��롣
	//JDK��̬�������ڽӿڵģ���������ͣ�����ʵ�ֽӿڣ���
	@Test
	public void testJdkProxy(){
		//target��Ŀ�����
		ICustomerService target = new CustomerServiceImpl();
		//ʵ����ע��Ŀ�����
		JdkProxyFactory jdkProxyFactory = new JdkProxyFactory(target);
		//��ȡProxy Object�������:����Ŀ��������͵Ľӿڵ����͵������͵Ķ���
		ICustomerService proxy = (ICustomerService)jdkProxyFactory.getProxyObject();
		//����Ŀ�����ķ���
		proxy.save();
		System.out.println("��������������������������������������������������������������������������������");
		proxy.find();
	}
}
