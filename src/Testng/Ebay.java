package Testng;

import java.time.Duration;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		

public class Ebay {	
	
	ChromeDriver driver;
	
	
	@BeforeTest
	public void befretest() {
	    driver = new ChromeDriver();
	    driver.get("http://www.ebay.com");
	    driver.manage().window().maximize();
	    
		}	
    @Test		
    public void mousehover()					
    {		
         //driver.manage().timeouts().implicitlyWait(Duration.ofsconds(20));
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));	
    	 Actions act=new Actions(driver);
    	 act.moveToElement(electronics);
    	 act.perform();
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
         		
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a"));			
         			
	}		
}