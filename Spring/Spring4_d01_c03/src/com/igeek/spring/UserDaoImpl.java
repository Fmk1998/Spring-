package com.igeek.spring;

public class UserDaoImpl implements IUserDao{
	@Override
	public void findByUsernameAndPassword() {
		System.out.println("UserDaoImpl-dao�㱻������");
	}
}
