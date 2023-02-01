package TestCases;

import org.testng.annotations.Test;

import Utility_Methods.BaseTest;
import WebPages.HomePage;
import WebPages.Login_Page;
import WebPages.LogoutPage;

public class TC08 extends BaseTest {
	@Test
	public void Opportunities() {
			
			Login_Page login=new Login_Page(driver);
			login.enter_username();
			login.enter_password();
			login.click_loginbutton();
			HomePage homepage=new HomePage(driver);
			homepage.click_Opportunities();
			homepage.moveto_userIcon(driver);
			LogoutPage logout=new LogoutPage(driver);
			logout.click_signOut();
		}
}
