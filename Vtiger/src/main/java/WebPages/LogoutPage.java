package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Methods.UtilityMethods;

public class LogoutPage  {
public LogoutPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[contains(text(),\"Sign Out\")]")
WebElement sign_out;


//==============action============
 public void click_signOut() {
	 UtilityMethods.clickElement(sign_out);
	
}}
