package com.igeek.service;

import com.igeek.IAccountDao;
import com.igeek.IAccountService;

public class AccountServiceImpl implements IAccountService{
	
	//注入dao
	private IAccountDao accountDao;

	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	//转账操作的业务逻辑
	@Override
	public void transfer(String outName, String inName, Double money) {
		//调用dao层
		//先取出
		accountDao.out(outName, money);
		//再转入
		accountDao.in(inName, money);
	}

}
