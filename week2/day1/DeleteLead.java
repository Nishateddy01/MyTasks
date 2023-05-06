package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("0123456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.partialLinkText("Nisha")).click();
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("0123456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//System.out.println(driver.findElement(By.className("x-paging-info")).getText());
		driver.close();
		
	}

}
