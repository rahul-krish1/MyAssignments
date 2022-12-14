package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass {

	@DataProvider(name = "Edit")
	public String[][] editData() {
		String[][] data = new String[1][1];
				
				data[0][0] = "Adam";
		return data;
	}
	
	@Test(dataProvider= "Edit")
	public void editLead(String fname) {
		// TODO Auto-generated method stub
		
		
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys(fname);
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
