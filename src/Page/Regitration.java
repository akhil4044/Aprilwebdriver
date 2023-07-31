package Page;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Regitration  {

		WebDriver driver;
		By bname=By.xpath("//*[@id=\"name\"]");
		By bcompany=By.xpath("//*[@id=\"company\"]");
		By bemail=By.xpath("//*[@id=\"email\"]");
		By bpassword=By.xpath("//*[@id=\"password\"]");
		By bpasswordcon=By.xpath("//*[@id=\"password-confirm\"]");
		By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
		By Login=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
		
	
		
		
		public Regitration(WebDriver driver) {
			this.driver=driver;
			
		}
		public void setValues(String name,String company,String email, String password, String confirmpassword)
		{
			driver.findElement(bname).sendKeys(name);
			driver.findElement(bcompany).sendKeys(company);
			driver.findElement(bemail).sendKeys(email);
			driver.findElement(bpassword).sendKeys(password);
			driver.findElement(bpasswordcon).sendKeys(confirmpassword);
			
		}
		
		public void loginValues(String email, String password)
		{
			driver.findElement(bemail).sendKeys(email);
			driver.findElement(bpassword).sendKeys(password);
		}
		public void registerclick()
		{
			driver.findElement(register).click();
			
		}
		
		public void loginclick()
		{
			driver.findElement(Login).click();
			
		}
		
		
		
		
		
		
		
		
		
		

}
