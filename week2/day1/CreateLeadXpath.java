package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		 
		 driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		 driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
		 
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Cricket Corner");
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Ricky");
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Ponting");
		 
		 driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		 

	}

}
