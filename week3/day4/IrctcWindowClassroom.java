package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcWindowClassroom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
        option.addArguments("-disable-notifications");
        
		 ChromeDriver driver=new ChromeDriver(option);
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[text() = ' FLIGHTS ']")).click();
		 
		 Set<String> flights = driver.getWindowHandles();
		 List<String> flightsList = new ArrayList<String>(flights);
		 
		 driver.switchTo().window(flightsList.get(1));
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.switchTo().window(flightsList.get(0));
		 driver.close();
	}

}
