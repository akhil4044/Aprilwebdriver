package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actionprgrm {


	ChromeDriver driver;
	
 @BeforeTest
 public void setUp()
 {
		 
		 driver= new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();

@Test
// Right click the button to launch right click menu options
  Public void test1()
    {
     Actions action = new Actions(driver);

WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
action.contextClick(link).perform();
// Click on Edit link on the displayed menu options
WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
element.click();
// Accept the alert displayed
//driver.switchTo().alert().accept();
// Closing the driver instance
//driver.quit();

}}
}