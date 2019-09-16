package com.igeek.dao;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

//�˻������־ò�
//����������jdbctempate
/**
* @Repository("accountDao")
* �൱�������ж���<bean id="accountDao" class="com.igeek.anntx.dao.AccountDaoImpl"/>
*/
@Repository("accountDao")
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
	
	//ע������Դ
	////@Autowired
	//private DataSource dataSource;//û��ע������Դ�ɹ�~
	////ԭ���ŵ������ϵĵ�ע���൱�ڣ��Զ�����setter�����ϼ�ע��
	//@Autowired	//�Զ���spring��������Ѱ�������ǲ������ͣ�DataSource����bean
	//public void setDataSource(DataSource dataSource){
	//	this.dataSource=dataSource;
	//}
	
	@Autowired//����ʼ��dao��ʱ�򣬻���ø÷�������ͨ��set�������β�ע������Դ
	//����������ν
	public void setDi(DataSource dataSource){
		//���ø���ķ���
		super.setDataSource(dataSource);		
	}
	
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