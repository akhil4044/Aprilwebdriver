package Testng;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramertization {
	

	ChromeDriver driver;
	@BeforeTest
	public void befrtest() {
    driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urloading(){
	driver.get("http://www.google.com");
	}
	
	@Parameters("s")
	
	@Test
	public void test1(String s){
		driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
		
	
	}
	
	
	

}
