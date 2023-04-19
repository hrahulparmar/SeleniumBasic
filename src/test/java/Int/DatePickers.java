package Int;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		 
		String year="2023";
		String month="apr";
		String date="10";
		driver.findElement(By.xpath(" //input[@id='onward_cal']")).click();
		
		while(true)
		{
			String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String arr[]= monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			if(mon.equalsIgnoreCase(month) && yr.equals(yr))
				break;
			else
				driver.findElement(By.xpath("//button[text()='>']")).click();
		}
		//date select
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for(WebElement date1:dates)
		{
			String day = date1.getText();
			if(day.equals(date))
				date1.click();
		}
	}

}
