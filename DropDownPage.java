package week2Day2Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select drpDwn1 = new Select(drop1);
		drpDwn1.selectByIndex(1);
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByVisibleText("Selenium");
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByValue("1");
		WebElement drop4 = driver.findElement(By.className("dropdown"));
		Select drpDwn4 = new Select(drop4);
		int listSize = drpDwn4.getOptions().size();

		System.out.println("Size of Fourth drop down: " + listSize);

		WebElement drop5 = driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[5]/select"));
		drop5.sendKeys("UFT/QTP");
		
		WebElement program = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select selectPrgm = new Select(program);
		selectPrgm.selectByIndex(4);
		//selectPrgm.selectByVisibleText("Appium");
		System.out.println("HI End");
		
		
	
	
	
	
	
	
	}
}
