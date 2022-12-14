package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassSf {

	public ChromeDriver driver;
	
	@Parameters({"url", "username", "password"})
	
	@BeforeMethod
	public void precondition(String url, String username, String password) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
        option.addArguments("-disable-notifications");
        
		 driver=new ChromeDriver(option);
		 driver.get(url);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@id = 'Login']")).click();
	}
	
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}
