package CWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWith_Soft_Asserttest {
	@Test
	public void trial() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String value=driver.findElement(By.xpath("//input[@value='Search store']")).getAttribute("value");
		
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(value, "Search store");
		driver.close();
		ast.assertAll();
	}

}
