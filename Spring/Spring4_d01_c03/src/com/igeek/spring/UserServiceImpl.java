package com.igeek.spring;

//ҵ���ʵ��
public class UserServiceImpl implements IUserService{
	
	//��������
		private IUserDao userDao;
		//�ṩset������ʹ��setXxx����������Ե�ע��
		public void setUserDao(IUserDao userDao) {
			this.userDao = userDao;
		}	
		//ʹ������ע��ķ�ʽ��ȡdao
		public void login() {
			System.out.println("UserServiceImpl-service�㱻�����ˡ�����");
			userDao.findByUsernameAndPassword();
		}
		
}