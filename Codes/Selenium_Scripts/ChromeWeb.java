package Selenium_Scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWeb {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Files\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
	}

}
