package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;	

import org.testng.annotations.Test;		

public class Fileupload1 {	
	
	ChromeDriver driver;
	@Test
	public void befretest() {
	    driver = new ChromeDriver();
         driver.get("https://demo.guru99.com/test/upload/");
         driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Arya Dhanoop\\Desktop\\primenumber.png");
       driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
         
         System.out.println("File uploaded sucessfully");
		}	
 
    
	}		
//WebElement uploadElement =