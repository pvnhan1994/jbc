package pageObjects;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class LoginPageObject extends AbstractPage {
	WebDriver driver;

	public LoginPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public void inputIntoEmailPhoneTextbox(String email) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
	}

	public RegisterPageObject clickIntoNextButton() {
		waitForElementVisible(driver, LoginPageUI.NEXT_BUTTON);
		clickToElement(driver, LoginPageUI.NEXT_BUTTON);
		return PageGeneratorManager.getRegisterPage(driver);
	}

	public boolean isValidateMessageDisplayed() {
		waitForElementVisible(driver, LoginPageUI.VALIDATE_EMAIL_MSG);
		return isControlDisplayed(driver, LoginPageUI.VALIDATE_EMAIL_MSG);

	}

	public void inputIntoPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public ChatPageObject clickIntoLoginButton() {
		waitForElementVisible(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElementByJS(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getChatPage(driver);

	}

	public boolean isToastMsgDisplayed() {
		waitForElementVisible(driver, LoginPageUI.TOAST_MSG_INVALID);
		return isControlDisplayed(driver, LoginPageUI.TOAST_MSG_INVALID);
	}



	public void clickIntoBackButton() {
		waitForElementVisible(driver, LoginPageUI.BACK_BUTTON);
		clickToElementByJS(driver, LoginPageUI.BACK_BUTTON);
	}

	public boolean isUserNameDisplayed() {
		waitForElementVisible(driver, LoginPageUI.INFOR_USERNAME);
		return isControlDisplayed(driver, LoginPageUI.INFOR_USERNAME);
	}

	public boolean isDynamicValidate(String validateVie, String validateEng){
		waitForElementVisible(driver,LoginPageUI.DYNAMIC_VALIDATE, validateVie, validateEng);
		return isControlDisplayed(driver,LoginPageUI.DYNAMIC_VALIDATE, validateVie, validateEng);
	}

	public boolean isTextAnimationDisplayed() {
		waitForElementVisible(driver, LoginPageUI.TEXT_ANIMATION);
		return isControlDisplayed(driver, LoginPageUI.TEXT_ANIMATION);
	}

	public boolean isAvtInforDisplayed() {
		waitForElementVisible(driver, LoginPageUI.AVATAR_INFOR);
		return isControlDisplayed(driver, LoginPageUI.AVATAR_INFOR);
	}

	public void clickIntoResendEmailVerify() {
		waitForElementVisible(driver, LoginPageUI.LINK_FOR_RESEND_VERIFY_MAIL);
		clickToElementByJS(driver, LoginPageUI.LINK_FOR_RESEND_VERIFY_MAIL);
	}

	public boolean isToastMsgNotifyEmailHasntActiavatedDisplayed() {
		waitForElementVisible(driver, LoginPageUI.TOAST_MSG_ACCOUNT_UNACTIVATE);
		return isControlDisplayed(driver, LoginPageUI.TOAST_MSG_ACCOUNT_UNACTIVATE);
	}

	public boolean isToastMsgNotifyReSendEmailVerifySuccessfully() {
		waitForElementVisible(driver, LoginPageUI.TOAST_MSG_RESEND_EMAIL_SUCCESS);
		return isControlDisplayed(driver, LoginPageUI.TOAST_MSG_RESEND_EMAIL_SUCCESS);
	}

	public void clickIntoIconGmail() {
		waitForElementVisible(driver, LoginPageUI.ICON_GMAIL_LOGIN);
		clickToElement(driver, LoginPageUI.ICON_GMAIL_LOGIN);
	}

	public void inputIntoGmailTextbox(String value) {
		waitForElementVisible(driver, LoginPageUI.GMAIL_ID_TEXTBOX);
		sendkeyElement(driver, LoginPageUI.GMAIL_ID_TEXTBOX, value);
	}

	public void clickIntoNextButtonOnGmailScreen() {
		waitForElementVisible(driver, LoginPageUI.GMAIL_NEXT_BUTTON);
		clickToElement(driver, LoginPageUI.GMAIL_NEXT_BUTTON);
	}

	public void inputPasswordGmailTextbox(String value) {
		waitForElementVisible(driver, LoginPageUI.GMAIL_PASSWORD_TEXTBOX);
		sendkeyElement(driver, LoginPageUI.GMAIL_PASSWORD_TEXTBOX, value);
	}

	public boolean isEmailEnable() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		return isControlEnable(driver, LoginPageUI.EMAIL_TEXTBOX);
	}

	public boolean isPopupConfirmPasswordWhenLoginEmail() {
		waitForElementVisible(driver, LoginPageUI.GMAIL_POPUP_CONFIRM_PASSWORD);
		return isControlDisplayed(driver, LoginPageUI.GMAIL_POPUP_CONFIRM_PASSWORD);
	}

	public void inputIntoDynamicTextbox(String textAreaNameID, String valueToSendKey) {
		waitForElementVisible(driver, LoginPageUI.DYNAMIC_TEXTBOX, textAreaNameID);
		sendkeyElement(driver, LoginPageUI.DYNAMIC_TEXTBOX, valueToSendKey, textAreaNameID);
	}

	public ChatPageObject clickIntoDynamicButton(String values) {
		waitForElementVisible(driver, LoginPageUI.DYNAMIC_BUTTON, values);
		clickToElement(driver, LoginPageUI.DYNAMIC_BUTTON, values);
		return PageGeneratorManager.getChatPage(driver);
	}

	public boolean isValidatePopupConfirmPasswordDisplayed() {
		waitForElementVisible(driver, LoginPageUI.VALIDATE_POPUP_CONFIRM_PASSWORD);
		return isControlDisplayed(driver, LoginPageUI.VALIDATE_POPUP_CONFIRM_PASSWORD);
	}

	public void closePopupConfirmPassword() {
		waitForElementVisible(driver, LoginPageUI.ICON_CLOSE_POPUP_CONFIRM_PASSWORD);
		clickToElement(driver, LoginPageUI.ICON_CLOSE_POPUP_CONFIRM_PASSWORD);
	}

	public boolean isClassLoginDisplayed() {
		waitForElementVisible(driver, LoginPageUI.CLASS_LOGIN);
		return isControlDisplayed(driver, LoginPageUI.CLASS_LOGIN);
	}

	public void selectFlag(String nameFlag) throws Exception {
		waitForElementVisible(driver,LoginPageUI.ICON_FLAG,LoginPageUI.LIST_FLAG, nameFlag);
		selectItemInCustomDropdownClickByWebdriver(driver,LoginPageUI.ICON_FLAG,LoginPageUI.LIST_FLAG, nameFlag);
	}
	public String getAttributeFlag(String nameAttribute){
		waitForElementVisible(driver, LoginPageUI.ATTRIBUTE_ICON_FLAG);
		return getAttributeValue(driver,LoginPageUI.ATTRIBUTE_ICON_FLAG,nameAttribute);

	}

	public void clickToOpenListFlag() {
		waitForElementVisible(driver, LoginPageUI.ICON_FLAG);
		clickToElement(driver,LoginPageUI.ICON_FLAG);
	}

	public void inputIntoListFlag(String value) {
		waitForElementVisible(driver, LoginPageUI.ICON_FLAG);
		//sendkeyElement(driver, LoginPageUI.ICON_FLAG, value);
		sendkeyToElementByJS(driver, LoginPageUI.ICON_FLAG, value);
	}

	public void pressEnterinListFlag() {
		waitForElementVisible(driver, LoginPageUI.ICON_FLAG);
		sendKeyboardToElement(driver,LoginPageUI.ICON_FLAG, Keys.ENTER);
	}

	public boolean isTextLinkAccountDisplayed() {
		waitForElementVisible(driver, LoginPageUI.TEXT_CONFIRM_LINK_ACCOUNT);
		return isControlDisplayed(driver, LoginPageUI.TEXT_CONFIRM_LINK_ACCOUNT);
	}
}
