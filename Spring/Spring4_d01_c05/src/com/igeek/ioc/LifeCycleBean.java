package com.igeek.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//测试生命周期过程中的初始化和销毁bean
@Component("lifeCycleBean")
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("prototype")//默认是单例(singleton),更改为多例(prototype)
public class LifeCycleBean {
	
	public LifeCycleBean() {
		System.out.println("LifeCycleBean构造器调用了");
	}
	
	//初始化后自动调用方法：方法名随意，但也不能太随便，一会要配置
	@PostConstruct//初始化的方法
	public void init(){
		System.out.println("LifeCycleBean-init初始化时调用");
	}
	
	//bean销毁时调用的方法
	@PreDestroy
	public void destroy(){
		System.out.println("LifeCycleBean-destroy销毁时调用");
	}

}