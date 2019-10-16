package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.ChatPageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

public class PageGeneratorManager {

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	public static ChatPageObject getChatPage(WebDriver driver) {
		return new ChatPageObject(driver);
	}
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
}
