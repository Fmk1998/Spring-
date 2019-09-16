package com.igeek.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.igeek.IAccountDao;

//账户操作持久层
//技术方案：jdbctempate
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
	//（存入）转入
	public void in(String name,Double money){
		String sql="update t_account set money = money+ ? where name = ?";
		super.getJdbcTemplate().update(sql, money,name);
	}
	
	//（取出）转出
	public void out(String name,Double money){
		String sql="update t_account set money = money- ? where name = ?";
		super.getJdbcTemplate().update(sql, money,name);
	}
}
