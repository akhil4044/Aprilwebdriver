package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
	
	ChromeDriver driver;
	String baseurl= "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void befretest() {
	    driver = new ChromeDriver();
	    driver.get(baseurl);
		}
		@Test
		public void copypaste(){
			
			
		WebElement fn= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		   fn.sendKeys("Akhil");
		   WebElement redifmail= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		   
		   
		   Actions act=new Actions(driver);
		
			act.keyDown(fn,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
			act.keyDown(fn,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
			act.keyDown(redifmail,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
			act.perform();
			
		
		}

}
