package com.igeek.dao;

public interface IAccountDao {
	//�����룩ת��
	public void in(String name,Double money);
	
	//��ȡ����ת��
	public void out(String name,Double money);
}
