package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.browser.DriverManager;
import com.utils.ReadPropertyFile;

public class ScreenerPage extends BasePage {

	@FindBy(xpath="//div[@class='screener-actions']/span")
	private WebElement createNewScreenerlink;


	@FindBy(xpath="//span[@class='no-screeners__add']/span")
	private WebElement createNewScreenerPlusIcon;


	@FindBy(xpath="//input[@placeholder='Add a screener name']")
	private WebElement screenerNameInputText;

	@FindBy(xpath="//input[@placeholder='Add a notification email']")
	private WebElement screenerEmailText;

	@FindBy(xpath="//*[contains(@placeholder ,'Add your privacy')]")
	private WebElement screenerPrivacyPolicyText;

	@FindBy(xpath="//button[contains(@class ,'progress-button')]")
	private WebElement createNewScreenerButton;

	@FindBy(xpath="//button[contains(@class ,'btn--cancel')]")
	private WebElement createNewScreenerCancelButton;

	@FindBy(xpath="//a[text()=' Settings ']")
	private WebElement settingslink;

	@FindBy(xpath="//h5[text()='Tones / Workflow']/../following-sibling::div//div[@role='button']")
	private WebElement TonesWorkflowdropdownicon;

	
	@FindBy(xpath="//span[text()='2 Tones each ear separate (Audiogram Prediction Model)']")
	private WebElement phonakTonesWorkflowdropdownOption;
	
	@FindBy(xpath="//h5[text()='Tones / Workflow']/../following-sibling::div//li[@aria-label='Audiogram Prediction Model (4 tones)']")
	private WebElement TonesWorkflowdropdownOption4;

	@FindBy(xpath="//button[text()=' Delete screener ']")
	private WebElement DeleteScreenerLink;

	//button[text()=' Delete screener ']

	@FindBy(xpath="//label[text()='Delete screener']")
	private WebElement DeleteScreenerCheckbox;

	//label[text()='Delete screener']

	@FindBy(xpath="//label[text()='Delete related test-results']")
	private WebElement DeleteTestResultCheckbox;

	//label[text()='Delete related test-results']

	@FindBy(xpath="//label[text()='Delete related, custom design settings']")
	private WebElement DeleteDesignSettingsCheckbox;

	//label[text()='Delete related, custom design settings']

	@FindBy(xpath="//button[text()=' Yes, delete ']")
	private WebElement YesDeletebutton;

	//button[text()=' Yes, delete ']

	@FindBy(xpath="//button[text()='  Cancel  ']")
	private WebElement Cancelbutton;

	@FindBy(xpath="//label[contains(text(),'page before result page')]")
	private WebElement SelectGetreportCheckbox;

	@FindBy(xpath="//label[text()='Enable custom results text']")
	private WebElement EnableCustomResultCheckbox;
	//label[text()='Enable custom results text']

	@FindBy(xpath="//label[text()='Good hearing']/following-sibling::textarea")
	private WebElement GoodhearingInputtext;

	@FindBy(xpath="//label[text()='Fair hearing']/following-sibling::textarea")
	private WebElement FairhearingInputtext;

	@FindBy(xpath="//label[text()='Fair inconclusive hearing']/following-sibling::textarea")
	private WebElement FairinconclusivehearingInputtext;

	@FindBy(xpath="//label[text()='Poor hearing']/following-sibling::textarea")
	private WebElement PoorhearingInputtext;

	@FindBy(xpath="//label[text()='Enable custom titles text']")
	private WebElement EnableCustomTitlesCheckbox;

	@FindBy(xpath="//label[text()='Good hearing']/following-sibling::input")
	private WebElement GoodhearingTitleInputtext;

	@FindBy(xpath="//label[text()='Fair hearing']/following-sibling::input")
	private WebElement FairhearingTitleInputtext;

	@FindBy(xpath="//label[text()='Fair inconclusive hearing']/following-sibling::input")
	private WebElement FairinconclusivehearingTitleInputtext;

	@FindBy(xpath="//label[text()='Poor hearing']/following-sibling::input")
	private WebElement PoorhearingTitleInputtext;

	@FindBy(xpath="//label[text()='Use context dependent CTAs']")
	private WebElement CTACheckbox;

	@FindBy(xpath="//div[text()='Good']/../../../a")
	private WebElement CTAGOODTabbutton;

	@FindBy(xpath="//div[text()='Fair']/../../../a")
	private WebElement CTAFairTabbutton;

