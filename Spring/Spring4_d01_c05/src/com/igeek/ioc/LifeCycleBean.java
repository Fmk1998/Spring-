package com.igeek.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//�����������ڹ����еĳ�ʼ��������bean
@Component("lifeCycleBean")
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("prototype")//Ĭ���ǵ���(singleton),����Ϊ����(prototype)
public class LifeCycleBean {
	
	public LifeCycleBean() {
		System.out.println("LifeCycleBean������������");
	}
	
	//��ʼ�����Զ����÷��������������⣬��Ҳ����̫��㣬һ��Ҫ����
	@PostConstruct//��ʼ���ķ���
	public void init(){
		System.out.println("LifeCycleBean-init��ʼ��ʱ����");
	}
	
	//bean����ʱ���õķ���
	@PreDestroy
	public void destroy(){
		System.out.println("LifeCycleBean-destroy����ʱ����");
	}

}