package CWebPages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility_Methods.UtilityMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1 {
	public WebDriver driver;
	@BeforeClass
	public void Browser_Setup() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		String URL2=UtilityMethods.testConfiguration();
		System.out.println(URL2);
		driver.get(URL2);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}
	@AfterClass
	public void tear_down() {
		driver.close();
	}

}
