package marathonchallenge2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
/*
 * Instance URL:https://dev70206.service-now.com 
 * Username: admin 
 * Password: g=Sl+bJvA99D 
 * 1. Launch ServiceNow application 
 * 2. Login with valid credentials username as admin and password  
 * 3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog 
 * 4. Click on  mobiles 
 * 5. Select Apple iphone6s 
 * 6. Update color field to Rose gold and storage field to 128GB 
 * 7. Select  Order now option 
 * 8. Verify order is placed and copy the request number" 
 * 9.Take a snapshot of Order status page.
 */
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://dev70206.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//login to ServiceNow application 
		driver.findElement(By.id("user_name")).sendKeys("admin");	
		driver.findElement(By.id("user_password")).sendKeys("g=Sl+bJvA99D");	
		driver.findElement(By.id("sysverb_login")).click();	
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		//Click->All->Service catalog in filter navigator
	    shadow.findElementByXPath("//div[text()='All']").click();
	    shadow.findElementByXPath("//span[text()='Service Catalog']").click();
	    //handle frames->click on Modile->Iphone 6s
	    WebElement handleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	    driver.switchTo().frame(handleFrame);
	    Thread.sleep(500);
	    driver.findElement(By.partialLinkText("Mobiles")).click();
	    driver.findElement(By.xpath("//strong[text()='iPhone 6s']")).click();
	    //choose Gold color,128gb storgae
	    WebElement colourSelect = driver.findElement(By.xpath("//span[text()='What color would you like?']/following::select"));
	    Select color = new Select(colourSelect);
	    color.selectByVisibleText("Gold");
	    WebElement storageSelect = driver.findElement(By.xpath("//span[text()='How many gigs of storage?']/following::select"));
	    Select storage = new Select(storageSelect);
	    storage.selectByIndex(2);
	    //click on order
	    driver.findElement(By.id("oi_order_now_button")).click();
	    Thread.sleep(1000);
	    //Verify Req id
	    driver.findElement(By.id("requesturl")).isDisplayed();
	    WebElement reqId = driver.findElement(By.id("requesturl"));

	    System.out.println("ORDER ID:"+ reqId);
        //Take snap
	    File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/orders.png");
		FileUtils.copyFile(source, destination);

	}

}
