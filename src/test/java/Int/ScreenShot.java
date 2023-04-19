package Int;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {


	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		TakesScreenshot s= (TakesScreenshot) driver;
		
		File src= s.getScreenshotAs(OutputType.FILE);
		File des= new File("failed.png");
		FileUtils.copyFile(src, des);
	}

}
