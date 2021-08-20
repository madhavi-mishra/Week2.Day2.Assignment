package week2Day2Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("madhavidmishra@gmail.com");
		driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("Append");

		WebElement defText = driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String getValue = defText.getAttribute("TestLeaf");
		driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		boolean confirmEnableDisable = driver.findElement(By.xpath("//div[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled();
		if(confirmEnableDisable)
		System.out.println("the text field is enabled");
		else
			System.out.println("the text field is disabled");
			
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
	}
}
