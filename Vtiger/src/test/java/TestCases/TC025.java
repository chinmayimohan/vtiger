package TestCases;

import org.testng.annotations.Test;

import Utility_Methods.BaseTest;
import WebPages.ContactsPage;
import WebPages.HomePage;
import WebPages.Login_Page;
import WebPages.LogoutPage;

public class TC025 extends BaseTest{
	@Test
public void sys25() {
		
		Login_Page login=new Login_Page(driver);
		login.enter_username();
		login.enter_password();
		login.click_loginbutton();
		HomePage homepage=new HomePage(driver);
		homepage.click_Contacts();
		ContactsPage contactsPage=new ContactsPage(driver);
		contactsPage.click_createContact();
		contactsPage.enter_lastName();
		contactsPage.click_save();
		homepage.click_Homebutton();
		homepage.click_worldClock();
		homepage.click_closeclock();
		homepage.click_Homebutton();
		homepage.click_Contacts();
		homepage.click_Homebutton();
		homepage.click_setting(driver);
		homepage.click_crmSetting();
		homepage.moveto_userIcon(driver);
		LogoutPage logout=new LogoutPage(driver);
		logout.click_signOut();


}}
