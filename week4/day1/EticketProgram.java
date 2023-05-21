package week4.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EticketProgram {

	public static void main(String[] args) {
	/*	
		a)Launch the browser
		b)Load the url https://www.irctc.co.in/nget/train-search
		c)Enter MS in ‘From’ textbox
		d)Enter Cape in ‘To’ textbox
		e)Click search button 
		f)Click refresh button
		g)Click WL and Click BookNow button
		e)Click No button in the alert  */
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//Load the url https://www.irctc.co.in/nget/train-search
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter MS in ‘From’ textbox
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("MS");
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
		//Enter Cape in ‘To’ textbox
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("CAPE");
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
		//Click search button 
		driver.findElement(By.xpath("//button[contains(@class,'train_Search')]")).click();
		//Click refresh button
		driver.findElement(By.xpath("//div[contains(text(),'Refresh')]")).click();
		//Click WL and Click BookNow button
		driver.findElement(By.xpath("//strong[contains(text(),'WL')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Book Now')]")).click();
		//Click No button in the alert 		
		driver.findElement(By.xpath("//span[text()='No']")).click();



		
	}

}
