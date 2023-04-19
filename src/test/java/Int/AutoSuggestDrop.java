package Int;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://bing.com");
		WebElement search = driver.findElement(By.id("sb_form_q"));
		search.click();
		search.sendKeys("selen");
		List<WebElement> sugg = driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//span"));
		System.out.println(sugg.size());
		for(WebElement sus:sugg)
		{
			System.out.println(sus.getText());
			if(sus.getText().contains("java"))
			{
				sus.click();
				break;
			}
		}
	}

}
