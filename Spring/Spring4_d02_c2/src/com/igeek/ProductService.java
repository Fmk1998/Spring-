package com.igeek;
//没有接口的类
public class ProductService {
	public void save() {
		System.out.println("商品保存了。。。。。");
		//故意制造异常
		int d = 1/0;
	}

	public int find() {
		System.out.println("商品查询数量了。。。。。");
		return 99;
	}
}
