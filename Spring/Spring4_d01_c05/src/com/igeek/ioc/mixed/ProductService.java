package com.igeek.ioc.mixed;

import org.springframework.beans.factory.annotation.Autowired;

//��Ʒ��ҵ���
public class ProductService {
	
	//ע��dao
	//ǿ����ע�������beanע��bean
	@Autowired
	private ProductDao productDao;
	
	//��Ʒ�ı���
	public void save(){
		System.out.println("��Ʒ�����ˣ�--ҵ���");
		//����dao��
		productDao.save();
	}

}