package TestCases;

import org.testng.annotations.Test;

import Utility_Methods.BaseTest;
import WebPages.HomePage;
import WebPages.Login_Page;
import WebPages.LogoutPage;
import WebPages.UserPage;

public class TC02 extends BaseTest {
	@Test
	public void login_userpg_logout() {
		Login_Page login=new Login_Page(driver);
		login.enter_username();
		login.enter_password();
		login.click_loginbutton();
		HomePage homepage=new HomePage(driver);
		homepage.click_setting(driver);
		homepage.click_crmSetting();
		UserPage userpage=new UserPage(driver);
		userpage.click_userlink();
		homepage.moveto_userIcon(driver);
		LogoutPage logout =new LogoutPage(driver);
		logout.click_signOut();
}
}
