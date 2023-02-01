package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Methods.UtilityMethods;

public class ContactsPage {
	public ContactsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='Create Contact...']")
	WebElement plusicon;
	
	@FindBy(name="lastname")
	WebElement lastnametextfield;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement ClickSavebutton;

	//===============action======================
	public void click_createContact() {
	UtilityMethods.clickElement(plusicon);
	}
	
	public void enter_lastName() {
	UtilityMethods.enter_value(lastnametextfield,"max");
	}
	public void click_save() {
		UtilityMethods.clickElement(ClickSavebutton);
		}
}

