package Int;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// full page
		TakesScreenshot shot = (TakesScreenshot) driver;
		File img = shot.getScreenshotAs(OutputType.FILE);
		File fol = new File(".//screenshot//homepage.png");
		FileUtils.copyFile(img, fol);
		// section of page
		WebElement ele = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid'])"));
		File img2 = ele.getScreenshotAs(OutputType.FILE);
		File fol2 = new File(".//screenshot//featured.png");
		FileUtils.copyFile(img2, fol2);
		
	}

}
