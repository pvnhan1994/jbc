package pageObjects;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.RegisterPageUI;


public class RegisterPageObject extends AbstractPage {
	WebDriver driver;

	public RegisterPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}
	public LoginPageObject clickIntoBackButton() {
		waitForElementVisible(driver, RegisterPageUI.BACK_BUTTON);
		clickToElement(driver, RegisterPageUI.BACK_BUTTON);
		return PageGeneratorManager.getLoginPage(driver);
	}
	public boolean isTextConfirmUnregisterDisplayed() {
		waitForElementVisible(driver,RegisterPageUI.TEXT_CONFIRM_UNREGISTER_EMAIL);
		return isControlDisplayed(driver, RegisterPageUI.TEXT_CONFIRM_UNREGISTER_EMAIL);
	}
	public String isEmailPhoneUserTextDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.INFOR_USER_LOGIN);
		return getTextElement(driver, RegisterPageUI.INFOR_USER_LOGIN);
	}
	public boolean isTextActivationCodeDisplayed() {
		waitForElementVisible(driver, RegisterPageUI.TEXT_ACTIVATION_CODE);
		return isControlDisplayed(driver, RegisterPageUI.TEXT_ACTIVATION_CODE);
	}
	public void clickIntoRegisterButton() {
		waitForElementVisible(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}
	public boolean isValidateFieldRequiredDisplayed(WebDriver driver, String validateENG, String validateVIE) {
		waitForElementVisible(driver, RegisterPageUI.DYNAMIC_VALIDATE_FIELD_REQUIRED, validateENG, validateVIE);
		return isControlDisplayed(driver, RegisterPageUI.DYNAMIC_VALIDATE_FIELD_REQUIRED, validateENG, validateVIE);
	}
	public void inputIntoDynamicText(WebDriver driver, String sendKeysValue, String nameTextbox) {
		waitForElementVisible(driver, RegisterPageUI.DYNAMIC_TEXTBOX, nameTextbox);
		sendkeyElement(driver, RegisterPageUI.DYNAMIC_TEXTBOX, sendKeysValue, nameTextbox);
	}

	public void clickIntoTermOfUse() {
		waitForElementVisible(driver, RegisterPageUI.TERM_OF_USE);
		clickToElement(driver, RegisterPageUI.TERM_OF_USE);
	}
	public String GetParentID(){
		return driver.getWindowHandle();
	}
	public boolean isToastMsgRegisterSuccessDisplayed(){
		waitForElementVisible(driver,RegisterPageUI.TOAST_MSG_REGISTER_SUCCESS);
		return isControlDisplayed(driver,RegisterPageUI.TOAST_MSG_REGISTER_SUCCESS);
	}
	public String getTextEmailSuccess(){
		waitForElementVisible(driver,RegisterPageUI.EMAIL_SUCCESS);
		return getTextElement(driver,RegisterPageUI.EMAIL_SUCCESS);
	}
	public boolean isTitleSuccessDisplayed(){
		waitForElementVisible(driver,RegisterPageUI.TITLE_SUCCESS);
		return isControlDisplayed(driver,RegisterPageUI.TITLE_SUCCESS);
	}
	//Register success click back to Loginpage
	public LoginPageObject clickBackToLoginPage() {
		waitForElementVisible(driver, RegisterPageUI.REGISTER_BTN_BACK_LOGIN);
		clickToElement(driver, RegisterPageUI.REGISTER_BTN_BACK_LOGIN);
		return PageGeneratorManager.getLoginPage(driver);
	}
	public void clickIntoEyeIcon(){
		waitForElementVisible(driver, RegisterPageUI.EYES_ICON);
		clickToElement(driver, RegisterPageUI.EYES_ICON);
	}

	public String getAttributeValueEye(WebDriver driver, String nameTextbox, String type) {
		waitForElementVisible(driver, RegisterPageUI.DYNAMIC_TEXTBOX,nameTextbox);
		return getAttributeValue(driver, RegisterPageUI.DYNAMIC_TEXTBOX,type,nameTextbox);
	}
}
