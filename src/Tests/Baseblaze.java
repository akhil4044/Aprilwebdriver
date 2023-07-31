package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseblaze {

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/register");
		
	}
	
	

}
