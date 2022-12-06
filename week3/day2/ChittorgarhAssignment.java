package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChittorgarhAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.chittorgarh.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("navbtn_stockmarket")).click();
		 
		 driver.findElement(By.xpath("//a[text() = 'NSE Bulk Deals']")).click();
		 
		 List<WebElement> security = driver.findElements(By.xpath("//div[@class = 'table-responsive']/table//tr/td[3]"));
		 int security1 = security.size();
		 System.out.println("Total size is : " + security1);
		 
		 List<String> securityNames = new ArrayList<String>();
		 
		 for (WebElement allNames : security) {
			
			 securityNames.add(allNames.getText());
			 System.out.println(allNames.getText());
		}
		 
		 Set<String> sec = new LinkedHashSet<String>(securityNames);
		 int security2 = sec.size();
		 System.out.println("Total size is : " + security2 );
		 
		 if(security1 == security2)
		 {
			 System.out.println("No duplicate");
		 }
		 else
		 {
			 System.out.println("Duplicate found");
		 }
		 
		 Thread.sleep(3000);
		 driver.close();

	}

}
