package TestCases;

import org.testng.annotations.Test;

import Utility_Methods.BaseTest;
import WebPages.HomePage;
import WebPages.Leads_Page;
import WebPages.Login_Page;
import WebPages.LogoutPage;

public class TC04 extends BaseTest{
	@Test
	public void leads() {
		Login_Page login=new Login_Page(driver);
		login.enter_username();
		login.enter_password();
		login.click_loginbutton();
		HomePage homepage=new HomePage(driver);
		homepage.click_leads();
		Leads_Page leadspage=new Leads_Page(driver);
		leadspage.click_addlead();
		leadspage.click_salutation();
		leadspage.enter_lastname();
		leadspage.enter_companyname();
		leadspage.click_save();
		homepage.moveto_userIcon(driver);
		LogoutPage logout =new LogoutPage(driver);
		logout.click_signOut();
}
}
