package com.igeek;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//aspectj的advice通知增强类，无需实现任何接口
public class MyAspect {	
	//应用场景：释放资源 （关闭文件、 关闭数据库连接、 网络连接、 释放内存对象 ）
	//最终通知：不管是否有异常都会执行
	public void after(JoinPoint joinPoint){
		//释放数据库连接
		System.out.println("数据库的connection被释放了。。。。。,执行的方法是："+joinPoint.getSignature().getName());
	}
}