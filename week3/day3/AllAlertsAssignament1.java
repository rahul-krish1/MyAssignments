package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllAlertsAssignament1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
        option.addArguments("-disable-notifications");
        
		 ChromeDriver driver=new ChromeDriver(option);
		 driver.get("https://www.leafground.com/alert.xhtml");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//span[text() = 'Show']")).click();
		 
		 driver.switchTo().alert().accept();
		 
		 String simple = driver.findElement(By.id("simple_result")).getText();
		 System.out.println(simple);
		 
		 driver.findElement(By.xpath("(//span[text() = 'Show'])[2]")).click();
		 
		 driver.switchTo().alert().dismiss();
		 
		 String confirm = driver.findElement(By.xpath("//span[@id = 'result']")).getText();
		 System.out.println(confirm);
		 
		 driver.findElement(By.xpath("(//span[text() = 'Show'])[5]")).click();
		 
		 driver.switchTo().alert().sendKeys("Rahul");
		 driver.switchTo().alert().accept();
		 
		 String prompt = driver.findElement(By.xpath("//span[@id = 'confirm_result']")).getText();
		 System.out.println(prompt);
		 
		 driver.findElement(By.xpath("(//span[text() = 'Show'])[3]")).click();
		 
		driver.findElement(By.xpath("(//span[text() = 'Dismiss'])")).click();
		
		
		driver.findElement(By.xpath("(//span[text() = 'Show'])[4]")).click();
		
		String sweetText = driver.findElement(By.xpath("//p[@class = 'm-0']")).getText();
		System.out.println(sweetText);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class = 'ui-icon ui-icon-closethick'])[2]")).click();
		 
		 
		
		driver.findElement(By.xpath("//span[text() = 'Delete']")).click();
		driver.findElement(By.xpath("//span[text() = 'Yes']")).click();
		
		
		
		
		 
		 

	}

}
