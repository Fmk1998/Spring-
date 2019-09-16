package com.igeek.dao;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

//账户操作持久层
//技术方案：jdbctempate
/**
* @Repository("accountDao")
* 相当于容易中定义<bean id="accountDao" class="com.igeek.anntx.dao.AccountDaoImpl"/>
*/
@Repository("accountDao")
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
	
	//注入数据源
	////@Autowired
	//private DataSource dataSource;//没有注入数据源成功~
	////原理：放到属性上的的注解相当于，自动生成setter方法上加注解
	//@Autowired	//自动到spring的容器中寻找类型是参数类型（DataSource）的bean
	//public void setDataSource(DataSource dataSource){
	//	this.dataSource=dataSource;
	//}
	
	@Autowired//当初始化dao的时候，会调用该方法啊，通过set方法的形参注入数据源
	//方法名无所谓
	public void setDi(DataSource dataSource){
		//调用父类的方法
		super.setDataSource(dataSource);		
	}
	
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