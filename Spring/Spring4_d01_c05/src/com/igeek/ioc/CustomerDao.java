package com.igeek.ioc;

import org.springframework.stereotype.Repository;

//�־ò�
@Repository("customerDao")
public class CustomerDao {
	
	public void save(){
		System.out.println("CustomerDao�㱻������");
	}

}