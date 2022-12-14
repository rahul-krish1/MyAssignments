package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RahulKrish Company");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rahul");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krish");
		 
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Training Company");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rahulkrish@gmail.com");
		 
		 WebElement sele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 
		 Select scr = new Select(sele);
		 scr.selectByVisibleText("New York");
		 
		 driver.findElement(By.name("submitButton")).click();
		 
		 
		 

	}

}
