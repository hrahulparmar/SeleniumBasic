package Int;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyStroke2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://text-compare.com");
		WebElement ip1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement ip2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		ip1.sendKeys("Welcome to selenium");
		
		Actions act= new Actions(driver);
		//ctrl+a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		//ctrl+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		//tab
		act.sendKeys(Keys.TAB);
		//ctrl+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		//compartext
		if(ip1.getAttribute("value").equals(ip2.getAttribute("value")))
			System.out.println("copied");
		else
			System.out.println("not copied");
		
		
		
		
		
		
		
	}

}
