package com.igeek.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Component注解放置到类上
 * 相当于spring容器中定义：<bean id="customerService" class="com.igeek.ioc.CustomerService">
 * 其中id属性默认bean的名字是类名的小写
 * ——————————————————————————————————————————————————————
 * @Component(value="customer")//自定义bean的名字
 * 相当于spring容器中定义：<bean id="customer" class="com.igeek.ioc.CustomerService">
 * ——————————————————————————————————————————————————————
 */
//@Component(value="customer")//注释掉
@Service(value="customer")
public class CustomerService {
	//简单类型的成员变量
	@Value("Rose")//参数的值简单类型
	private String name="Jack";
	
	//在属性声明上面注入，底层自动还是生成setCustomerDao()
	//第一种： 使用@Value 结合SpEL  ---- spring3.0 后用
    //其中customerDao表示<bean>节点id的属性值
	/**第一种： 使用@Value 结合SpEL  ---- spring3.0 后用*/
	//@Value(value="#{customerDao}")
	private CustomerDao customerDao;
	
	@Value(value="#{customerDao}")
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	//保存业务方法
	public void save(){
		System.out.println("CustomerService业务层被调用了。。。");
		System.out.println("name:"+name);
		customerDao.save();
	}
}
