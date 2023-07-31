package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgrm {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test1()
	
	{
	
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}
	
	@Test
	public void test2()
	{
String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}	
	}
	
	@After
	 
	public void Exi() {
		driver.quit();
	}
	
	
}
