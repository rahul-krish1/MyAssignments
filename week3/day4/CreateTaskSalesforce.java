package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTaskSalesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
        option.addArguments("-disable-notifications");
        
		 ChromeDriver driver=new ChromeDriver(option);
		 driver.get("https://login.salesforce.com");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		 driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Testleaf$321");
		 driver.findElement(By.xpath("//input[@id = 'Login']")).click();
		 
//		 4) Click on Global Actions SVG icon(App Launcher)
//		 5) Click view all
		 driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
		 driver.findElement(By.xpath("(//button[@class = 'slds-button'])[2]")).click();
		 
//		 6) Type task and select task
//		 7) Click New Task under dropdown icon
		 driver.findElement(By.xpath("//input[@class = 'slds-input']")).sendKeys("tasks");
		 driver.findElement(By.xpath("//mark[text() = 'Tasks']")).click();
		 
		 driver.findElement(By.xpath("//a[contains(@class, 'slds-button--icon-border-filled')]")).click();
		 WebElement newTask = driver.findElement(By.xpath("//div[@class = 'forceActionLink']"));
		 driver.executeScript("arguments[0].click()", newTask);
		 
//		 6) Enter subject as "Bootcamp "                                              
//		 8) Select status as 'Waiting on someone else'
		 driver.findElement(By.xpath("//input[@class = 'slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		 driver.findElement(By.xpath("//a[@class = 'select']")).click();
		 driver.findElement(By.xpath("//a[text() = 'Waiting on someone else']")).click();
		 
//		 9) Save and verify the 'Task created' message
		 driver.findElement(By.xpath("(//span[@class = ' label bBody'])[3]")).click();
		 
		 Thread.sleep(3000);
		 
		 String message = driver.findElement(By.xpath("//div[@class = 'forceVisualMessageQueue']")).getText();
		 System.out.println(message);
		 
		 String actmessage = "Task Bootcamp was created.";
		 
		 boolean equals = message.equals(actmessage);
		 System.out.println(equals);
	}

}
