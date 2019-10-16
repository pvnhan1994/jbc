package com.jobchat.commons;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import commons.AbstractTest;
import commons.Constants;
import commons.PageGeneratorManager;
import pageObjects.ChatPageObject;
import pageObjects.LoginPageObject;

public class Commons_LoginToSystem extends AbstractTest {
	WebDriver driver;
	LoginPageObject loginPage;
	ChatPageObject chatPage;
	
	
	@Parameters("browser")
	@BeforeTest
	public void beforeClass(String browserName) {
		driver = openMultiBrowser(browserName);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		
		log.info("LOGIN - Step 1: Input valid email");
		loginPage.inputIntoEmailPhoneTextbox(Constants.LOGIN_USERNAME);
		
		log.info("LOGIN - Step 2: Click next button");
		loginPage.clickIntoNextButton();
		
		log.info("LOGIN - STep 3: Input valid password");
		loginPage.inputIntoPasswordTextbox(Constants.LOGIN_PASSWORD);
		
		log.info("LOGIN - STEP 4: Click login button");
		chatPage = loginPage.clickIntoLoginButton();
		
		log.info("LOGIN - STEP 5: Verify avt user displayed");
		verifyTrue(chatPage.isAvatarUserDisplayed());
		
		driver.quit();
	}





}

