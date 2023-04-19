package Int;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateDropDown {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement datepick = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select months= new Select(datepick);
		months.selectByVisibleText("Nov");
		
		WebElement yearpick = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year= new Select(yearpick);
		year.selectByVisibleText("1997");
		String day="1";
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement day1:days)
		{
			String day2 = day1.getText();
			if(day2.equals(day))
				day1.click();
		}
	}

}
