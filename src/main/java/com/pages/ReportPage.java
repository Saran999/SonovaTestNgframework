package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.browser.DriverManager;
import com.utils.ReadPropertyFile;

public class ReportPage extends BasePage {

	
	
	@FindBy(xpath="//div[@role='button']")
	private List<WebElement> reportDropDownbutton;
	
	@FindBy(xpath="//input[@type='text']")
	private List<WebElement> reportDropDownInputText;
	
	@FindBy(xpath="//li[@role='option']//span[@class='ng-star-inserted']")
	private List<WebElement> reportDropDownScreenersListOptions;
	
	@FindBy(css=".submenu__list li a")
	private List<WebElement> settingsMenuItem;
	
	@FindBy(xpath="//span[contains(@class,'icon-dropdown')]")
	private List<WebElement> dateReportDropDownbutton;
	
	@FindBy(xpath="//li[@aria-label='Today']")
	private WebElement dateReportDropDownoptionToday;
	
	@FindBy(xpath="//button[text()=' Ok ']")
	private WebElement dateOptionOkButton;
	
	
	
public void verifyreport()	
{
	// we are navigate baCK FROM ONLINE TEST PAGE TO SETTINGS - rEPORT MENU AND HANDLES THE WINDOWS TAB OPTION
	if(ReadPropertyFile.get("Application").equalsIgnoreCase("Phonakpro"))
	{
		// handling the windows tab using below code
		   
		ArrayList<String> newTab = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
	    
	    //if you traverse forward the next tab from the existing tab
	    DriverManager.getDriver().switchTo().window(newTab.get(2));
	}
	else if(ReadPropertyFile.get("Application").equalsIgnoreCase("Unitron"))
	{
		// handling the windows tab using below code
		   
		ArrayList<String> newTab = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
	    
	    //if you traverse forward the next tab from the existing tab
	    DriverManager.getDriver().switchTo().window(newTab.get(0));
	}
	
	//SELECT REPORT MENU ITEM
	jScriptClick(settingsMenuItem.get(1));
	//SELECT THE REPORT DROP DOWN
	jScriptClick(reportDropDownbutton.get(0));
	
	// ENTER THE SCREENER NAME
	sendkeys(reportDropDownInputText.get(1),"automatescreener");
	//SELECT THE FIRST SCREENER IF THE SCREENER HAS THE SAME NAME
	jScriptClick(reportDropDownScreenersListOptions.get(0));
	jScriptClick(dateReportDropDownbutton.get(1));
	jScriptClick(reportDropDownbutton.get(1));
	jScriptClick(dateReportDropDownoptionToday);
	jScriptClick(dateOptionOkButton);
}

}

