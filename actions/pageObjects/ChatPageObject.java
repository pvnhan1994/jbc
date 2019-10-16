package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.ChatPageUI;

public class ChatPageObject extends AbstractPage{
	WebDriver driver;
	public ChatPageObject(WebDriver mappingDriver) {
		driver = mappingDriver;
	}

	public String getTextUrlChatPage() {
		return getCurrentPageUrl(driver);
		
	}

	
	public void inputDataIntoMyChat(String string) {
		waitForElementVisible(driver, ChatPageUI.MY_CHAT_TEXTAREA);
		sendkeyElement(driver, ChatPageUI.MY_CHAT_TEXTAREA, string);
	}

	public boolean isAvatarUserDisplayed() {
		waitForElementVisible(driver, ChatPageUI.AVATAR_USER);
		return isControlDisplayed(driver, ChatPageUI.AVATAR_USER);
	}

	public boolean isChatTextAreaDisplayed() {
		waitForElementVisible(driver, ChatPageUI.MY_CHAT_TEXTAREA);
		return isControlDisplayed(driver, ChatPageUI.MY_CHAT_TEXTAREA);
	}

	public boolean isAddNewButtonDisplayed() {
		waitForElementVisible(driver, ChatPageUI.ADD_NEW_BUTTON);
		return isControlDisplayed(driver, ChatPageUI.ADD_NEW_BUTTON);
	}

	public boolean isChatAreaDisplayed() {
		waitForElementVisible(driver, ChatPageUI.CHAT_AREA);
		return isControlDisplayed(driver, ChatPageUI.CHAT_AREA);
	}



}
