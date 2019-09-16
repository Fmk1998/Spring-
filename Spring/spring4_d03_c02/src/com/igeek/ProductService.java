package com.igeek;

import org.springframework.stereotype.Service;

//没有接口的类
/**
 * @Service("productService")
 * 相当于spring容器中定义：
 * <bean id="productService" class="com.igeek.ProductService">
 */
@Service("productService")
public class ProductService {
	public void save() {
		System.out.println("商品保存了。。。。。");
		int d = 1/0;
	}

	public int find() {
		System.out.println("商品查询数量了。。。。。");
		return 99;
	}
}