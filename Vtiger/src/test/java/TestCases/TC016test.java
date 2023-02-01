package TestCases;

import org.testng.annotations.Test;

import Utility_Methods.BaseTest;
import Utility_Methods.UtilityMethods;
import WebPages.ContactsPage;
import WebPages.HomePage;
import WebPages.Login_Page;
import WebPages.LogoutPage;

public class TC016test extends BaseTest{
		@Test
	public void Contacts_create() {
			
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
			homepage.moveto_userIcon(driver);
			LogoutPage logout=new LogoutPage(driver);
			logout.click_signOut();
		}

}
