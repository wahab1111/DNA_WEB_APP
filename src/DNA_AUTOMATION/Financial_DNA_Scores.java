package DNA_AUTOMATION;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Financial_DNA_Scores {
	
	@Test
	public void Financial_DNA_Score() throws InterruptedException {
		
		
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
		Thread.sleep(40000);
		WebElement element1 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-main-users/div/div[2]/div/app-single-user-selection/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div/div[1]/app-financial-dna-score/div/div[1]"));
		WebElement element2 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-main-users/div/div[2]/div/app-single-user-selection/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div/div[1]/app-financial-dna-score/div/div[2]"));
		WebElement element3 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-main-users/div/div[2]/div/app-single-user-selection/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div/div[1]/app-financial-dna-score/div/div[3]"));
		WebElement element4 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-main-users/div/div[2]/div/app-single-user-selection/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div/div[1]/app-financial-dna-score/div/div[4]"));
		WebElement element5 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-main-users/div/div[2]/div/app-single-user-selection/div/p-tabview/div/div[2]/p-tabpanel[1]/div/div/div[1]/app-financial-dna-score/div/div[5]"));
		
		assertEquals(element1.getText(),"96%\nRisk Behavior\nRisk taker and tolerant of losses");
		assertEquals(element2.getText(),"50%\nFinancial Relationship Management\nDelegates to advisers and relationship driven");
		assertEquals(element3.getText(),"31%\nFinancial Planning Management\nDesire to spend and appreciates spending freedoms");
		assertEquals(element4.getText(),"54%\nWealth Building Motivation\nPrefers flexible goals and is often ambitious");
		assertEquals(element5.getText(),"79%\nFinancial Emotional Intelligence\nLikely to recognize and balance emotional impulses with logic");
		
		System.out.println("The Ronnie first DNA Score" +"  " + element1.getText());
		System.out.println("-------------------------------------------------");
		System.out.println("The Ronnie Second DNA Score" +"  " + element2.getText());
		System.out.println("-------------------------------------------------");
		System.out.println("The Ronnie third DNA Score" +"  " + element3.getText());
		System.out.println("-------------------------------------------------");
		System.out.println("The Ronnie fourth DNA Score" +"  " + element4.getText());
		System.out.println("-------------------------------------------------");
		System.out.println("The Ronnie fourth DNA Score" +"  " + element5.getText());
		driver.quit();

	}

}
