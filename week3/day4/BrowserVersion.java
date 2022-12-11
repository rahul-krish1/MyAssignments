package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
        option.addArguments("-disable-notifications");
        
		 ChromeDriver driver=new ChromeDriver(option);
		 
		 String browserVersion = driver.getCapabilities().getBrowserVersion();
		 System.out.println(browserVersion);
		 
		 String browserName = driver.getCapabilities().getBrowserName();
		 System.out.println(browserName);
		 
		 Platform platformName = driver.getCapabilities().getPlatformName();
		 System.out.println(platformName);
//		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
//		 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		 
//		 driver.manage().window().maximize();
//		 
//		 Thread.sleep(3000);

	}

}
