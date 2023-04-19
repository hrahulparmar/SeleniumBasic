package Int;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();// uses driver by itself
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		element.sendKeys("xyz");
		System.out.println(element.getText());
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(elements.size());
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
		}
	}

}
