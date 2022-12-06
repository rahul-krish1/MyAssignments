package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListClassroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://leafground.com/link.xhtml");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("(//a[contains(@class, 'ui-link')])[4]")).click();
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 int size = links.size();
		 System.out.println("Total Links" + size);
		 
		 

	}

}
