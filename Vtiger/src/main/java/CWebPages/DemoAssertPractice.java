package CWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAssertPractice {
	@Test
	public void trial() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String value=driver.findElement(By.xpath("//input[@value='Search store']")).getAttribute("value");
		Assert.assertEquals(value, "Search store");
		driver.close();
	}

}
