package Int;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disabled-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(op);
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://redbus.in");

	}

}
