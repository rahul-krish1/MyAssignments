package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		 
		 driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		 driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		 
		 driver.findElement(By.xpath("(//span[@class = 'x-tab-strip-text '])[3]")).click();
		 driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("rahulkrish1905@gmail.com");
		 driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		 
		 String leadid1 = driver.findElement(By.xpath("//div[contains(@class, '-col-partyId')]/a")).getText();
	     System.out.println(leadid1);
		 
         driver.findElement(By.xpath("//a[text() = 'Duplicate Lead']")).click();
		 
 
         driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		 
		 
		 

	}

}
