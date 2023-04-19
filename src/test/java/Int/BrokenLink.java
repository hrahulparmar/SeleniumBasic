package Int;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://deadlinkcity.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int bl = 0;
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("url is broken");
				continue;
			}
			URL link1;
			try {
				link1 = new URL(url);
				HttpURLConnection con= (HttpURLConnection) link1.openConnection();
				con.connect();
				if(con.getResponseCode()>=400)
				{
					System.out.println("Broken :"+con.getResponseMessage()+" || "+con.getResponseCode());
					bl++;
				}else {
					System.out.println("valid :"+con.getResponseMessage()+" || "+con.getResponseCode());
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
					}
		System.out.println(bl);
		
		
		
		
		
		
		
		
		
		
		
	}

}
