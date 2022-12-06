package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealMouseHoverClassroom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.snapdeal.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 WebElement toys = driver.findElement(By.xpath("(//span[@class = 'catText'])[4]"));
		 
		 Thread.sleep(3000);
		 
		 Actions mouser = new Actions(driver);
		 
		
		 mouser.moveToElement(toys).perform();

	}

}
