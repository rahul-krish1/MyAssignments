package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
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
