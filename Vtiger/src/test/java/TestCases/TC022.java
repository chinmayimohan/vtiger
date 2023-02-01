package TestCases;

import org.testng.annotations.Test;

import Utility_Methods.BaseTest;
import WebPages.HomePage;
import WebPages.Login_Page;
import WebPages.LogoutPage;

public class TC022 extends BaseTest{
	@Test
public void clockselectClose() {
		
		Login_Page login=new Login_Page(driver);
		login.enter_username();
		login.enter_password();
		login.click_loginbutton();
		HomePage homepage=new HomePage(driver);
		homepage.click_worldClock();
		homepage.click_closeclock();
		homepage.moveto_userIcon(driver);
		LogoutPage logout=new LogoutPage(driver);
		logout.click_signOut();
	} 

	

}
