package Int;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/register");
		WebElement search = driver.findElement(By.name("q"));
		System.out.println(search.isDisplayed());
		System.out.println(search.isEnabled());
		System.out.println(search.isSelected());// for radio button and check boxs
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		male.click();
		System.out.println(male.isSelected());
	}

}
