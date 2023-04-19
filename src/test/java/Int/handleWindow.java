package Int;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> win = driver.getWindowHandles();
		
		for(String wi:win)
		{
			System.out.println(wi);
			
		}
		
		List<String> winl=new ArrayList<String>(win);
		for(String wi:winl)
		{
			String ti=driver.switchTo().window(wi).getTitle();
			System.out.println(ti);
			if(ti.equals("OrangeHRM"))
				//driver.close();
			break;
			
		}
		driver.quit();
		
		
		
				
		
		
	}

}
