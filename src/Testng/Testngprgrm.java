package Testng;

 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprgrm {

	ChromeDriver driver;
	@BeforeTest
	public void befrtest() {
    driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urloading(){
		driver.get("http://www.facebook.com");
		
		
	}
	
	@Test(groups = {"Sanity"})
	public void titleverificatio() {
		System.out.println("title verifcation");
		
	}
	@Test (groups = {"Sanity"})
	public void test1() {
		System.out.println("test1");
		
	}
	@Test(groups = {"Sanity"})
	public void test2() {
		System.out.println("test2");
		
	}
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("test3");
		
	}
	
	@AfterMethod
	public void aftrmethd() {
		System.out.println("after method");
		
	}
	}
	
	
