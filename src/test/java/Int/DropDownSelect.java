package Int;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement country = driver.findElement(By.id("input-country"));
		
		Select drop= new Select(country);
		//drop.selectByVisibleText("India");
		//drop.selectByValue("10");
		drop.deselectByIndex(1);
		

	}

}
