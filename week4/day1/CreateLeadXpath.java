package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public ChromeDriver driver;
	
	@BeforeMethod
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 
	}
	
	@Test
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
		 @AfterMethod
		 public void postcondition() {
			 
			 driver.close();
		 }
		 

	}

