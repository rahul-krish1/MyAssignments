package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.redbus.in/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("src")).sendKeys("Chennai");
		 
		 Thread.sleep(3000);
		 
		 WebElement Text = driver.findElement(By.id("src"));
		 Text.sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("dest")).sendKeys("Bangalore");
		 
		 Thread.sleep(3000);
		 
		 WebElement Text1 = driver.findElement(By.id("dest"));
		 Text1.sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//div[@class = 'fl search-box date-box gtm-onwardCalendar']/span")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//td[@class = 'current day']/following-sibling::td")).click();
		 driver.findElement(By.id("search_btn")).click();
		 
		 Thread.sleep(3000);
		 
//		 WebElement Buses = driver.findElement(By.xpath("//span[contains(@class, 'busFound')]/parent::span"));
//		 Buses.getText();
//		 System.out.println(Buses);
		 
		 String Buses = driver.findElement(By.xpath("//span[contains(@class, 'busFound')]/parent::span")).getText();
		 System.out.println(Buses);
		 
//		 driver.findElement(By.className("custom-checkbox")).click();
		 
		 WebElement Sleeper = driver.findElement(By.xpath("//label[contains(text(), 'SLEEPER')]"));
		 driver.executeScript("arguments[0].click()", Sleeper);
		 
		 Thread.sleep(3000);
		 
		 String Second = driver.findElement(By.xpath("(//div[contains(@class, 'travels')])[2]")).getText();
		 System.out.println(Second);
		 
		 
		 WebElement viewSeats = driver.findElement(By.xpath("(//div[contains(@class, 'view-seats')])[2]"));
		 driver.executeScript("arguments[0].click()", viewSeats);
	}

}
