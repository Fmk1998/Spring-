package com.igeek;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//aspectj��advice֪ͨ��ǿ�࣬����ʵ���κνӿ�
public class MyAspect {	
	//Ӧ�ó������ͷ���Դ ���ر��ļ��� �ر����ݿ����ӡ� �������ӡ� �ͷ��ڴ���� ��
	//����֪ͨ�������Ƿ����쳣����ִ��
	public void after(JoinPoint joinPoint){
		//�ͷ����ݿ�����
		System.out.println("���ݿ��connection���ͷ��ˡ���������,ִ�еķ����ǣ�"+joinPoint.getSignature().getName());
	}
}