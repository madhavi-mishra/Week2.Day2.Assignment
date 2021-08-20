package week2Day2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/button")).click();
		driver.navigate().back();
		
		Point location = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/div/div/button")).getLocation();
		System.out.println(location);
		System.out.println("Location of X:"+location.x +"\t Location of Y:"+location.y);
		
		String color = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div/div/button")).getCssValue("color");
		System.out.println("The color of button is :  "+color);
		
		Dimension size = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/div/div/button")).getSize();
		System.out.println(size);
		System.out.println("Height= "+size.height+"\t Width = "+size.getWidth());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();

	}

}
