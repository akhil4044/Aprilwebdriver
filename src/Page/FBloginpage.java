package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBloginpage {

	WebDriver driver;
	By fbmail=By.id("email");
	By fbpaswd=By.id("pass");
	By fblogin=By.name("login");
	
	public FBloginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void setValues(String email,String password)
	{
		driver.findElement(fbmail).sendKeys(email);
		driver.findElement(fbpaswd).sendKeys(password);
		
		
	}
	
	public void loginclick()
	{
		driver.findElement(fblogin).click();
	}
	
	
}
