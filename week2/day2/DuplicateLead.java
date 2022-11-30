package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		 
		 driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		 driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		 
		 driver.findElement(By.xpath("(//span[@class = 'x-tab-strip-text '])[3]")).click();
		 driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("rahulkrish1905@gmail.com");
		 driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		 
		 Thread.sleep(3000);
		 
		 WebElement text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
			String name = text.getText();
			System.out.println(name);
		 
	     driver.findElement(By.xpath("//div[contains(@class, '-col-partyId')]/a")).click();
	     
         driver.findElement(By.xpath("//a[text() = 'Duplicate Lead']")).click();
         
         String title = driver.getTitle();
         
         String testtitle = "Duplicate Lead | opentaps CRM";
         
         if(title.equalsIgnoreCase(testtitle))
         {
        	 System.out.println("Title matches");
         }
         
         else
         {
        	 System.out.println("Title does not match");
         }
		 
         Thread.sleep(3000);
 
         driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
         
         Thread.sleep(3000);
         
         WebElement firstName = driver.findElement(By.id("viewLead_firstName_sp"));
         String dupicateFirstName = firstName.getText();
         
         if(name.equals(dupicateFirstName))
         {
        	 System.out.println("Names are same");
         }
         
         else
         {
        	 System.out.println("Names are not same");
         }
		 
         driver.close();
		 
		 

	}

}
