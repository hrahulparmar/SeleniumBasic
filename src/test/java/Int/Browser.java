package Int;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "./src/main/resources/chromedriver.exe"); WebDriver driver= new
		 * ChromeDriver();
		 * 
		 * 
		 * System.setProperty("webdriver.edge.driver",
		 * "./src/main/resources/msedgedriver.exe"); WebDriver driver1= new
		 * EdgeDriver();
		 */
		//WebDriverManager.edgedriver().setup();
				//WebDriver driver1= new EdgeDriver();
		WebDriverManager.chromedriver().setup();// uses driver by itself
		WebDriver driver= new ChromeDriver();
		driver.get("http://flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
	}

}
