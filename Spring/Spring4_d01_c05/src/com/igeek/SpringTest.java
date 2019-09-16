package com.igeek;

import org.junit.Test;

public class SpringTest {
	@Test
	//Ä£Äâ±íÏÖ²ã
	public void testOld(){
		IUserService userService = new UserServiceImpl();
		userService.login();
	}
}
