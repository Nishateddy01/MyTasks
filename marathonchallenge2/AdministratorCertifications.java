package marathonchallenge2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import dev.failsafe.internal.util.Assert;
import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {
/*
 * 1. Launch Salesforce application https://login.salesforce.com/ 
 * 2. Login with username as "hari.radhakrishnan@qeagle.com"      and password as "Leaf@1234" 
 * 3. Click on Learn More link in Mobile Publisher
 *  4. Click confirm on Confirm redirect
 *  5. Click Learning 
 *  6. And mouse hover on Learning On Trailhead
 *  7. Clilck on Salesforce Certifications 
 *  8. Click on first resulting Ceritificate 
 *  9. verify - Administrator Overview page 
 *  10.Print the Certifications available for Administrator Certifications (List) 
 *  11.Take a Snapshot of Loaded Ceritificate 
 */
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//login to salesforce
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");	
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");	
		driver.findElement(By.id("Login")).click();	
		
		//click on learn more->handle windle->click on confirm in new window
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Thread.sleep(1000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<>(windowHandles);
		driver.switchTo().window(handles.get(1));	
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();			

        //click on Learning on shadow root->mousehover on Learning on Trailhead->click on Salesforce Certification
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		//Thread.sleep(1000);
		WebElement moveToLearn = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions action = new Actions(driver);
		action.moveToElement(moveToLearn).perform();
		
		WebElement cert = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		((RemoteWebDriver) driver).executeScript("arguments[0].click();",cert);//normal click is not working so used .js
		
		//check the current url equals the expected url
		Thread.sleep(1000);
		String expectedUrl = "https://trailhead.salesforce.com/en/credentials/administratoroverview/";
		String actualUrl = driver.getCurrentUrl();
		Assert.isTrue(true, actualUrl, expectedUrl);
		
		//Print all the certificates avail in the page
		List<WebElement> availCerts = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println("List of Certifications available are as follows:");
		for(WebElement each : availCerts) {
			System.out.println(each.getText());
		}
		
		//move hover to one of the certificate and perform snap
		action.moveToElement(driver.findElement(By.xpath("//div[@class='credentials-card_title']/a"))).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/certificates.png");
		FileUtils.copyFile(source, destination);
		
	}

}
