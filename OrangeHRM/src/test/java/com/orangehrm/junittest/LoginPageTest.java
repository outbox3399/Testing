package com.orangehrm.junittest;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.orangehrm.java.Base;
import com.orangehrm.java.LoginPage;

public class LoginPageTest {

	public static Base base;
	public static LoginPage loginPage;

	@Before
	public void setUp() throws InterruptedException {
		base = new Base();
		loginPage = new LoginPage();
	}

	@AfterClass
	public static void tearDown() {
		Base.closeApp();
	}

	@Test
	public void successfulLogin() {
		loginPage.login();
	}

}
