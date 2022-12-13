package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
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
	
	@AfterMethod
	 public void postcondition() {
		 
		 driver.close();
	 }
}
