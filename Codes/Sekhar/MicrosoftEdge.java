package Sekhar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {
	public static void main(String args[]){
		
		System.setProperty("webdriver.edge.driver","C:\\Files\\Selenium\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.youtube.com/");
		
		
	}

}
