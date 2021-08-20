package week2Day2Assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/a")).click();
		driver.navigate().back();
		String findMe=driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(findMe);
		
		String linkUrl = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div/div/a")).getAttribute("href");
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div/div/a")).click();
		try {
			URL url =new URL(linkUrl);
			HttpURLConnection httpUrlConnect =(HttpURLConnection)url.openConnection();
			httpUrlConnect.setConnectTimeout(5000);
            httpUrlConnect.connect();
            if(httpUrlConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+" - "+httpUrlConnect.getResponseCode()+" is a broken link");
            }    
            else
            	System.out.println(linkUrl+" - "+httpUrlConnect.getResponseCode()+"is not a broken link");
            			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		WebElement originalLink = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/a"));
		String link1 =driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/a")).getAttribute("href");
		String link2 =driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/div/div/a")).getAttribute("href");
		if(link1.equals(link2))
			originalLink.click();
		
		driver.close();
			
		
	
	}

}
