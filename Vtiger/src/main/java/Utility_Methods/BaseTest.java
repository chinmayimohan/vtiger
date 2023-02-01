package Utility_Methods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	@BeforeClass
	public void Browser_Setup() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		String url=UtilityMethods.testConfiguration();
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}
	@AfterClass
	public void tear_down() {
		driver.close();
	}

}
