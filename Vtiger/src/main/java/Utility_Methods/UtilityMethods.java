package Utility_Methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	
public static String testConfiguration () throws IOException {
	String filepath="./TestConfiguration/TestConfigurationProperties";
	FileInputStream fis=new FileInputStream(filepath);
	
	Properties prop=new Properties();
	prop.load(fis);
	String url=prop.getProperty("URL");
	return url;
	
}

public static void enter_value(WebElement element,String value) {
	element.sendKeys(value);
	
}
public static void clickElement(WebElement element) {
	element.click();
}
public static void mousehover(WebElement element, WebDriver driver) {
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	
}
public static void selectByValue(WebElement element,String value) {
	Select select=new Select(element);
	select.selectByValue(value);
}
}
