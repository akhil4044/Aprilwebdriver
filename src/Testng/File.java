package Testng;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		

public class File{	
	
	ChromeDriver driver;
	@BeforeTest
	public void befretest() {
	    driver = new ChromeDriver();
	    
	}
    @Test		
    
    public void datadriven() throws Exception				
    {	
    	driver.get("https://www.ilovepdf.com/merge_pdf");
        driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
        fileupload ("C:\\Users\\Arya Dhanoop\\Desktop\\AKHIL RESUME.pdf");
    }
    
    public void fileupload(String p) throws AWTException {
    	StringSelection strSelection = new StringSelection (p);
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
    	
    	
    	Robot robot = new Robot();
    	robot.delay(3000);
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.delay(2000);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
    }
}
    	
    	
    	
    	
    	
 
    
