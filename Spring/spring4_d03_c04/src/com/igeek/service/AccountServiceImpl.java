package com.igeek.service;

import com.igeek.IAccountDao;
import com.igeek.IAccountService;

public class AccountServiceImpl implements IAccountService{
	
	//ע��dao
	private IAccountDao accountDao;

	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	//ת�˲�����ҵ���߼�
	@Override
	public void transfer(String outName, String inName, Double money) {
		//����dao��
		//��ȡ��
		accountDao.out(outName, money);
		//��ת��
		accountDao.in(inName, money);
	}

}
