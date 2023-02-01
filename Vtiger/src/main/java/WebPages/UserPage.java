package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Methods.UtilityMethods;

public class UserPage {
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),\"User \")]")
	WebElement users_link;

//============action==================
public void click_userlink() {
	UtilityMethods.clickElement(users_link);
}}