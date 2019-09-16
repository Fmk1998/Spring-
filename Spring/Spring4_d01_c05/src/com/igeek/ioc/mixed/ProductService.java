package com.igeek.ioc.mixed;

import org.springframework.beans.factory.annotation.Autowired;

//产品的业务层
public class ProductService {
	
	//注入dao
	//强调：注入必须是bean注入bean
	@Autowired
	private ProductDao productDao;
	
	//产品的保存
	public void save(){
		System.out.println("产品保存了，--业务层");
		//调用dao层
		productDao.save();
	}

}