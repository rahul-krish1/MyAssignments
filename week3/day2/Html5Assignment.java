package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html5Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://html.com/tags/table/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 List<WebElement> rows = driver.findElements(By.xpath("//div[@class = 'wrapper wrapper-main clearfix']//tr"));
		 int rowCount = rows.size();
		 System.out.println("No of Rows in HTML5 page is : " + rowCount);
		 
		 List<WebElement> columns = driver.findElements(By.xpath("//div[@class = 'wrapper wrapper-main clearfix']//th"));
		 int columnCount = columns.size();
		 System.out.println("No of Columns in HTML5 page is : " + columnCount);
		 
		 Thread.sleep(3000);
		 
		 driver.close();
	}

}
