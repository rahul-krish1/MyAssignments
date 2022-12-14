package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSforce {

	public RemoteWebDriver driver; 
	
	@Parameters({"browser", "url", "username", "password"})
	
	@BeforeMethod
	public void precondition(String browser, String url, String username, String password) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions option= new ChromeOptions();
	        option.addArguments("-disable-notifications");
	        
			 driver=new ChromeDriver(option);
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			
			EdgeOptions option= new EdgeOptions();
	        option.addArguments("-disable-notifications");
	        
			 driver=new EdgeDriver(option);
		}
		
		 driver.get(url);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@id = 'Login']")).click();
	}
	
	@AfterMethod
	public void postcondition() {
		driver.quit();
	}
}
