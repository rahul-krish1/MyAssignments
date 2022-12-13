package week4.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactSalesforce extends BaseClassSforce {

	@Test
	public void runContactSforce() throws InterruptedException {
		// TODO Auto-generated method stub
		 
//		 9.Click on toggle menu button from the left corner
//		 10.Click view All and click Sales from App Launcher
		 driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
		 driver.findElement(By.xpath("(//button[@class = 'slds-button'])[2]")).click();
		 driver.findElement(By.xpath("//p[text() = 'Sales']")).click();
		 
//		 11.Click on Opportunity tab [use java script for click]
//		 12.Click on Accounts tab [use java script for click]
//		 WebElement oppo = driver.findElement(By.xpath("//span[text() = 'Opportunities']"));
//		 driver.executeScript("arguments[0].click()", oppo);
		 
		 WebElement acct = driver.findElement(By.xpath("//span[text() = 'Accounts']"));
		 driver.executeScript("arguments[0].click()", acct);
		 
//		 13.Click on New button
//		 14.Enter 'your name' as account name
		 driver.findElement(By.xpath("//div[text() = 'New']")).click();
		 driver.findElement(By.xpath("//input[@name = 'Name']")).sendKeys("Rahul Krish");
		 
		 Thread.sleep(4000);
//		 15.Select Ownership as Public [use List as select tag is not there for drop down]
		 
		 WebElement ownership = driver.findElement(By.xpath("(//button[contains(@class, 'combobox__input-value')])[3]"));
		 driver.executeScript("arguments[0].click()", ownership);
		 
		 WebElement pub = driver.findElement(By.xpath("(//span[@class = 'slds-media__body'])[2]"));
		 driver.executeScript("arguments[0].click()", pub);
//		 List<WebElement> dropdown = driver.findElements(By.xpath("(//button[contains(@class, 'combobox__input-value')])[3]"));
//		 List<WebElement> dropdown = driver.findElements(By.xpath("(//div[contains(@class, 'slds-combobox__form-element')]/button)[3]"));
//		 int size = dropdown.size();
//		 System.out.println(size);
//		 
//		 for (int i = 0; i < dropdown.size(); i++) {
//			
//			 if(dropdown.get(i).getText().contains("Public"))
//			 {
//				 dropdown.get(i).click();
//				 break;
//			 }
//		}
//		
		 Thread.sleep(4000);
//		 16.click save
		 driver.findElement(By.xpath("//button[@name = 'SaveEdit']")).click();
		 
		 Thread.sleep(3000);
		 
//		 17.verify message
		 String verify = driver.findElement(By.xpath("//div[text() = '\"Rahul Krish\"']")).getText();
		 System.out.println(verify);
		 
		 String textVerify = "\"Rahul Krish\"";
		 
		 boolean equals = verify.equals(textVerify);
		 System.out.println(equals);
		 
		 
		 
		 
	}

}
