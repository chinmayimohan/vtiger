package CWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithchromiumOption {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--incognito");
	options.addArguments("--start-maximized");
	options.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.easemytrip.com/");
	}
}
