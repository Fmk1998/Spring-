package com.igeek.xmllifecycle;

//�����������ڹ����еĳ�ʼ��������bean
public class LifeCycleBean {

	//���幹�췽��
	public LifeCycleBean() {
		System.out.println("LifeCycleBean������������");
	}
	
	//��ʼ�����Զ����÷��������������⣬��Ҳ����̫��㣬һ��Ҫ����
	public void init(){
		System.out.println("LifeCycleBean-init��ʼ��ʱ����");
	}

	// ҵ�񷽷�
	public void save(){
		System.out.println("��������������LifeCycleBean���save������");
	}
	
	//bean����ʱ���õķ���
	public void destroy(){
		System.out.println("LifeCycleBean-destroy����ʱ����");
	}

}