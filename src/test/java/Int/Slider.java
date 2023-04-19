package Int;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min = driver.findElement(By.xpath("//span[1]"));
		System.out.println(min.getLocation());
		System.out.println(min.getSize());
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(min, 120, 250 ).perform();
		
		 System.out.println(min.getLocation());
		System.out.println(min.getSize());
		
		Action actionI = act.moveToElement(min).build();
		actionI.perform();
		
	}

}
