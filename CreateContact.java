package week2Day2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Madhavi");
		driver.findElement(By.id("lastNameField")).sendKeys("Mishra");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("madhu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("dubey");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hi,I'm working as software Engineer.");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("madhavimishra21895@gmail.com");
		WebElement stateObj = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(stateObj);
		state.selectByVisibleText("New York");			
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is IMPORTANT NOTE field");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
	    System.out.println("Title of the Page: " + driver.getTitle());
		
		
		
		
		
		
		
		
		
		
	}

}
