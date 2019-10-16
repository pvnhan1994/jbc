package pageUIs;

public class LoginPageUI {
	
	public static final String CLASS_LOGIN = "//div[@class='c-login']";

	public static final String EMAIL_TEXTBOX = "//input[@class='input-login']"; //1
	public static final String NEXT_BUTTON = "//button[@class='btn-next']";//2
	public static final String PASSWORD_TEXTBOX = "//input[@type='password']"; //1
	public static final String LOGIN_BUTTON = "//button[@class='btn-next']";//2
	public static final String VALIDATE_EMAIL_MSG = "//span[@class='err-account-format']";
	public static final String TOAST_MSG_INVALID = "//div[@class='iziToast-body']";
	public static final String VALIDATE_EMPTY_PASSWORD = "//span[@class='c-errors__wrap']";
	public static final String BACK_BUTTON = "//span[text()='Trở lại' or text()='Back']";
	public static final String INFOR_USERNAME = "//b[@class='user-name']";
	public static final String TEXT_ANIMATION = "//div[@class='u-inline-block c-css-typing']";
	//Dynamic 
	public static final String DYNAMIC_TEXTBOX = "//input[@class='%s']";
	public static final String DYNAMIC_BUTTON = "//button[@class='%s']";
	public static final String DYNAMIC_VALIDATE = "//span[@class='c-errors__wrap']/span[contains(text(),'%s') or contains(text(),'%s')]";
	//infor user login
	//span[contains(text(),'u không') or contains(text(),'not')]
	public static final String AVATAR_INFOR = "//img[@class='user-photo']";

	
	//Toast msg for account un-activated
	public static final String TOAST_MSG_ACCOUNT_UNACTIVATE = "//p[contains(text(),'check mail to active') or contains(text(),'chưa được kích hoạt')]";
	public static final String LINK_FOR_RESEND_VERIFY_MAIL = "//a[@id='send-email']";
	public static final String TOAST_MSG_RESEND_EMAIL_SUCCESS ="//p[@class='iziToast-message slideIn']";
	
	//Icon Social 
	public static final String ICON_GMAIL_LOGIN = "//img[@class='c-wrap-social__image c-wrap-social__google']";
	public static final String ICON_FACEBOOK_LOGIN = "//div[@class='fb-signin-button']/img";
	
	//Gmail
	public static final String GMAIL_ID_TEXTBOX = "//input[@id='identifierId']";
	public static final String GMAIL_PASSWORD_TEXTBOX = "//div[@id='password']//input";
	public static final String GMAIL_NEXT_BUTTON = "//span[text()='Tiếp theo' or text()='Next']";
	
	public static final String GMAIL_POPUP_CONFIRM_PASSWORD ="//div[@class='modal-content']";
	public static final String VALIDATE_POPUP_CONFIRM_PASSWORD ="//div[@class='iziToast-texts']";
	public static final String ICON_CLOSE_POPUP_CONFIRM_PASSWORD ="//span[@class='close']";
	public static final String TEXT_CONFIRM_LINK_ACCOUNT = "//div[@class='c-send-text']";
	//input[@class='input-login']
	//flag
	public static final String FLAG_TEXTBOX = "//input[@type='search']";
	public static final String ICON_FLAG = "//input[@class='vs__search']";
	public static final String LIST_FLAG = "//ul[@class='vs__dropdown-menu']//li//p[@class='country__name']";
	public static final String ATTRIBUTE_ICON_FLAG = "//span[@class='vs__selected']//img";
	
	
	
	
	
	
	
	//Facebook
}
