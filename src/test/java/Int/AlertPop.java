package Int;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		//driver.switchTo().alert().accept();
		//driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("rahul");
		alert.accept();
	}

}
