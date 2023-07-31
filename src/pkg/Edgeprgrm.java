package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Edgeprgrm {
	
	public static void main(String[]args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.luminartechnolab.com/");
		String actualtitle=driver.getTitle();
		String exptitle="Kerala's No.1 Software Training Institute in Kochi (Cochin) |Luminar Technolab";
		if(actualtitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}	
		
		
	}
}
		