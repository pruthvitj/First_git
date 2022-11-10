package Flipkart_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	@BeforeMethod
	public static void launch()
	{
		System.setProperty("webdriver.gecko.driver", "./sotwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		wait=new WebDriverWait(driver, 10);
		
	}
	@AfterMethod
	public static void close()
	{
		driver.close();
	}

}
