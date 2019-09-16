package com.igeek;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateTest {
	@Test
	public void test(){
		//Ŀ�꣺ʹ��jdbctemplateִ��һ��sql
		//1.��������Դ
		//spring������һ������Դ
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///igeekspring");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		//2.����jdbctemplateʵ��
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//��ͬ��
//		jdbcTemplate.setDataSource(dataSource)
		
		//3.ִ��sql��������test001
		jdbcTemplate.execute("create table test001(id int,name varchar(20))");
		
	}
}
