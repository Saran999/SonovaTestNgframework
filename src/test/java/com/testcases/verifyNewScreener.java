package com.testcases;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.OnlineToneTestPage;
import com.pages.ReportPage;
import com.pages.ScreenerPage;

public class verifyNewScreener extends BaseTest {

	private HomePage homepage;
	private ScreenerPage screenpage;
	private OnlineToneTestPage onlinetonetestpage;
	private ReportPage reportpage;
	@Test(description = "Verify the newly created screener") 
	public void verifyCreatingOfNewScreener() throws InterruptedException
	{
		 homepage = new HomePage();
		 screenpage = new ScreenerPage();
		  onlinetonetestpage =new OnlineToneTestPage();
		         reportpage = new ReportPage();
		 
		 homepage.login();
		 screenpage.createNewScreener();
		 onlinetonetestpage.onlineToneTestMainFlow();
		 reportpage.verifyreport();
		 
		 
	}

}
