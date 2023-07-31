package Page;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class FBcreatepage {
		
		WebDriver driver;
		By createpage=By.xpath("email");
		By gestarted=By.xpath("pass");
		
		
		public FBcreatepage(WebDriver driver) {
			this.driver=driver;
			
		}
		public void setValues(String email,String password)
		{
			driver.findElement(createpage).sendKeys(email);
			driver.findElement(fbpaswd).sendKeys(password);
			
		}
		
		public void loginclick()
		{
			driver.findElement(fblogin).click();
		}
		
		

}
