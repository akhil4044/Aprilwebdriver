package Tests;

import org.testng.annotations.Test;

import Page.FBloginpage;

public class Createpagetest extends Baseclass {
		
		
		
		@Test
		public void test1()
		{
			FBloginpage ob = new FBloginpage(driver);
			ob.setValues("akhil@gmail.com","dkfnd");
			ob.loginclick();
		}

	}

