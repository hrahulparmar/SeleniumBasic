package Int;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouselick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.google.com/");
		 WebElement ser = driver.findElement(By.xpath("https://www.google.com/"));
		 
		Actions act= new Actions(driver);
		act.contextClick(ser).perform();
		/*
		 * act.doubleClick(); 
		 * act.dragAndDrop(ser, ser) 
		 * act.moveToElement(ser)
		 */
	}
	

}
