package com.igeek.ioc;

import org.springframework.stereotype.Repository;

//持久层
@Repository("customerDao")
public class CustomerDao {
	
	public void save(){
		System.out.println("CustomerDao层被调用了");
	}

}