package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath extends BaseClass {

	
	@Test(dependsOnMethods = "week4.day2.EditLead.editLead")
	public void createLead() {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		 
		 driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		 driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		 
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Lead Duplicate");
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Adam");
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Gilchrist");
		// driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneNumber']")).sendKeys("9972311179");
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryEmail']")).sendKeys("rahulkrish1905@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		 
	}		 
		 
		 

	}

