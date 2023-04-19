package Int;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/");
		//driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn__text")).click();
		WebElement upload = driver.findElement(By.id("file-upload"));
		//upload.sendKeys("C:\\Users\\gbhar\\OneDrive\\Documents\\syntax for cssSelector.txt");
	
	
	
	}

}
