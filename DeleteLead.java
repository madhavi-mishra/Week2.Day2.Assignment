package week2Day2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9450160154");
		driver.findElement(By.linkText("Find Leads")).click();
		String firstId = driver.findElement(By.xpath("//div[@class='x-grid3-scroller']/div/div[1]/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("First Lead id :  "+firstId );
		driver.findElement(By.xpath("//div[@class='x-grid3-scroller']/div/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("9450160154");
		//textBox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String recordMsg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Confirm the successful deletion: "+recordMsg);
		driver.close();
			}

}
