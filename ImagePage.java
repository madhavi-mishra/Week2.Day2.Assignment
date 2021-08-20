package week2Day2Assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/img")).click();
		driver.navigate().back();
		
		
		/////////////////////// Broken Image //////////////////////////////
		WebElement img= driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/div/div/img"));
		 if (img.getAttribute("naturalWidth").equals("0"))
         {
			 System.out.print("Image is broken ");
        }
		 else
		 {
			 System.out.println(img.getAttribute("Image is not broken."));
			
		 }
			
		////////////////Click via Keyboard or Mouse //////////////	
		 WebElement Image= driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div/div/img"));
		 	Actions actions=new Actions(driver);
		 	actions.click(Image).build().perform();
		 	 
		 
		 
		 
		 
		}
		

	}


