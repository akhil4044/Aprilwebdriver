package Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


public class Reddiffdropdown {
	

	ChromeDriver driver;
	@BeforeTest
	public void befrtest() {
    driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urloading(){
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1(){
		Select se = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
		se.selectByValue("06");
		List<WebElement> l = se.getOptions();
		int count = l.size();
		System.out.println("Total elements in day is " +count);
		Select se1 = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
		se1.selectByValue("06");
		List<WebElement> l1 = se1.getOptions();
		int count1 = l1.size();
		System.out.println("Total elements in month is" +count1);
		Select se2 = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
		se2.selectByValue("2023");
		List<WebElement> l3 = se2.getOptions();
		int count2 = l3.size();
		System.out.println("Total elements in year is" +count2);
		
	
	}
	
	
	

}
