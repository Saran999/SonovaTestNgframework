package com.testcases;

import org.testng.annotations.Test;

import com.pages.OnlineToneTestPage;

public class VerifyPhonakProEndUserOnlineTest extends BaseTest{
	
	
	private OnlineToneTestPage onlinetonetestpage;
	
	@Test (description = "Verify the EnduseronlineTestflow") 
	public void VerifyEnduserflow(){     
		
		 onlinetonetestpage = new OnlineToneTestPage();
		 
		 onlinetonetestpage.onlineToneTest();
	}
	


	
}
