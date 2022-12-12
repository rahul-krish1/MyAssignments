package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertificationsSalesforce {

	@Test
	public void runArchitectSforce() throws InterruptedException {
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
		 
//		 3. Click on Learn More link in Mobile Publisher  and click Confirm
		 driver.findElement(By.xpath("//span[text() = 'Learn More']")).click();
		 
		 Set<String> newWindow = driver.getWindowHandles();
		 List<String> newWindow1 = new ArrayList<String>(newWindow);
		 
		 driver.switchTo().window(newWindow1.get(1));
		 
		 driver.findElement(By.xpath("//button[text() = 'Confirm']")).click();
		 
		 Thread.sleep(3000);
		 
//		 4. Click Learning and Mouse hover on Learning On Trailhead
		 Shadow sh = new Shadow(driver);
		 sh.findElementByXPath("//span[text() = 'Learning']").click();
//		 sh.findElementByXPath("//span[text() ='Learning on Trailhead']");
		 
		 Thread.sleep(3000);
		 
		 Shadow sh1 = new Shadow(driver);
		 sh1.setImplicitWait(10);
		 WebElement learnt = sh1.findElementByXPath("//span[text() ='Learning on Trailhead']");
//		 WebElement learning = driver.findElement(By.xpath("//span[text() ='Learning on Trailhead']"));
		 Actions mhover = new Actions(driver);
		 mhover.moveToElement(learnt).perform();
		 
//		 5. Select SalesForce Certification
		 Shadow sh2 = new Shadow(driver);
		 sh2.setImplicitWait(10);
		 WebElement salc = sh2.findElementByXPath("//a[text() = 'Salesforce Certification']");
		 driver.executeScript("arguments[0].click()", salc);
		 
		 
//		 6. Choose Your Role as Salesforce Architect and verify the URL
		 WebElement image = driver.findElement(By.xpath("(//img[@class = 'roleMenu-item_img'])[2]"));
		 driver.executeScript("arguments[0].click()", image);
		 
		 String currentUrl = driver.getCurrentUrl();
		 String expUrl = "https://trailhead.salesforce.com/en/credentials/architectoverview/";
		 
		 boolean equals = currentUrl.equals(expUrl);
		 System.out.println(equals);
		 
//		 7. Get the Text(Summary) of Salesforce Architect
		 String textSummary = driver.findElement(By.xpath("//div[contains(@class ,'cert-site_text slds-text')]")).getText();
		 System.out.println(textSummary);
		 
		 Thread.sleep(3000);
		
//		 8. Get the List of Salesforce Architect Certifications Available
		 List<WebElement> listCert = driver.findElements(By.xpath("//div[@class = 'credentials-card_title']/a"));
//		 List<WebElement> listCert = driver.findElements(By.xpath("//a[text() = 'Application Architect']"));
		 System.out.println(listCert.size());
		 
		 List<String> certName = new ArrayList<String>();
		 
		 for (WebElement allNames : listCert) {
			 certName.add(allNames.getText());
			 System.out.println(allNames.getText());
			
		}
		 
//		 9. Click on Application Architect
		 WebElement appArct = driver.findElement(By.xpath("//a[text() = 'Application Architect']"));
		 driver.executeScript("arguments[0].click()", appArct);
		 
//		 10.Get the List of Certifications available
		 List<WebElement> arctApp = driver.findElements(By.xpath("//div[@class = 'credentials-card_title']/a"));
		 System.out.println(arctApp.size());
		 
		 List<String> appName = new ArrayList<String>();
		 
		 for (WebElement allCert : arctApp) {
			 appName.add(allCert.getText());
			 System.out.println(allCert.getText());
			
		}
		 
		 
		 driver.quit();
		 
	}

}
