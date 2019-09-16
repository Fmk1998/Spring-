package com.igeek;

public class UserServiceImpl implements IUserService{
	public void login() {
		System.out.println("UserServiceImpl-service层被调用了。。。");
		//实例化dao层
		//传统方式
		IUserDao userDao = new UserDaoImpl();
		userDao.findByUsernameAndPassword();
	}
}
