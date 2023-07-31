package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
 ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test1(){
		driver.findElement(By.id("email")).sendKeys("akhilsoman4044@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("akhilsoman683623");
		driver.findElement(By.name("login")).click();
	}
	
	
}
