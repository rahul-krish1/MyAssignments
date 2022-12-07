package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
        option.addArguments("-disable-notifications");
        
		 ChromeDriver driver=new ChromeDriver(option);
		 driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().frame("frame1");
		 driver.findElement(By.xpath("//b[@id = 'topic']/following-sibling::input")).sendKeys("Krish");
		 
		 driver.switchTo().frame("frame3");
		 driver.findElement(By.id("a")).click();
		 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("frame2");
		 
		 WebElement animal = driver.findElement(By.xpath("//select[@id = 'animals']"));
		 Select ani = new Select(animal);
		 ani.selectByIndex(2);
		 
		 
		 
		 

	}

}
