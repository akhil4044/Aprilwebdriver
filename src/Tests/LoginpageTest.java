package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.FBloginpage;

public class LoginpageTest extends Baseclass {
	
	
	
	@Test
	public void test1()
	{
		FBloginpage ob = new FBloginpage(driver);
		ob.setValues("akhil@gmail.com","dkfnd");
		ob.loginclick();
	}

}
