package com.igeek.spring;

//业务层实现
public class UserServiceImpl implements IUserService{
	
	//定义属性
		private IUserDao userDao;
		//提供set方法，使用setXxx方法完成属性的注入
		public void setUserDao(IUserDao userDao) {
			this.userDao = userDao;
		}	
		//使用依赖注入的方式获取dao
		public void login() {
			System.out.println("UserServiceImpl-service层被调用了。。。");
			userDao.findByUsernameAndPassword();
		}
		
}