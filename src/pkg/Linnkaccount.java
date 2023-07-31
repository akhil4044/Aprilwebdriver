package pkg;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linnkaccount {
 ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1(){
		List<WebElement>li = driver.findElements(By.tagName("a"));
		System.out.println("total no of links = "+li.size());
		for (WebElement x:li)
		{ 
			String link=x.getAttribute("href");
			String linktext=x.getText();
			System.out.println(link+"------"+linktext);
			
		}
		
		
	}
	
	
}