package com.igeek;

import org.springframework.stereotype.Service;

//û�нӿڵ���
/**
 * @Service("productService")
 * �൱��spring�����ж��壺
 * <bean id="productService" class="com.igeek.ProductService">
 */
@Service("productService")
public class ProductService {
	public void save() {
		System.out.println("��Ʒ�����ˡ���������");
		int d = 1/0;
	}

	public int find() {
		System.out.println("��Ʒ��ѯ�����ˡ���������");
		return 99;
	}
}