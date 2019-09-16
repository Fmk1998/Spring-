package com.igeek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.igeek.dao.IAccountDao;

//掌握操作的业务层
/**
* @Service("accountService")
* 相当于spring容器中定义：<bean id="accountService" class="com.igeek.anntx.service.AccountServiceImpl">
*/
@Service("accountService")
@Transactional(readOnly=true)//会对该类中，所有的共有的方法，自动加上事务--全局的设置，默认是可写
public class AccountServiceImpl implements IAccountService{
	
	//注入dao
	@Autowired
	private IAccountDao accountDao;

	//转账操作的业务逻辑
	@Transactional(readOnly=false)//在方法上添加事务
	public void transfer(String outName,String inName,Double money){
		
		//调用dao层
		//先取出
		accountDao.out(outName, money);
		int d = 1/0;
		//再转入
		accountDao.in(inName, money);

	}
	
	@Transactional()//使用局部覆盖全局的
	public void findAccount(){
		System.out.println("查询帐号的信息了");
	}

}