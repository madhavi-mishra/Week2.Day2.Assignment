package week2Day2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.id("first"));
		WebElement radio1 = driver.findElement(By.xpath("//div[@id=\"first\"]/label[1]"));
		radio1.click();	
	
		/////// Default confirmation
		WebElement defaultRadio1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		WebElement defaultRadio2 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		 if(defaultRadio1.isSelected())
			 System.out.println("Radio 1 button is selected by default");
		 if(defaultRadio2.isSelected())
			 System.out.println("Radio 2 button is selected by default");
	
	  //////////////// Age Group
		
		 WebElement ageGroup = driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		 if(ageGroup.isSelected())
			 System.out.println("I belong to 20-40 age group");
		 else
		  {
			  ageGroup.click();
			  System.out.println("I belong to 20-40 age group");
			  
		  }
		
		 WebElement ageGroup1 = driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		  if(ageGroup1.isSelected())
			  System.out.println("I belong to 1-20 age group");
		  else
		  {
			  ageGroup1.click();
			  System.out.println("I belong to 1-20 age group");
			  
		  }
	
	
	
	
	}

}
