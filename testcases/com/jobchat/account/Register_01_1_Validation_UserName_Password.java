package com.jobchat.account;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.PageGeneratorManager;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

public class Register_01_1_Validation_UserName_Password extends AbstractTest {
	WebDriver driver;

	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	String email;
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = openMultiBrowser(browserName);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		email = "binvnese" + randomDataTest() + "@yopmail.com";
	}

	@BeforeMethod
	public void inputValidEmailUnregister() {
		log.info("REGISTER - STEP 1: Input valid email Unregister into Email Field");
		loginPage.inputIntoEmailPhoneTextbox(email);

		log.info("REGISTER - STEP 2: Click into NEXT button");
		registerPage = loginPage.clickIntoNextButton();

		log.info("LOGIN - STEP 3: Verify form Register is displayed");
		verifyTrue(registerPage.isTextConfirmUnregisterDisplayed());

		log.info("LOGIN - STEP 4: Verify form Register, Email Infor is displayed");
		verifyEquals(registerPage.isEmailPhoneUserTextDisplayed(),email);
	}

	@Test
	public void TC01_DontInputDataAllField() {
		log.info("REGISTER - STEP 1: Dont input data into all the Fields");

		log.info("REGISTER - STEP 2: Click REgister button");
		registerPage.clickIntoRegisterButton();

		log.info("REGISTER - STEP 3.1: Verify validate User name is required");
		verifyTrue(registerPage.isValidateFieldRequiredDisplayed(driver, "your name field is required",
				"Tên hiển thị không được để trống"));

		log.info("REGISTER - STEP 3.2: Verify validate Password is required");
		verifyTrue(registerPage.isValidateFieldRequiredDisplayed(driver, "password field is required",
				"Mật khẩu không được để trống"));


	}

	@Test
	public void TC02_UserName_Empty() {
		log.info("REGISTER - STEP 1: Dont input data into UserName Field");

		log.info("REGISTER - STEP 2: Input valid data into Password");
		registerPage.inputIntoDynamicText(driver, "123123", "password");

		log.info("REGISTER - STEP 3: Click Register button");
		registerPage.clickIntoRegisterButton();

		log.info("REGISTER - STEP 4: Verify validate User name is required");
		verifyTrue(registerPage.isValidateFieldRequiredDisplayed(driver, "your name field is required",
				"Tên hiển thị không được để trống"));
	}

	@Test
	public void TC03_UserName_OnlySpace() {
		log.info("REGISTER - STEP 1: Input only space into UserName Field");
		registerPage.inputIntoDynamicText(driver, "    ", "displayName");

		log.info("REGISTER - STEP 2: Input valid data into Password");
		registerPage.inputIntoDynamicText(driver, "123123", "password");

		log.info("REGISTER - STEP 3: Click Register button");
		registerPage.clickIntoRegisterButton();

		log.info("REGISTER - STEP 4: Verify validate User name is required");
		verifyTrue(registerPage.isValidateFieldRequiredDisplayed(driver, "your name field is required",
				"Tên hiển thị không được để trống"));
	}

	@Test
	public void TC04_UserName_MaxLength255Chars() {
		log.info("REGISTER - STEP 1: Input data maxlength 255chars into UserName Field");
		registerPage.inputIntoDynamicText(driver,
				"dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsawe"
						+ "qe21dsadsaweqe21dsadsaweqe21dsadsaadsdsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsadsaweqe21dsa1",
				"displayName");

		log.info("REGISTER - STEP 2: Input valid data into Password");
		registerPage.inputIntoDynamicText(driver, "123123", "password");

		log.info("REGISTER - STEP 3: Click Register button");
		registerPage.clickIntoRegisterButton();

		log.info("REGISTER - STEP 4: Verify validate User name max length 255 chars");
		verifyTrue(registerPage.isValidateFieldRequiredDisplayed(driver, "than 255 characters", "Tên hiển thị không thể có nhiều hơn 255 kí tự"));
	}

	@Test
	public void TC05_Password_Empty() {
		log.info("REGISTER - STEP 1: Dont input data into Password Field");

		log.info("REGISTER - STEP 2: Input valid data into UserName Field");
		registerPage.inputIntoDynamicText(driver, "vietnhan", "displayName");

		log.info("REGISTER - STEP 3: Click Register button");
		registerPage.clickIntoRegisterButton();

		log.info("REGISTER - STEP 4: Verify validate Password is required");
		verifyTrue(registerPage.isValidateFieldRequiredDisplayed(driver, "password field is required",
				"Mật khẩu không được để trống"));
	}

	@Test
	public void TC06_Password_OnlySpace() {
		log.info("REGISTER - STEP 1: Dont input data into Password Field");
		registerPage.inputIntoDynamicText(driver, "   ", "password");

		log.info("REGISTER - STEP 2: Input valid data into UserName Field");
		registerPage.inputIntoDynamicText(driver, "vietnhan", "displayName");

		log.info("REGISTER - STEP 3: Click Register button");
		registerPage.clickIntoRegisterButton();

		log.info("REGISTER - STEP 4: Verify validate Password is required");
		verifyTrue(registerPage.isValidateFieldRequiredDisplayed(driver, "password field is required",
				"Mật khẩu không được để trống"));
	}

	@Test
	public void TC07_Password_LessThan6Chars() {
		log.info("REGISTER - STEP 1: Dont input data into Password Field");
		registerPage.inputIntoDynamicText(driver, "123", "password");

		log.info("REGISTER - STEP 2: Input valid data into UserName Field");
		registerPage.inputIntoDynamicText(driver, "vietnhan", "displayName");

		log.info("REGISTER - STEP 3: Click Register button");
		registerPage.clickIntoRegisterButton();

		log.info("REGISTER - STEP 4: Verify validate Password is required");
		verifyTrue(registerPage.isValidateFieldRequiredDisplayed(driver, "at least 6 characters", "Mật khẩu phải chứa ít nhất 6 kí tự"));
	}

	@Test
	public void TC09_Navigate_From_Register_To_Login() {
		log.info("LOGIN - STEP 1: Click for back into Login ");
		loginPage = registerPage.clickIntoBackButton();

		log.info("LOGIN - STEP 2: Verify Login Page, Animation is displayed");
		verifyTrue(loginPage.isTextAnimationDisplayed());
	}

	@Test
	public void TC10_Open_TermOfUse() throws Exception {
	    log.info("REGISTER - STEP 1: Get Parent ID");
	    String getID;
	    System.out.println(getID = registerPage.GetParentID());

		log.info("REGISTER - STEP 1: Click into Term of User");
		registerPage.clickIntoTermOfUse();
		registerPage.switchToWindowByTitle(driver, "Điều khoản sử dụng - Phần mềm quản lý công việc");
		Thread.sleep(3000);

		log.info("REGISTER - STEP 2: Verify Term opened");
		verifyEquals(driver.getTitle(), "Điều khoản sử dụng - Phần mềm quản lý công việc");
		Thread.sleep(3000);

        registerPage.closeAllWindowsWithoutParent(driver,getID);

	}
    @Test
	public void TC11_Check_Operate_View_Password () throws Exception {
		log.info("REGISTER - STEP 1: Fill password");
		registerPage.inputIntoDynamicText(driver,"123123","password");

		log.info("REGISTER - STEP 2: Click eyes icon for view Password");
		registerPage.clickIntoEyeIcon();

		log.info("REGISTER - STEP 3: Verify password is show");
		verifyEquals(registerPage.getAttributeValueEye(driver,"password","type"),"text");

		log.info("REGISTER - STEP 4: Click eyes icon for hide Password");
		registerPage.clickIntoEyeIcon();

		log.info("REGISTER - STEP 5: Verify password is hidden");
		verifyEquals(registerPage.getAttributeValueEye(driver,"password", "type"),"password");
	}
	@Test
	public void TC12_ValidData_and_Register_successfully(){
		log.info("REGISTER - STEP 1: Fill valid data into Password field");
		registerPage.inputIntoDynamicText(driver,"123123","password");

		log.info("REGISTER - STEP 2: Input valid data into UserName Field");
		registerPage.inputIntoDynamicText(driver, "vietnhan", "displayName");

		log.info("REGISTER - STEP 3: Click Register button");
		registerPage.clickIntoRegisterButton();

		log.info("REGISTER - STEP 4: Verify Toast msg register success is displayed");
		verifyTrue(registerPage.isToastMsgRegisterSuccessDisplayed());

		log.info("REGISTER - STEP 5: Verify Title success is displayed");
		verifyTrue(registerPage.isTitleSuccessDisplayed());

		log.info("REGISTER - STEP 6: Verify Email success corresponding email fill in Register");
		verifyEquals(registerPage.getTextEmailSuccess(),email);

		log.info("REGISTER - STEP 7: Click Back to Login Page");
		registerPage.clickBackToLoginPage();

		log.info("LOGIN - STEP 8: Verify Login Page, Animation is displayed");
		verifyTrue(loginPage.isTextAnimationDisplayed());

	}
	@AfterMethod
	private void refreshBrowser() {
		loginPage.refreshToPage(driver);
	}

	@AfterClass
	private void afterClass() {
		closeBrowserAndDriver(driver);
	}
}
