package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Methods.UtilityMethods;

public class Leads_Page {
	public Leads_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//img[@alt='Create Lead...']")
	WebElement addlead_icon;
	
	@FindBy(xpath="//select[@name='salutationtype']")
	WebElement Salutation;
	
	@FindBy(name="lastname")
	WebElement lastname_textfield;
	
	@FindBy(name="company")
	WebElement Company_textfield;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	WebElement save_button;
	//=========action=======================
	public void click_addlead() {
		UtilityMethods.clickElement(addlead_icon);
	}
	public void click_salutation() {
		UtilityMethods.clickElement(Salutation);
	}
	public void select_salutation() {
		UtilityMethods.selectByValue(Salutation,"Ms.");
	}
	public void enter_lastname() {
		UtilityMethods.enter_value(lastname_textfield, "buntyy");
	}
	public void enter_companyname() {
		UtilityMethods.enter_value(Company_textfield, "TY");
	}
	public void click_save() {
		UtilityMethods.clickElement(save_button);
	}
		
}
