package DNA_AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Automation_case {

	
	@Test
	public void login_case() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cheetay\\eclipse-workspace\\DNA_APP\\lib\\chromedriver.exe ");
		
		 
		  
		   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://app.dnabehavior.com");
	driver.manage().window().maximize();
			

	driver.findElement(By.xpath("//button[@class='btn btn-orange primaryButton']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ryan.Scott+Demo@dnabehavior.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("uGfX{5sat1k=$");
	driver.findElement(By.xpath("//button[@id='next']")).click();
		
		driver.quit();
		}

}
