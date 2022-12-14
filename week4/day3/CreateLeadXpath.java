package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath extends BaseClass {

	@DataProvider(name = "Create")
	public String[][] createData() {
		String[][] data1 = new String[1][3];
		
		data1[0][0] = "Adam";
		data1[0][1] = "Gilchrist";
		data1[0][2] = "rahulkrish1905@gmail.com";
		
		return data1;
	}
	
	@Test(dataProvider = "Create")
	public void createLead(String fname, String lname, String mailid) {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		 
		 driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		 driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		 
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Lead Duplicate");
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys(fname);
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys(lname);
		// driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneNumber']")).sendKeys("9972311179");
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryEmail']")).sendKeys(mailid);
		 
		 driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		 
	}		 
		 
		 

	}

