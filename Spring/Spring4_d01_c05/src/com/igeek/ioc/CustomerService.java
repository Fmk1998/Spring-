package com.igeek.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Componentע����õ�����
 * �൱��spring�����ж��壺<bean id="customerService" class="com.igeek.ioc.CustomerService">
 * ����id����Ĭ��bean��������������Сд
 * ������������������������������������������������������������������������������������������������������������
 * @Component(value="customer")//�Զ���bean������
 * �൱��spring�����ж��壺<bean id="customer" class="com.igeek.ioc.CustomerService">
 * ������������������������������������������������������������������������������������������������������������
 */
//@Component(value="customer")//ע�͵�
@Service(value="customer")
public class CustomerService {
	//�����͵ĳ�Ա����
	@Value("Rose")//������ֵ������
	private String name="Jack";
	
	//��������������ע�룬�ײ��Զ���������setCustomerDao()
	//��һ�֣� ʹ��@Value ���SpEL  ---- spring3.0 ����
    //����customerDao��ʾ<bean>�ڵ�id������ֵ
	/**��һ�֣� ʹ��@Value ���SpEL  ---- spring3.0 ����*/
	//@Value(value="#{customerDao}")
	private CustomerDao customerDao;
	
	@Value(value="#{customerDao}")
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	//����ҵ�񷽷�
	public void save(){
		System.out.println("CustomerServiceҵ��㱻�����ˡ�����");
		System.out.println("name:"+name);
		customerDao.save();
	}
}
