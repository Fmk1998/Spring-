package com.igeek.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.igeek.IAccountDao;

//�˻������־ò�
//����������jdbctempate
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
	//�����룩ת��
	public void in(String name,Double money){
		String sql="update t_account set money = money+ ? where name = ?";
		super.getJdbcTemplate().update(sql, money,name);
	}
	
	//��ȡ����ת��
	public void out(String name,Double money){
		String sql="update t_account set money = money- ? where name = ?";
		super.getJdbcTemplate().update(sql, money,name);
	}
}
