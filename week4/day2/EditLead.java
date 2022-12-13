package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass {

	
	@Test
	public void editLead() {
		// TODO Auto-generated method stub
		
		
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("Rahul");
		 driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		 
		 
		 
		 driver.findElement(By.xpath("//a[text() = '15644']")).click();
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String expected="View Lead | opentaps CRM";

			if(title.equalsIgnoreCase(expected)) {
			System.out.println("Title match");
		 
			}
			
		driver.findElement(By.linkText("Edit")).click();	
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Sports Shop");
		driver.findElement(By.name("submitButton")).click();
		
		
		 
		 
		 

	}

	
}
