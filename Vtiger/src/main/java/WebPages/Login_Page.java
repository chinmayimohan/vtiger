package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Methods.UtilityMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page {
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	WebElement username_TextField;

	@FindBy(name="user_password")
	WebElement userPassword_TextField;
	
	@FindBy(id="submitButton")
	WebElement Login_Button;
	//============Actions====================
	public void enter_username() {
		UtilityMethods.enter_value(username_TextField, "admin");
	}
	public void enter_password() {
		UtilityMethods.enter_value(userPassword_TextField, "admin");
	}
	public void click_loginbutton() {
		UtilityMethods.clickElement(Login_Button);
	}
	
}
