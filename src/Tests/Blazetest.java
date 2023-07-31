package Tests;

import org.testng.annotations.Test;

import Page.Regitration;

public class Blazetest extends Baseblaze {
	
	
	@Test
	
	public void test1()
	{
		Regitration ob = new Regitration(driver);
		ob.setValues("akhil","infosys","akhil@gmail.com","Akhil123","Akhil123");
		ob.registerclick();
		
	}
	
	@Test
	public void login()
	{
		driver.navigate().to("https://blazedemo.com/login");
		Regitration ob = new Regitration(driver);
		ob.loginValues("akhil@gmail.com","Akhil123");
		ob.loginclick();
		
	}
	
	

}
