package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Utility_Methods.UtilityMethods;

public class HomePage {
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//img[@src=\"themes/softed/images/mainSettings.PNG\"]")
	WebElement SettingIcon;
	
	@FindBy(xpath="//a[contains(text(),'CRM')]")
	WebElement CRM_Setting;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	WebElement user_icon;
	
	@FindBy(xpath="//a[text()='Calendar']")
	WebElement calender_link;
	
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	WebElement lead_link;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	WebElement Organization_link;
	
	@FindBy(xpath="(//a[text()='Contacts'])")
	WebElement contacts_link;
	
	@FindBy(xpath="(//a[text()='Opportunities'])")
	WebElement Opportunities_link;
	
	@FindBy(xpath="(//a[text()='Products'])")
	WebElement Products_link;
	
	@FindBy(xpath="(//a[text()='Documents'])")
	WebElement Documents_link;
	
	@FindBy(xpath="(//a[text()='Email'])[1]")
	WebElement Email_link;
	
	@FindBy(xpath="(//a[text()='Trouble Tickets'])")
	WebElement TroubleTickets_link;
	
	@FindBy(xpath="(//a[text()='Dashboard'])")
	WebElement Dashboard_link;
	
	@FindBy(xpath="//a[text()='Privacy Policy']")
	WebElement PrivacyPolicy_link;
	
	@FindBy(xpath="//a[text()='Read License']")
	WebElement ReadLicense_link;
	
	@FindBy(xpath="(//img[@align='left'])")
	WebElement search_DownArrow;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement OrganizationCheckbox;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement CamPaignsCheckbox;
	
	@FindBy(xpath="(//input[@value='Apply'])")
	WebElement Apply_button;
	
	@FindBy(xpath="(//input[@title='Find'])")
	WebElement SearchButton;
	
	@FindBy(xpath="(//img[@src='themes/softed/images/btnL3Add.gif'])")
	WebElement Homeplusicon;
	
	@FindBy(xpath="//ul[@class='widgetDropDownList']//li[6]")
	WebElement select_from_widget;
	
	@FindBy(xpath="//img[@title='Change layout']")
	WebElement change_layout;
	
	
	@FindBy(id="layoutSelect")
	WebElement selectlayout;
	
	@FindBy(xpath="(//input[@class='crmbutton small cancel'])[2]")
	WebElement cancelButton;
	
	@FindBy(xpath="(//select[@id='layoutSelect'])")
	WebElement layoutSelect_button;
	
	@FindBy(xpath="(//input[@name='save'])[2]")
	WebElement save_button;
	
	@FindBy(xpath="//img[@title='Show World Clock...']")
	WebElement worldClock;
	
	@FindBy(xpath="//select[@id='clockcity']")
	WebElement clockcity;
	
	@FindBy(xpath="(//img[@src='themes/images/close.gif'])[1]")
	WebElement closeclock;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	WebElement Homebutton;
	//=========action===========
	public void click_setting(WebDriver driver) {
		UtilityMethods.mousehover(SettingIcon,driver);
	}
	
	public void click_crmSetting() {
		UtilityMethods.clickElement(CRM_Setting);
	}
	public void moveto_userIcon(WebDriver driver) {
		UtilityMethods.mousehover(user_icon,driver);
	}
	public void click_calender(WebDriver driver)	{
		UtilityMethods.clickElement(calender_link);
	}
	public void click_leads() {
		UtilityMethods.clickElement(lead_link);
	}
	public void click_Organization() {
		UtilityMethods.clickElement(Organization_link);
	}
	public void click_Contacts() {
		UtilityMethods.clickElement(contacts_link);
	}
	public void click_Opportunities() {
		UtilityMethods.clickElement(Opportunities_link);
	}
	
	public void click_Products() {
		UtilityMethods.clickElement(Products_link);
	}
	public void click_Documents() {
		UtilityMethods.clickElement(Documents_link);
	}
	public void click_Email() {
		UtilityMethods.clickElement(Email_link);
	}
	public void click_TroubleTickets() {
		UtilityMethods.clickElement(TroubleTickets_link);
	}
	public void click_Dashboard() {
		UtilityMethods.clickElement(Dashboard_link);
	}
	public void click_PrivacyPolicy() {
	UtilityMethods.clickElement(PrivacyPolicy_link);
	}
	public void click_ReadLicense_() {
		UtilityMethods.clickElement(ReadLicense_link);
	}
	public void click_search_DownArrow() {
		UtilityMethods.clickElement(search_DownArrow);
	}
	public void click_OrganizationCheckbox() {
		UtilityMethods.clickElement(OrganizationCheckbox);
	}
	public void click_CamPaigns() {
		UtilityMethods.clickElement(CamPaignsCheckbox);
	}
	public void click_Applybutton() {
		UtilityMethods.clickElement(Apply_button);
	}
	public void click_Searchbutton() {
		UtilityMethods.clickElement(SearchButton);
	}
	public void click_plusicon() {
		UtilityMethods.clickElement(Homeplusicon);
	}
	public void click_selectfromplus() {
		UtilityMethods.clickElement(Homeplusicon);
	}
	
	public void click_change_layout() {
		UtilityMethods.clickElement(change_layout);
	}
	
	public void click_selectlayout() {
		UtilityMethods.clickElement(selectlayout);
	}
	public void click_cancelbutton() {
		UtilityMethods.clickElement(cancelButton);
	}
	public void Select_layout() {
		UtilityMethods.clickElement(layoutSelect_button);
		UtilityMethods.selectByValue(layoutSelect_button, "4");
	}
	public void Select_layout_save() {
		UtilityMethods.clickElement(save_button);
	}
	 public void click_worldClock() {
			UtilityMethods.clickElement(worldClock);
		}
	
	 public void click_clockcity() {
			UtilityMethods.clickElement(clockcity);
			UtilityMethods.selectByValue(clockcity,"1");
		}
	 
	 public void click_closeclock() {
			UtilityMethods.clickElement(closeclock);
			
		}
	 public void click_Homebutton() {
			UtilityMethods.clickElement(Homebutton);
			
		}
}
	
	
