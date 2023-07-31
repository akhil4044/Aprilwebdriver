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

public class Linkresponse {
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
		
		try {
			URL u=new URL("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
			
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println(con.getResponseCode());
				
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println(con.getResponseCode());
				
		     }
		}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
		}
		
	}
	
	