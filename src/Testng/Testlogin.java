package Testng;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;				
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		

public class Testlogin {	
	
	ChromeDriver driver;
	@BeforeTest
	public void befretest() {
	    driver = new ChromeDriver();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    driver.manage().window().maximize();
	    
		}	
    @Test		
    public void datadriven() throws Exception				
    {		
         FileInputStream ob = new FileInputStream("C:\\Users\\Arya Dhanoop\\Desktop\\Book2.xlsx");
    	XSSFWorkbook wb= new XSSFWorkbook(ob);
    	XSSFSheet sh = wb.getSheet("Sheet1");
    	int rowsize=sh.getLastRowNum();
    	
    	for(int i = 1;i<=rowsize;i++) {
    		
    		String username= sh.getRow(i).getCell(0).getStringCellValue();
    		System.out.println("username is " +username);
    		String pswd= sh.getRow(i).getCell(1).getStringCellValue();
    		System.out.println("Password is " +pswd);
    		driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
    		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
    		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
    		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    		
    		String actualTitle = driver.getTitle();
    	
    		
    		String expectedTitle = "Logged In Successfully | Practice Test Automation";
    		
    		if(actualTitle.equals(expectedTitle))
    		{
    			System.out.println("Login Successful");
    		}
    		else
    		{
    			System.out.println("Login not suceesful");
    		}
    
    		
    	
    		
    	}
	}		
}