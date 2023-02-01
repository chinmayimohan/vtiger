package CWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vtiger_Page extends Base_Page {
	
		public vtiger_page(WebDriver driver) {
			super(driver);
		}
		
		
		//================Web elements or Property================
		@FindBy(xpath = "//input[@name='user_name']") 
		WebElement username;
		
		@FindBy(xpath = "//input[@name='user_password']") 
		WebElement password;
		
		
		@FindBy(xpath = "//input[@id='submitButton']") 
		WebElement login_button;
		
		@FindBy(xpath="//input[@name='query_string']")
		WebElement search_text_field;
		
		@FindBy(xpath="//input[@class='searchBtn' and @title='Find']")
		WebElement search_icon;
		
		@FindBy(xpath="(//a[text()='Contacts'])[1]")
		WebElement contacts_tab;
		
		@FindBy(xpath="//input[@class='txtBox']")
		WebElement contacts_search_textfield;
		
		@FindBy(xpath="(//a[text()='Email'])[1]")
		WebElement Email_tab;
		
		@FindBy(xpath="//input[@name='search_text']")
		WebElement Email_Textfield;
		
		@FindBy(xpath="//input[@class='crmbutton small create']")
		WebElement Find_button;
		
		
		
		
		
		//================Getters or Public services================
		public void username(String name) {
			username.sendKeys(name);
		}
		
		public void password(String name) {
			password.sendKeys(name);
		}
		
		public void login_button() {
			login_button.click();
		}
		
		public void search_text_field(String text) {
			search_text_field.sendKeys(text);
		}
		
		public void Search_icon() {
			search_icon.click();
		}
		
		public void contacts_tab() {
			contacts_tab.click();
		}
		
		public void contacts_search_text_field(String text) {
			contacts_search_textfield.sendKeys(text);
		}
		
		public void Email_tab() {
			Email_tab.click();
		}
		
		public void Email_Textfield(String email) {
			Email_Textfield.sendKeys(email);
		}
		
		public void Find_button() {
			Find_button.click();
		}
		
		
		//======================== methods ============================
		public void login() {
			username("admin");
			password("admin");
			login_button();
		}
	}



