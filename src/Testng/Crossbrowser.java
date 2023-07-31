package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser)
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}	
			
			else if (browser.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
			
			
			}
			else if (browser.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			
			
			} 
	}
		
		
		 @Test
		 public void test1()
		 {
			 driver.get("https://www.facebook.com");
		}
	
	
	
}
