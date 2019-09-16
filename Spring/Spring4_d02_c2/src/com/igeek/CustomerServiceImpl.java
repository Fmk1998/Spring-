package com.igeek;

public class CustomerServiceImpl implements ICustomerService{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("客户保存了。。。。。");
	}

	@Override
	public int find() {
		// TODO Auto-generated method stub
		System.out.println("客户查询数量了。。。。。");
		return 100;
	}

}
