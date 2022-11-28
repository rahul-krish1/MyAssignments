package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.linkText("Create New Account")).click();
		 
		 driver.findElement(By.name("firstname")).sendKeys("Rahul");
		 driver.findElement(By.name("lastname")).sendKeys("Krish");
		 driver.findElement(By.name("reg_email__")).sendKeys("8310658729");
		 driver.findElement(By.id("password_step_input")).sendKeys("facebook@123");
		 
		 WebElement day = driver.findElement(By.id("day"));
		 
		 Select days = new Select(day);
		 days.selectByValue("11");
		 
		 WebElement month = driver.findElement(By.id("month"));
		 
		 Select months = new Select(month);
		 months.selectByVisibleText("Nov");
		 
		 WebElement year = driver.findElement(By.id("year"));
		 
		 Select years = new Select(year);
		 years.selectByVisibleText("1993");
		 
		 driver.findElement(By.xpath("(//input[@name = 'sex'])[1]")).click();
		 
		 

	}

}