	@FindBy(xpath="//div[text()='Poor']/../../../a")
	private WebElement CTAPoorTabbutton;

	@FindBy(xpath="//div[text()='Fair Inconclusive']/../../../a")
	private WebElement CTAFairinconclusiveTabbutton;

	@FindBy(xpath="//div[@aria-hidden='false']//label[text()='Position 1:']/following-sibling::div//div[@role='button']")
	private WebElement Positon1DropDown;

	@FindBy(xpath="//div[@aria-hidden='false']//label[text()='Position 2:']/following-sibling::div//div[@role='button']")
	private WebElement Positon2DropDown;

	@FindBy(xpath="//div[@aria-hidden='false']//label[text()='Position 3:']/following-sibling::div//div[@role='button']")
	private WebElement Positon3DropDown;

	@FindBy(xpath="//div[@aria-hidden='false']//label[text()='Position 4:']/following-sibling::div//div[@role='button']")
	private WebElement Positon4DropDown;

	@FindBy(xpath="//p-dropdownitem/li/span[text()='Make phonecall']")
	private WebElement MakePhoncallDropDownOption;

	@FindBy(xpath="//label[text()='Button text (e.g. Call us)']/preceding-sibling::input")
	private List<WebElement> CallusInputtext;

	@FindBy(xpath="//label[contains(text(),'Phone')]/preceding-sibling::input")
	private List<WebElement> CallusInputPhonetext;

	@FindBy(xpath="//p-dropdownitem/li/span[text()='Send email']")
	private WebElement sendEmailDropDownOption;

	@FindBy(xpath="//label[text()='Button text (e.g. Email us)']/preceding-sibling::input")
	private List<WebElement> emailUsInputtext;

	@FindBy(xpath="//label[contains(text(),'Email address')]/preceding-sibling::input")
	private List<WebElement> emailUsInputEmailtext;

	@FindBy(xpath="//p-dropdownitem/li/span[text()='Link to URL']")
	private WebElement linkTOURLDropDownOption;


	@FindBy(xpath="//label[text()='Button text (e.g. Contact us)']/preceding-sibling::input")
	private List<WebElement> linkToUrlInputtext;

	@FindBy(xpath="//label[contains(text(),'Link address')]/preceding-sibling::input")
	private List<WebElement> linkToUrlInputEmailtext;

	@FindBy(xpath="//p-dropdownitem/li/span[text()='Request callback']")
	private WebElement requestCallBackDropDownOption;

	@FindBy(xpath="//label[text()='Both']/preceding-sibling::div/div[@role='radio']")
	private WebElement notificationBothRadioCheckbox;
	
	@FindBy(xpath="//input[@id='webhookUrl']")
	private WebElement webhookURLText;
	
	@FindBy(xpath="//div[text()=' Test configuration ']")
	private WebElement testConfigurationLink;
	
	@FindBy(xpath="//p[text()=' Successful ']")
	private WebElement successMessage;
	
	@FindBy(xpath="//input[@id='companyName']")
	private WebElement companyNametext;
	
	@FindBy(xpath="//span[text()='Preview']")
	private WebElement companyNamePreview;
	
	@FindBy(xpath="//button[text()=' Close ']")
	private WebElement closePreviewButton;
	
	
	@FindBy(xpath="//label[text()='Enable referral parameters']")
	private WebElement enableReferralParameterCheckbox;
	
	@FindBy(xpath="//button/div[text()='Save screener']")
	private WebElement saveScreenerButton;
	
	@FindBy(xpath="//span[text()=' Edit ']")
	private WebElement designBrandingEditLink;
	
	@FindBy(xpath="//span[@class='ui-button-text ui-clickable']")
	private List<WebElement> logoChangeLink;
	
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement cancelEditButton;
	
	@FindBy(xpath="//p[text()='Image set']/..//div[@role='button']")
	private WebElement imageSetDropDown;
	
	@FindBy(xpath="//span[text()='Set6']/..")
	private WebElement selectImageSet6Option;
	
	@FindBy(xpath="//div[text()='Save changes']/..")
	private WebElement saveChangesButton;
	
	@FindBy(xpath="//a[text()='Screener preview']")
	private WebElement screenerPreviewlink;
	
