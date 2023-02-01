package CWebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithPracData extends BaseTest1 {
	WebDriver driver;
	
	@DataProvider(name="testdata")
	public Object[][] testdata(){
		Object[][] data=new Object[2][2];
		data[0][0]="mobiles";
		data[0][1]="electronics";
		data[1][0]="books";
		data[1][1]="bike";
		return data;
	}
	@Test(dataProvider="testdata")
	public void demo(String a,String b) {
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();*/
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(a);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(b);
		driver.close();
	}

}
