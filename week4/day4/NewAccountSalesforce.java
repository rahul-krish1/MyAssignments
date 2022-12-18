package week4.day4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAccountSalesforce extends BaseClassSf {

	@DataProvider(name = "New Account")
	public String[][] newAcc() throws IOException {
		String[][] data = ReadNewAccount.readData();
		return data;
	}
	
	@Test(dataProvider = "New Account")
	public void newOpportunity(String fname, String lname, String mid, String acname) throws InterruptedException {
		// TODO Auto-generated method stub
		

//		 9.Click on toggle menu button from the left corner
//		 3. Click view All and Enter Contacts in Search Box
//		 4. Click Contacts
		 
//		 Thread.sleep(3000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']"))));
		 
		 driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
		 driver.findElement(By.xpath("(//button[@class = 'slds-button'])[2]")).click();
		 
		 driver.findElement(By.xpath("//input[@class = 'slds-input']")).sendKeys("contacts");
		 WebElement contacts = driver.findElement(By.xpath("//p[@class = 'slds-truncate']/mark"));
		 driver.executeScript("arguments[0].click()", contacts);
		 
		 WebElement newButton = driver.findElement(By.xpath("//div[text() = 'New']"));
		 driver.executeScript("arguments[0].click()", newButton);
		 
		 WebElement salutation = driver.findElement(By.xpath("//button[@name = 'salutation']"));
		 driver.executeScript("arguments[0].click()", salutation);
		 
		 WebElement mr = driver.findElement(By.xpath("(//span[@class = 'slds-media__body']/span)[2]"));
		 driver.executeScript("arguments[0].click()", mr);
		 
		 driver.findElement(By.xpath("(//input[@class = 'slds-input'])[3]")).sendKeys(fname);
		 driver.findElement(By.xpath("(//input[@class = 'slds-input'])[4]")).sendKeys(lname);
		 driver.findElement(By.xpath("//input[@name = 'Email']")).sendKeys(mid);
		 
		 WebElement searchAcc = driver.findElement(By.xpath("//input[@class = 'slds-combobox__input slds-input']"));
		 driver.executeScript("arguments[0].click()", searchAcc);
		 
		 WebElement newAcc = driver.findElement(By.xpath("//span[text() = 'New Account']"));
		 driver.executeScript("arguments[0].click()", newAcc);
		 
		 driver.findElement(By.xpath("//input[@class = ' input']")).sendKeys(acname);
		 WebElement save1 = driver.findElement(By.xpath("(//span[text() = 'Save'])[2]"));
		 driver.executeScript("arguments[0].click()", save1);
		 
		 WebElement save2 = driver.findElement(By.xpath("//button[@name = 'SaveEdit']"));
		 driver.executeScript("arguments[0].click()", save2);
		 
		 String contactName = driver.findElement(By.xpath("//span[contains(@class, 'toastMessage')]//div ")).getText();
		 System.out.println(contactName);
		 
	}

}
