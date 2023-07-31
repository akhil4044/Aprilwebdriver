package Testng;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fbparametarization {
	

	ChromeDriver driver;
	@BeforeTest
	public void befrtest() {
    driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urloading(){
	driver.get("http://www.facebook.com");
	}
	
	@Parameters({"u","p"})
	
	@Test
	public void test1(String u, String p){
		driver.findElement(By.id("email")).sendKeys(u);
		driver.findElement(By.id("pass")).sendKeys(p,Keys.ENTER);
	
	}
	
	
	

}
