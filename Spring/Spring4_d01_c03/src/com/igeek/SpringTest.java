package com.igeek;

import org.junit.Test;

public class SpringTest {
	@Test
	//ģ����ֲ�
	public void testOld(){
		IUserService userService = new UserServiceImpl();
		userService.login();
	}
}
