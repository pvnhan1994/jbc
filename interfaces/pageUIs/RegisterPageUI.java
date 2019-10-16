package pageUIs;

public class RegisterPageUI {
	public static final String BACK_BUTTON = "//a[@class='c-register__go-login']";
	public static final String TEXT_CONFIRM_UNREGISTER_EMAIL = "//p[@class='c-register__title']";
	public static final String INFOR_USER_LOGIN = "//p[@class='c-register__value']";
	public static final String TEXT_ACTIVATION_CODE = "//p[@class='activation-code']";
	
	//register by email
	//User name: [your name field is required / của bạn là bắt buộc] , [than 255 characters/nhiều hơn 255 kí tự]
	//Password: password field is required / Mật khẩu là bắt buộc] , [at least 6 characters/ít nhất 6 kí tự]
	//Capcha: Please choose / chọn hộp thoại
	public static final String DYNAMIC_VALIDATE_FIELD_REQUIRED = "//span[contains(text(),'%s') or contains(text(),'%s')]";
	
	
	public static final String REGISTER_BUTTON = "//button[@type='submit']";
	
	//Username = 'your-name' / Password = 'password'
	public static final String DYNAMIC_TEXTBOX = "//input[@name='%s']";
	
	public static final String SELECT_CAPCHA ="//span[@class='c-checkbox-square']";
	
	public static final String TERM_OF_USE ="//a[@class='c-register__confirm-rules']";

	public static final String TOAST_MSG_REGISTER_SUCCESS = "//p[@class='iziToast-message slideIn' and contains(text(),'thành công')]";
	//p[@class='iziToast-message slideIn' and (contains(text(),'thành công') or contains(text(),'successfully'))]
	public static final String TITLE_SUCCESS = "//p[(@class='c-success__title') and (contains(text(),'thành công') or contains(text(),'successfully'))]";
	public static final String EMAIL_SUCCESS = "//p[@class='c-success__value']";
	public static final String REGISTER_BTN_BACK_LOGIN = "//button[@class='o-base-button c-register__btn_back_login']";
	//.//*[@id='visibility-button']

	public static final String EYES_ICON = "//div[@class='c-password-input u-mb-0 u-mt-15']/*[2]";

	public static final String PASSWORD = "//input[@name='password']";
	
}
