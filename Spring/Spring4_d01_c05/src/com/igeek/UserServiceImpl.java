package com.igeek;

public class UserServiceImpl implements IUserService{
	public void login() {
		System.out.println("UserServiceImpl-service�㱻�����ˡ�����");
		//ʵ����dao��
		//��ͳ��ʽ
		IUserDao userDao = new UserDaoImpl();
		userDao.findByUsernameAndPassword();
	}
}
