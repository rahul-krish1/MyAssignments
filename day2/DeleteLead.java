package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		 
		 driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		 driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		 
        driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
        driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("8310658279");
        driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
        
        String leadid = driver.findElement(By.xpath("//div[contains(@class, '-col-partyId')]/a")).getText();
        System.out.println(leadid);
        
        driver.findElement(By.xpath("//div[contains(@class, '-col-partyId')]/a")).click();
        
        driver.findElement(By.xpath("//a[text() = 'Delete']")).click();
        
        driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
        
        driver.findElement(By.xpath("//input[@name = 'id']")).getText();
        
        driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
        
        
        
        
        
		 
		 
		 

	}

}
