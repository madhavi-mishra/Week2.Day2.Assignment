package week2Day2Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement checkBox1 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div[1]/input"));
		checkBox1.click();
		//Confirm Selenium is checked
		WebElement checkBox2 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/div/input"));
			if(checkBox2.isSelected()) {
				System.out.println("Selenium is Checked");
			}
			else
			{   //checkBox2.click();
				System.out.println("Selenium is not checked");
			}
			
			//DeSelect only checked
		WebElement checkBox3 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div[1]/input"));
		WebElement checkBox4 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div[2]/input"));
		if(checkBox3.isSelected()) {
			checkBox3.click();
			System.out.println(("Checkbox is Deselected"));
		}
		else {
			
			System.out.println("checkbox is not selected");
			}
		if(checkBox4.isSelected()) {
			checkBox4.click();
			System.out.println(("Checkbox is Deselected"));
		}
		else {
			
			System.out.println("checkbox is not selected");
			}
		
		//WebElement checkBox5 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/div[1]/input"));
	//Select all below checkboxes
List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//div[@id='contentblock']/section/div[4]/div/input"));
	int size = AllCheckboxes.size();
	System.out.println("Size of all checkboxes: "+ size);
	for(int i=0;i<size;i++) {
		AllCheckboxes.get(i).click();	}
	}
	
}
