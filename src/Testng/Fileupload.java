package Testng;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;				
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		

public class Fileupload {	
	
	ChromeDriver driver;
	@BeforeTest
	public void befretest() {
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    
		}	
    @Test		
    public void datadriven() throws Exception				
    {		
         FileInputStream ob = new FileInputStream("C:\\Users\\Arya Dhanoop\\Desktop\\Book1.xlsx");
    	XSSFWorkbook wb= new XSSFWorkbook(ob);//to get workbook
    	XSSFSheet sh = wb.getSheet("Sheet1");//return sheet details
    	int rowsize=sh.getLastRowNum();// return row number
    	
    	for(int i = 1;i<=rowsize;i++) {
    		
    		String username= sh.getRow(i).getCell(0).getStringCellValue();
    		System.out.println("username is " +username);
    		String pswd= sh.getRow(i).getCell(1).getStringCellValue();
    		System.out.println("Password is " +pswd);
    		driver.findElement(By.name("email")).clear();
    		driver.findElement(By.name("email")).sendKeys(username);
    		driver.findElement(By.id("pass")).sendKeys(pswd);
    		driver.findElement(By.name("login")).click();
    		driver.navigate().refresh();
    		driver.navigate().back();
    		
    	}
	}		
}