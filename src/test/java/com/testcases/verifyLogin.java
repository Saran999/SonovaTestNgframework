package com.testcases;

import com.pages.HomePage;

import org.testng.annotations.Test;

public class verifyLogin extends BaseTest{


	private HomePage homepage;

	
	@Test(description = "Verify the screener success login page") 
	public void verifyValidlogin() {                
		homepage =new HomePage();
		homepage.login();
	}
	
	/*@Test(description = "Verify the screener success Invalidlogin page")
	public void verifyIncoorectLogin() {
		homepage = new HomePage();
		homepage.incorrectlogin();
	}*/
}
