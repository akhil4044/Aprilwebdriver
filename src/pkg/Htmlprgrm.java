package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlprgrm {
 ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/Arya%20Dhanoop/Desktop/alert.html");
	}
	
	@Test
	public void test1(){
		driver.findElement(By.xpath("/html/body/htm/input[1]")).click();
		
		driver.findElement(By.xpath("/html/body/htm/input[2]")).sendKeys("akhilsoman4");
		driver.findElement(By.xpath("/html/body/htm/input[3]")).sendKeys("akhilsoma3623");
		driver.findElement(By.xpath("/html/body/htm/input[4]")).click();
	}
	
	
}