	@FindBy(xpath="//button[text()=' Continue editing ']")
	private List<WebElement> continueEditingPopupWindow;
	
	
	
	
	public void createNewScreener() throws InterruptedException
	{
		jScriptClick(createNewScreenerPlusIcon);
		sendkeys(screenerNameInputText,"automatescreener");
		sendkeys(screenerEmailText,"saravanan.shanmugavelu.external@sonova.com");
		sendkeys(screenerPrivacyPolicyText,"stäfa,zürich");
		jScriptClick(createNewScreenerButton);
		//jScriptClick(createNewScreenerCancelButton);
		jScriptClick(TonesWorkflowdropdownicon);
		//if we choose application as phonakpro
		if(ReadPropertyFile.get("Application").equalsIgnoreCase("Phonakpro"))
		{
		jScriptClick(phonakTonesWorkflowdropdownOption);
		}
		else if(ReadPropertyFile.get("Application").equalsIgnoreCase("Unitron"))
		{
		jScriptClick(TonesWorkflowdropdownOption4);
		}

		jScriptClick(SelectGetreportCheckbox);
		jScriptClick(EnableCustomResultCheckbox);
		sendkeys(GoodhearingInputtext,"GoodhearingautomationTest");
		sendkeys(FairhearingInputtext,"FairhearingautomationTest");
		sendkeys(FairinconclusivehearingInputtext,"FairinconclusivehearingautomationTest");
		sendkeys(PoorhearingInputtext,"PoorhearingautomationTest");

		jScriptClick(EnableCustomTitlesCheckbox);
		sendkeys(GoodhearingTitleInputtext,"GoodhearingautomationTitleTest");
		sendkeys(FairhearingTitleInputtext,"FairhearingautomationTitleTest");
		sendkeys(FairinconclusivehearingTitleInputtext,"FairinconclusivehearingautomationTitleTest");
		sendkeys(PoorhearingTitleInputtext,"PoorhearingautomationTitleTest");
		
		/*
		jScriptClick(CTACheckbox);

		
		
   		// selecting Good Tab
		jScriptClick(CTAGOODTabbutton);
		// selecting position1 with make call option
		jScriptClick(Positon1DropDown);
		jScriptClick(MakePhoncallDropDownOption);
		sendkeys(CallusInputtext.get(0),"Call Us");
		sendkeys(CallusInputPhonetext.get(0),"+41 745394345");
		// selecting position2 with Send Email option
		jScriptClick(Positon2DropDown);
		jScriptClick(sendEmailDropDownOption);
		sendkeys(emailUsInputtext.get(0),"Email Us");
		sendkeys(emailUsInputEmailtext.get(0),"saravanan.shanmugavelu.external@sonova.com");
		// selecting position3 with Link to URL  option
		jScriptClick(Positon3DropDown);
		jScriptClick(linkTOURLDropDownOption);
		sendkeys(linkToUrlInputtext.get(0),"Contact Us");
		sendkeys(linkToUrlInputEmailtext.get(0),"https://www.google.com");
		// selecting position4 with Call Back option
		jScriptClick(Positon4DropDown);
		jScriptClick(requestCallBackDropDownOption);

		//selecting the Fairtab Tab
		jScriptClick(CTAFairTabbutton);
		// selecting position1 with make call option
		jScriptClick(Positon1DropDown);
		jScriptClick(MakePhoncallDropDownOption);
		sendkeys(CallusInputtext.get(1),"Call Us");
		sendkeys(CallusInputPhonetext.get(1),"+41 745394345");
		// selecting position2 with Send Email option
		jScriptClick(Positon2DropDown);
		jScriptClick(sendEmailDropDownOption);
		sendkeys(emailUsInputtext.get(1),"Email Us");
		sendkeys(emailUsInputEmailtext.get(1),"saravanan.shanmugavelu.external@sonova.com");
		// selecting position3 with Link to URL  option
		jScriptClick(Positon3DropDown);
		jScriptClick(linkTOURLDropDownOption);
		sendkeys(linkToUrlInputtext.get(1),"Contact Us");
		sendkeys(linkToUrlInputEmailtext.get(1),"https://www.google.com");
		// selecting position4 with Call Back option
		jScriptClick(Positon4DropDown);
		jScriptClick(requestCallBackDropDownOption);

		//selecting the POORtab and enter the details
		jScriptClick(CTAPoorTabbutton);
		// selecting position1 with make call option
		jScriptClick(Positon1DropDown);
		jScriptClick(MakePhoncallDropDownOption);
		sendkeys(CallusInputtext.get(2),"Call Us");
		sendkeys(CallusInputPhonetext.get(2),"+41 745394345");
		// selecting position2 with Send Email option
		jScriptClick(Positon2DropDown);
		jScriptClick(sendEmailDropDownOption);
		sendkeys(emailUsInputtext.get(2),"Email Us");
		sendkeys(emailUsInputEmailtext.get(2),"saravanan.shanmugavelu.external@sonova.com");
		// selecting position3 with Link to URL  option
		jScriptClick(Positon3DropDown);
		jScriptClick(linkTOURLDropDownOption);
		sendkeys(linkToUrlInputtext.get(2),"Contact Us");
		sendkeys(linkToUrlInputEmailtext.get(2),"https://www.google.com");
		// selecting position4 with Call Back option
		jScriptClick(Positon4DropDown);
		jScriptClick(requestCallBackDropDownOption);


		//selecting the Fairinconclusivetab and enter the details
		jScriptClick(CTAFairinconclusiveTabbutton);
		jScriptClick(Positon1DropDown);
		jScriptClick(MakePhoncallDropDownOption);
		sendkeys(CallusInputtext.get(3),"Call Us");
		sendkeys(CallusInputPhonetext.get(3),"+41 745394345");
		// selecting position2 with Send Email option
		jScriptClick(Positon2DropDown);
		jScriptClick(sendEmailDropDownOption);
		sendkeys(emailUsInputtext.get(3),"Email Us");
		sendkeys(emailUsInputEmailtext.get(3),"saravanan.shanmugavelu.external@sonova.com");
		// selecting position3 with Link to URL  option
		jScriptClick(Positon3DropDown);
		jScriptClick(linkTOURLDropDownOption);
		sendkeys(linkToUrlInputtext.get(3),"Contact Us");
		sendkeys(linkToUrlInputEmailtext.get(3),"https://www.google.com");
		// selecting position4 with Call Back option
		jScriptClick(Positon4DropDown);
		jScriptClick(requestCallBackDropDownOption);
		*/
         // select notification option as Both checkbox
		jScriptClick(notificationBothRadioCheckbox);
		
		// enter the webhook URL
		sendkeys(webhookURLText,"https://features-screener-webhooks-v3-dev.azurewebsites.net/api/SlackHandler?code=8n94o1H6natCbe5FgyJUBNaWvOaH8bkHJTgtQEsSanjHCgpiKIK8vA==");
		//click the webhook configuration link
		jScriptClick(testConfigurationLink);
		//validating the success message
		isVisible(successMessage);
		//enter company name
		sendkeys(companyNametext,"selenium");
		//Clicking the Preview the company name 
		jScriptClick(companyNamePreview);
		//Close company name Preview button
		jScriptClick(closePreviewButton);
		//select the Referral parameter
		jScriptClick(enableReferralParameterCheckbox);
		
		jScriptClick(saveScreenerButton);
		if(continueEditingPopupWindow.size()>=1)
		{
			jScriptClick(continueEditingPopupWindow.get(0));
		}
		
		jScriptClick(designBrandingEditLink);
		DriverManager.getDriver().switchTo().parentFrame();
		//DriverManager.getDriver().switchTo().frame(0);
		
		//isVisible(logoChangeLink);
	
		
		
		
		jScriptClick(imageSetDropDown);
		jScriptClick(selectImageSet6Option);
		jScriptClick(saveChangesButton);
		jScriptClick(screenerPreviewlink);
		
		if(ReadPropertyFile.get("Application").equalsIgnoreCase("Phonakpro"))
		{
			// handling the windows tab using below code
			   
			ArrayList<String> newTab = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		    
		    //if you traverse forward the next tab from the existing tab
		    DriverManager.getDriver().switchTo().window(newTab.get(3));
		}
		else if(ReadPropertyFile.get("Application").equalsIgnoreCase("Unitron"))
		{
			// handling the windows tab using below code
			   
			ArrayList<String> newTab = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		    
		    //if you traverse forward the next tab from the existing tab
		    DriverManager.getDriver().switchTo().window(newTab.get(1));
		}
	
	  
	    
	    //if you traverse backward the next tab from the existing tab
	    //DriverManager.getDriver().switchTo().window(newTab.get(0));
	    
	    
	    
		//C:\Users\99sshanmugav\Downloads
		
		
		//jScriptClick(cancelEditButton);
		/*jScriptClick(DeleteScreenerLink);
		jScriptClick(DeleteScreenerCheckbox);
		jScriptClick(DeleteTestResultCheckbox);
		jScriptClick(DeleteDesignSettingsCheckbox);
		jScriptClick(YesDeletebutton);*/
	}


}


