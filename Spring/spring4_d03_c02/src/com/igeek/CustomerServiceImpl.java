package com.igeek;

import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{

	public void save() {
		System.out.println("�ͻ������ˡ���������");
		
	}

	public int find() {
		System.out.println("�ͻ���ѯ�����ˡ���������");
		return 100;
	}
	
	//������չ����
	public void update(){
		System.out.println("�ͻ������ˡ�������������������");
	}

}