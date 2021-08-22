package week2Day2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("testleaf@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		String firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-scroller']/div/div[1]/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("First Lead id :  "+firstLead );
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("before click");
		WebElement duplicateLead1stEntry = driver.findElement(By.xpath("//div[@class='x-grid3-scroller']/div/div[1]/table/tbody/tr[1]/td[1]/div"));
		duplicateLead1stEntry.click();
		System.out.println("After Click");
	}
///not able to locate element at first lead , can you please confirm xpath of it.
}
