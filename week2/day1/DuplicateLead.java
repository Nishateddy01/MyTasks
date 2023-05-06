package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("nisha@123@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.partialLinkText("Nisha")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();		
	    Assert.isTrue(true,"Duplicate Lead");
	    String name= "Nisha";
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.id("viewLead_firstName_sp")).equals(name);
		System.out.println("steps are passed");
		driver.close();
		


	}

}
