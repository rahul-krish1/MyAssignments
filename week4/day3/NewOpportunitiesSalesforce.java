package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewOpportunitiesSalesforce extends BaseClassSf {

	@DataProvider(name= "New Opportunity")
	public String[][] createData() {
		String[][] data = new String[2][1];
		
		data[0][0] = "Salesforce Automation by Rahul";
		
		data[1][0] = "Salesforce Automation by Krish";
		
		return data;
	}
	
	@Test(dataProvider = "New Opportunity")
	public void newOpportunity(String oppname) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 
		 driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
		 driver.findElement(By.xpath("(//button[@class = 'slds-button'])[2]")).click();
		 driver.findElement(By.xpath("//p[text() = 'Sales']")).click();
		 
		 WebElement oppo = driver.findElement(By.xpath("//span[text() = 'Opportunities']"));
		 driver.executeScript("arguments[0].click()", oppo);
		 
		 driver.findElement(By.xpath("//div[text() = 'New']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("(//input[@class = 'slds-input'])[4]")).sendKeys(oppname);
		 String textOppo = driver.findElement(By.xpath("(//input[@class = 'slds-input'])[4]")).getText();
		 System.out.println(textOppo);
		 
		 WebElement closeDate = driver.findElement(By.xpath("(//input[@class = 'slds-input'])[3]"));
		 driver.executeScript("arguments[0].click()", closeDate);
		 
		 WebElement today = driver.findElement(By.xpath("//button[text() = 'Today']"));
		 driver.executeScript("arguments[0].click()", today);
		 
		 WebElement stage = driver.findElement(By.xpath("//button[contains(@class, 'slds-combobox__input-value')]"));
		 driver.executeScript("arguments[0].click()", stage);
		 
		 WebElement needAnalysis = driver.findElement(By.xpath("(//span[@class = 'slds-media__body']/span)[4]"));
		 driver.executeScript("arguments[0].click()", needAnalysis);
		 
		 driver.findElement(By.xpath("//button[text() = 'Save']")).click();
		 
		 String oppoNameVerify = driver.findElement(By.xpath("//span[text() = '\"Salesforce Automation by Rahul\"']")).getText();
		 String oppoName = "\"Salesforce Automation by Rahul\"";
		 
		 if(oppoNameVerify.equalsIgnoreCase(oppoName))
		 {
			 System.out.println("Opportunity Name matched");
		 }
		 else
		 {
			 System.out.println("Opportunity name does not match");
		 }
		 
		 
	}

}
