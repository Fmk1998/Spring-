package com.igeek;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SpringTest {
	//ע����Ե�service
	@Autowired
	private IAccountService accountService;
	
	//�����˺�ת�ˣ�Tom�˺�ȡ��1000Ԫ����ŵ�Jack�˺���
	@Test
	public void testTransfer(){
		accountService.transfer("Tom", "Jack", 1000d);
		System.out.println("ת�˳ɹ���");
	}

}