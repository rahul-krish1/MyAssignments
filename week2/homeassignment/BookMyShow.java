package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://in.bookmyshow.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[contains(@class, 'sc-hCaUpS')]")).sendKeys("Hyderabad");
		 
		 Thread.sleep(3000);
		 
		 WebElement City = driver.findElement(By.xpath("//input[contains(@class, 'sc-hCaUpS')]"));
		 City.sendKeys(Keys.ENTER);
		 
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
		 
		 boolean contains = currentUrl.contains("hyderabad");
		 System.out.println(contains);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//span[contains(text(), 'Search for Movies')]")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[contains(@class, 'sc-hCaUpS')]")).sendKeys("Drishyam 2");
		 
		 Thread.sleep(3000);
		 
		 WebElement movie = driver.findElement(By.xpath("//input[contains(@class, 'sc-hCaUpS')]"));
		 movie.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//span[contains(text(), 'ticket')]")).click();
		 
		 String theatre = driver.findElement(By.xpath("//div[@class = '__title']/a")).getText();
		 System.out.println(theatre);
		 
		 driver.findElement(By.xpath("//div[@class = 'info-section']/img")).click();
		 
		 Thread.sleep(3000);
		 
		 String parking = driver.findElement(By.xpath("//div[contains(text(), 'Parking')]")).getText();
		 System.out.println(parking);
		 
		 driver.findElement(By.xpath("//div[@class = 'cross-container']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//div[contains(@class, '_available')]")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("btnPopupAccept")).click();
		 
		 driver.findElement(By.xpath("//li[@class = '_active']")).click();
		 
		 driver.findElement(By.id("proceed-Qty")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[@class = '_available']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("btmcntbook")).click();
		 
//		 driver.findElement(By.xpath("(//a[contains(text(), 'Pay')])[4]")).click();
		 
		 String subTotal = driver.findElement(By.id("subTT")).getText();
		 System.out.println(subTotal);
		 

	}

}
