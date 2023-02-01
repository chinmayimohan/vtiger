package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Methods.UtilityMethods;

public class Calender_Page {
	public Calender_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//img[contains(@title,'Open Calendar...')])[2]")
	WebElement calender_widget;
	
	@FindBy(xpath="//a[text()='4']")
	WebElement changeDate;

	//===============action======================
	public void click_calenderWidget() {
	UtilityMethods.clickElement(calender_widget);
	}
	
	public void change_date() {
	UtilityMethods.clickElement(changeDate);
	}
}
