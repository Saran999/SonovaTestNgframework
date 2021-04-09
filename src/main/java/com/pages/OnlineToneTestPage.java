package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import com.utils.ReadPropertyFile;

public class OnlineToneTestPage extends BasePage {
	
	
	public static final SoftAssert soft = new SoftAssert();
	@FindBy(xpath="//button[@class='nav-button nav-button-next nav-button-full-width']")
		private WebElement welcomeStartBtn;

	@FindBy(xpath="//*[@aria-label='Not sure']")
	private WebElement hearingNotSureTab;
	
	@FindBy(xpath="//div[@class='toast-text']")
	private WebElement describeYourHearingLabel;
	
	@FindBy(xpath="//button[contains(@class,'nav-button')]")
	private WebElement letStartBtn;
	
	@FindBy(xpath="//div[@role='heading']")
	private WebElement describeHeadingLabel;
	
	@FindBy(xpath="//div[@aria-label=\"Headphones\"]//span[text()='Cable']")
	private WebElement headPhoneCableOpt;


	@FindBy(xpath="//button[contains(@class,'nav-button-next')]")
	private WebElement nextBtn;
	
	@FindBy(xpath="//div[@role='heading']/span")
	private WebElement describeToneTestLabel;

	@FindBy(xpath="//div[contains(@class,'player-button-play')]")
	private WebElement playBtn;
	
	@FindBy(xpath="//div[contains(@class,'player-button-plus')]")
	private WebElement plusBtn;
	
	@FindBy(xpath="//div[contains(@class,'player-button-minus')]")
	private WebElement minusBtn;
	
	//select the age 
	
	@FindBy(xpath="//div[contains(@class,'card-content')]/ul/li[6]")
	private WebElement ageSelectionBtn;
	
	@FindBy(xpath="//div[@class='toast-text']")
	private WebElement situationQuestionsAnswersLabel;
	
	@FindBy(xpath="//ul[contains(@class,'answers')]/li[4]")
	private WebElement situationbtn;
	
	@FindBy(xpath="//div[@class='card__content']//h2")
	private WebElement hearingScreenerReportLabel;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement hearingScreenerEmailtext;
	
	@FindBy(xpath="//input[@type='checkbox']/..")
	private WebElement concerntCheckBox;
	
	@FindBy(xpath="//button[contains(@class,'button')]")
	private WebElement getReportBtn;
	
	@FindBy(xpath="//div[@class='modal-title']//span")
	private WebElement reportconfirmText;
	
	@FindBy(xpath="//button[@class='swal2-confirm']")
	private WebElement reportSentBtn;
	
	@FindBy(xpath="//button[contains(@class,'accept')]")
	private List<WebElement> cookieAcceptBtn;

	
	public void onlineToneTest()
	{
		if(cookieAcceptBtn.size()>0)
		{
			click(cookieAcceptBtn.get(0));
		}
		isVisible(describeHeadingLabel);
		click(welcomeStartBtn);
		isVisible(describeHeadingLabel);
		click(hearingNotSureTab);
		click(letStartBtn);
		isVisible(describeHeadingLabel);
		click(headPhoneCableOpt);
		click(nextBtn);
		isVisible(describeHeadingLabel);
		click(nextBtn);
		isVisible(describeToneTestLabel);
		click(playBtn);
		click(plusBtn);
		click(nextBtn);
		click(playBtn);
		click(nextBtn);
		click(playBtn);
		click(nextBtn);
		isVisible(describeHeadingLabel);
		click(ageSelectionBtn);
		click(nextBtn);
		isVisible(situationQuestionsAnswersLabel);
		click(situationbtn);
		click(nextBtn);
		isVisible(situationQuestionsAnswersLabel);
		click(situationbtn);
		click(nextBtn);
		isVisible(situationQuestionsAnswersLabel);
		click(situationbtn);
		click(nextBtn);
		isVisible(situationQuestionsAnswersLabel);
		click(situationbtn);
		click(nextBtn);
		isVisible(hearingScreenerReportLabel);
		sendkeys(hearingScreenerEmailtext,"saravanan.shanmugavelu.external@sonova.com");
		click(concerntCheckBox);
		click(getReportBtn);
		isVisible(reportconfirmText);
		click(reportSentBtn);
		
		
		
	}
	
	public void onlineToneTestMainFlow()
	{
		if(cookieAcceptBtn.size()>0)
		{
			click(cookieAcceptBtn.get(0));
		}
		
		click(letStartBtn);
		//how would you descripe your hearing page
		click(hearingNotSureTab);
		//let's start button previous page(how wouold you descripe your hearing page)
		click(letStartBtn);
		//select your headphone style and put them on page visible
		isVisible(describeHeadingLabel);
		//select your headphone style and put them on page
		click(headPhoneCableOpt);
		
		click(nextBtn);
		//before we begine page volume setup instructions
		isVisible(describeHeadingLabel);
		click(nextBtn);
		//press the play button to start the tone page
		isVisible(describeToneTestLabel);
		//start to click play button
		click(playBtn);
		//click the "+" or "-" button for volume adjustment
		click(plusBtn);
		click(nextBtn);
		//click the "+" or "-" button for volume adjustment
		click(playBtn);
		click(nextBtn);
		//click the "+" or "-" button for volume adjustment
		click(playBtn);
		click(nextBtn);
		//click the "+" or "-" button for volume adjustment
		click(playBtn);
		click(nextBtn);
		//age range page
		isVisible(describeHeadingLabel);
		//age range selection button
		click(ageSelectionBtn);
		click(nextBtn);
		//situations 1 page
		isVisible(situationQuestionsAnswersLabel);
		//select any situation
		click(situationbtn);
		click(nextBtn);
		//situations 2 page
		isVisible(situationQuestionsAnswersLabel);
		//select any situation
		click(situationbtn);
		click(nextBtn);
		//situations 3 page
		isVisible(situationQuestionsAnswersLabel);
		//select any situation
		click(situationbtn);
		click(nextBtn);
		//situations 3 page
		isVisible(situationQuestionsAnswersLabel);
		//select any situation
		click(situationbtn);
		click(nextBtn);
		//Result page
		isVisible(hearingScreenerReportLabel);
		//Enter Email address
		sendkeys(hearingScreenerEmailtext,"saravanan.shanmugavelu.external@sonova.com");
		//select the consent check box
		click(concerntCheckBox);
		//Click report button
		click(getReportBtn);
		//Email sent confirmation popup message
		isVisible(reportconfirmText);
		//Click close button on confirmation popup
		click(reportSentBtn);
	}
	}

