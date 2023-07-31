package Testng;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		

public class dragandrop {	
	
	ChromeDriver driver;
	String baseurl= "https://demoqa.com/droppable/";
	
	@BeforeTest
	public void befretest() {
	    driver = new ChromeDriver();
	    driver.get(baseurl);
	    
		}	
    @Test		
    public void DragnDrop()					
    {		
         					   		
        	WebElement From=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
	}		
}