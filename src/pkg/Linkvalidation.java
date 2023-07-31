package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkvalidation {
 ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1(){
		List<WebElement>li = driver.findElements(By.tagName("a"));
		System.out.println("total no of links = "+li.size());
		for (WebElement x:li)
		{ 
			String link=x.getAttribute("href");
			verify(link);
			
		}
		
		
	}

	private void verify(String link) {
		try {
			URL u=new URL(link);
			
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Successfull--" +link);
				
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Broken Link--" +link);
				
		     }
		}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
		}
		
	}
	
	