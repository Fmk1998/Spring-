package com.igeek;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringTest {
	//×¢ÈëÒª²âÊÔbean
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void testCreatetable(){
		jdbcTemplate.execute("create table test007(id int,name varchar(20))");
	}

}