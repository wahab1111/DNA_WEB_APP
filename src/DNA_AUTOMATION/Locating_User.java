package DNA_AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locating_User {

	
	
	@Test
	public void Locate_user() throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		   
		   
		   driver.get("https://app.dnabehavior.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-orange primaryButton']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ryan.Scott+Demo@dnabehavior.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("uGfX{5sat1k=$");
		driver.findElement(By.xpath("//button[@id='next']")).click();
		Thread.sleep(40000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/app-nav-bar/div/p-menubar/div/p-menubarsub/ul/li[2]/a")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/app-main-users/div/div[1]/div/div[1]/div/input")).sendKeys("Ronnie");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@class='p-element search-btn p-button p-component ng-star-inserted']")).click(); 
		Thread.sleep(30000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/app-main-users/div/div[1]/div/div[3]/p-table/div/div/table/tbody/tr[1]/td[1]\r\n"
				+ "")).click(); 	

	
	
		driver.quit();
	}
}
