package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.browser.DriverManager;
import com.utils.ReadPropertyFile;

public class HomePage extends BasePage {

	public static final SoftAssert soft = new SoftAssert();
	@FindBy(name="pf.username")
	private WebElement username;

	@FindBy(name="pf.pass")
	private WebElement pass;

	@FindBy(xpath="//button[@class='button button-submit ']")
	private WebElement loginButton;

	@FindBy(xpath="//button[@class='ut-button ut-button--type-primary ut-button--size-md']")
	private WebElement loginUnitronButton;

	@FindBy(xpath="//div [@class='notifyjs-Phonak-base notifyjs-Phonak-error']/h3")
	private WebElement errorText;

	@FindBy(xpath="//*[@class='submenu__list']/li/a[contains(text(),'Welcome')]")
	private WebElement welcomeMenuItem;

	@FindBy(css=".submenu__list li a")
	private List<WebElement> settingsMenuItem;
	
	@FindBy(xpath="//nav[@id='navDesktop']//span[text()='myServices']")
	private WebElement myserviceTab;

	@FindBy(xpath="//ul[not(contains(@class,'mobile'))]//span[text()='eScreener']/../..")
	private WebElement eScreenerSubTab;
	
	@FindBy(xpath="//a[text()='Access PhonakPro']")
	private WebElement phonakAccessPhonakproLink;
	
	@FindBy(xpath="//button[text()='Accept All Cookies']")
	private WebElement phonakAcceptAllCookiesButton;
	
	@FindBy(xpath="//div[@class='desktop-only']//a[text()='eSolutions']")
	private WebElement phonakeSolutionslink;
	
	@FindBy(xpath="//h4[@class='not-mobile-header']/..//a[text()='Hearing Screener']")
	private WebElement phonakHearingScreenerLink;
	
	@FindBy(xpath="//h3[text()='Customize your Hearing Screener']")
	private WebElement phonakCustomizeHearingScreenerLink;
	
	//span[@class='no-screeners__add']/span
	//testing the push code

	public void login(){

		String application=ReadPropertyFile.get("Application");

		if(application.equalsIgnoreCase("Phonakpro")) {

			sendkeys(username,ReadPropertyFile.get("Phonakprousername"));
			sendkeys(pass,ReadPropertyFile.get("Phonakpropassword"));
			click(loginButton);
			click(phonakAccessPhonakproLink);
			  ArrayList<String> newTab = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
			    
			    //if you traverse forward the next tab from the existing tab
			    DriverManager.getDriver().switchTo().window(newTab.get(1));
			    click(phonakAcceptAllCookiesButton);
			    jScriptClick(phonakeSolutionslink);
			    jScriptClick(phonakHearingScreenerLink);
			    jScriptClick(phonakCustomizeHearingScreenerLink);
 ArrayList<String> newTab1 = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
			    
			    //if you traverse forward the next tab from the existing tab
			    DriverManager.getDriver().switchTo().window(newTab1.get(2));
			    jScriptClick(settingsMenuItem.get(2));
			  

		}else if(application.equalsIgnoreCase("Unitron")) {
			sendkeys(username,ReadPropertyFile.get("Unitronusername"));
			sendkeys(pass,ReadPropertyFile.get("Unitronpassword"));
			click(loginUnitronButton);
			click(myserviceTab);
			click(eScreenerSubTab);
			jScriptClick(settingsMenuItem.get(2));
		}


		isVisible(welcomeMenuItem);
        
	}

	public void incorrectlogin()
	{
		String application=ReadPropertyFile.get("Application");

		if(application.equalsIgnoreCase("Phonakpro")) {

			sendkeys(username,ReadPropertyFile.get("Phonakprousername"));
			sendkeys(pass,"Phonakpropassword");
			click(loginButton);

		}else if(application.equalsIgnoreCase("Unitron")) {
			sendkeys(username,ReadPropertyFile.get("Unitronusername"));
			sendkeys(pass,"Unitronpassword");
			click(loginUnitronButton);
		}
		if (getText(errorText)=="Your username or password was incorrect.") {

		}else {
			soft.fail("Failed to showup the error message");
		}
	}



}
