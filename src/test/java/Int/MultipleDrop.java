package Int;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		//1stapproach
	//Select country = new Select(driver.findElement(By.xpath("//select[@id='Form_getForm_Country']")));
		//country.selectByValue("india");
		//List<WebElement> cList = country.getOptions();
		//2nd
		
		WebElement con = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		
		
		

	}

}
