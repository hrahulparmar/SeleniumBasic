 package Int;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement emailBox = driver.findElement(By.id("Email"));
		emailBox.clear();
		emailBox.sendKeys("admin123@gmail.com");
		//capture text from box
		System.out.println(emailBox.getAttribute("value"));
		//
		System.out.println(emailBox.getText());
	}

}
