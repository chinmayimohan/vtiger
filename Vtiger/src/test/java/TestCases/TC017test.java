package TestCases;

import org.testng.annotations.Test;

import Utility_Methods.BaseTest;
import WebPages.ContactsPage;
import WebPages.HomePage;
import WebPages.Login_Page;
import WebPages.LogoutPage;

public class TC017test extends BaseTest{
	@Test
public void SearchAndSelect() {
		
		Login_Page login=new Login_Page(driver);
		login.enter_username();
		login.enter_password();
		login.click_loginbutton();
		HomePage homepage=new HomePage(driver);
		homepage.click_search_DownArrow();
		homepage.click_OrganizationCheckbox();
		homepage.click_CamPaigns();
		homepage.click_Applybutton();
		homepage.click_Searchbutton();
		homepage.moveto_userIcon(driver);
		LogoutPage logout=new LogoutPage(driver);
		logout.click_signOut();
	}

}
