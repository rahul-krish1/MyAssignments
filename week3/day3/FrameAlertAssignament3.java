package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAlertAssignament3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
        option.addArguments("-disable-notifications");
        
		 ChromeDriver driver=new ChromeDriver(option);
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		 
		 driver.switchTo().alert().sendKeys("Rahul Krish");
		 driver.switchTo().alert().accept();
		 
		 String text1 = driver.findElement(By.id("demo")).getText();
		 System.out.println(text1);
		 boolean contains = text1.contains("Rahul Krish");
		 System.out.println(contains);

	}

}
