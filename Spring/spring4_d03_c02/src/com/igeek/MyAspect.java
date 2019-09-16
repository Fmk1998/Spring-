package com.igeek;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//advice֪ͨ����ǿ��
@Component("myAspect")//�൱��<bean id="myAspect" class="com.igeek.MyAspect"/>
@Aspect//�൱��<aop:aspect ref="myAspect">
public class MyAspect {
	//ǰ��֪ͨ
	//�൱�ڣ�<aop:before method="before" pointcut="bean(*Service)"/>
    //@Before("bean(*Service)")������ֵ���Զ�֧���������ʽ�����������
	@Before("bean(*Service)")
	public void before(JoinPoint joinPoint){
		System.out.println("=======ǰ��֪ͨ����������");
	}
	//����֪ͨ
	//target������ĳһ�����͵�bean��Ψһ������ʾֻ��CustomerServiceImpl���еķ���������֪ͨ�Ĳ���
	@AfterReturning(value="target(com.igeek.CustomerServiceImpl)",returning="returnVal")
	public void afterReturning(JoinPoint joinPoint,Object returnVal){
		System.out.println("=======����֪ͨ����������");
	}
	//����֪ͨ��
//	@Around("execution(* com.igeek*.*(..))")//Ҫ��ǿ�����������⣬���е�com.igeek���е��࣬�������еķ�������������
//	@Around("execution(* com.igeek..*.*(..))")//Ҫ��ǿ�����������⣬com.igeek���������Ӱ��������࣬�������еķ�������������
//	@Around("execution(* com.igeek..*.save(..))")//Ҫ��ǿcom.igeek�������Ӱ������е��࣬������save��β�ķ�������������
	//Ҫ��ǿcom.igeek���е�ICustomerService��������͵����з�������������
	@Around("execution(* com.igeek.ICustomerService+.*(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("---����֪ͨ-----ǰ");
		Object object = proceedingJoinPoint.proceed();
		System.out.println("---����֪ͨ-----��");
		return object;
	}
	//�׳�֪ͨ
	//�������ʽ����ǿ����com���Լ��Ӱ�������������͵�bean�����з���
	@AfterThrowing(value="within(com..*)",throwing="ex")
	public void afterThrowing(JoinPoint joinPoint ,Throwable ex){
		System.out.println("---�׳�֪ͨ������������"+"�׳����쳣��Ϣ��"+ex.getMessage());
	}
	//����֪ͨ
	//����������ice��β��bean
	@After("bean(*ice)")
	public void after(JoinPoint joinPoint){
		System.out.println("+++++++++����֪ͨ��������������");
	}
}