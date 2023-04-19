 package Int;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://hdfcbank.com");
		driver.findElement(By.xpath("//a[normalize-space()='Select Product Type']")).click();
		driver.findElement(By.xpath("//li[@value='1']")).click();
		
	
	}

}
