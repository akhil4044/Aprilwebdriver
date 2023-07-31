package Tests;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbforgot {
	

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void forgot(){
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		try {
			URL u=new URL("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
			
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			System.out.println(con.getResponseCode());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	

	}
}
