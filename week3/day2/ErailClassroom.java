package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailClassroom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://erail.in/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("txtStationFrom")).clear();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("txtStationFrom")).sendKeys("ms");
		 WebElement source = driver.findElement(By.id("txtStationFrom"));
		 source.sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("txtStationTo")).clear();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("txtStationTo")).sendKeys("co");
		 WebElement dest = driver.findElement(By.id("txtStationTo"));
		 dest.sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("chkSelectDateOnly")).click();
		 
		 List<WebElement> trainName = driver.findElements(By.xpath("//div[@id = 'divTrainsList']/table//tr/td[2]"));
		 int size = trainName.size();
		 System.out.println(size);
		 
		 List<String> trainsNames = new ArrayList<String>();
		 
		 for (WebElement trains : trainName) {
			trainsNames.add(trains.getText());
		 }
			Set<String> tr = new LinkedHashSet<String>(trainsNames);
			int size2 = tr.size();
			System.out.println(size2);
			
			if(size == size2)
			{
				System.out.println("No duplicate found");
			}
			
			else
			{
				System.out.println("Duplicate found");
			}
		 
		 
		 

	}

}
