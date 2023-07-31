package Testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {


	ChromeDriver driver;
	@BeforeTest
	public void befrtest() {
    driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urloading(){
	driver.get("https://www.booking.com/");
	driver.navigate().refresh();
	
	}
	
	@Test
	
	  public void main()
	  {
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
      driver.findElement(By.xpath("/html/body/div[21]/dic/div/div/div[1]/div[1]/div/button")).click();
      driver.findElement(By.xpath("//*[@id=\":Ra9:\"]")).sendKeys("Munnar");
      driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
   
      while (true)
      {
    	  String getmonth= driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
    	  System.out.println("The selected month is "+getmonth);
    	  if(getmonth.equals("July 2023"))
    	  {
    		  System.out.println("month is selected");
    		  break;
    	  }
    	  
    	  else
    	  {
    		driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg")).click();
    	  }
    	 }
      List<WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
      for(WebElement dateelement:alldates)
      {
    	  String date=dateelement.getText();
    	  System.out.println(date);
    	  if(date.equals("20")) {
    		  
    		  dateelement.click();
    		  break;
    	  }
    		  
      }
	
	
}
}
