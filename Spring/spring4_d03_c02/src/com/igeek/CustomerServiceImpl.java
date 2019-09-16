package com.igeek;

import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{

	public void save() {
		System.out.println("客户保存了。。。。。");
		
	}

	public int find() {
		System.out.println("客户查询数量了。。。。。");
		return 100;
	}
	
	//子类扩展方法
	public void update(){
		System.out.println("客户更新了。。。新增方法。。。");
	}

}