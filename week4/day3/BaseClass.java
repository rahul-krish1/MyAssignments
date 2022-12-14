package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
public RemoteWebDriver driver;

	@Parameters({"browser", "url", "username", "password"})
	
	@BeforeMethod
	public void precondition(String browser, String url, String username, String password) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		
		 driver.get(url);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 
	}
	
	@AfterMethod
	 public void postcondition() {
		 
		 driver.close();
	 }
}
