package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
/*
 * 1.Load the URL https://www.amazon.in/
2.search as oneplus 9 pro 
3.Get the price of the first product
4. Print the number of customer ratings for the first displayed product
5. Click the first text link of the first image
6. Take a screen shot of the product displayed
7. Click 'Add to Cart' button
8. Get the cart subtotal and verify if it is correct.
9.close the browser
 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Search for "OnePlus 9 Pro",print the price & ratings
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String price = driver.findElement(By.className("a-price-whole")).getText();		
		price = price.replaceAll("[^0-9.]", "");
        float convertedPrice = Float.parseFloat(price);
		System.out.println(convertedPrice);					
		String ratingValue = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();	
		System.out.println("Global Ratings: "+ratingValue);

		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();	
	    driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles=new ArrayList<>(windowHandles);
		driver.switchTo().window(handles.get(1));		
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./takesnap/img.png");
		FileUtils.copyFile(source, destination);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		String cartPrice = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		cartPrice = cartPrice.replaceAll("[^0-9.]", "");
        float convertedCartPrice = Float.parseFloat(cartPrice);
		System.out.println("Cart Price: "+convertedCartPrice );
		Assert.assertEquals(convertedPrice, convertedCartPrice);			
		driver.quit();
		
	}

}
