package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException{
		/*
1) Go to https://www.nykaa.com/
2) Mouseover on Brands and Search L'Oreal Paris
3) Click L'Oreal Paris
4) Check the title contains L'Oreal Paris(Hint-GetTitle)
5) Click sort By and select customer top rated
6) Click Category and click Hair->Click haircare->Shampoo
7) Click->Concern->Color Protection
8)check whether the Filter is applied with Shampoo
9) Click on L'Oreal Paris Colour Protect Shampoo
10) GO to the new window and select size as 175ml
11) Print the MRP of the product
12) Click on ADD to BAG
13) Go to Shopping Bag 
14) Print the Grand Total amount
15) Click Proceed
16) Click on Continue as Guest
17) Check if this grand total is the same in step 14
18) Close all windows
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement brands = driver.findElement(By.linkText("Brands"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		
		driver.findElement(By.xpath("//input[@placeholder='search brands']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(@class,'css-1aucgde')]")).click();
		driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']//following-sibling::div")).click();		
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']/following::div")).click();
		driver.findElement(By.xpath("//span[text()='Filters Applied']/following::span[text()='Color Protection']")).isDisplayed();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='product-list-wrap']//div")).click();		
		Thread.sleep(1000);
		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		Thread.sleep(700);
		
		System.out.println(driver.findElement(By.className("css-1jczs19")).getText().replaceAll("[^0-9.]", ""));
		
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		Thread.sleep(500);		
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		Thread.sleep(500);
		driver.switchTo().frame(0);
		String price = driver.findElement(By.xpath("//span[contains(@class,'css-1um1mkq')]")).getText();
		price = price.replaceAll("[^0-9.]", "");
		System.out.println("total Price: "+price);
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		Thread.sleep(2000);		
		driver.switchTo().window(windowHandles.get(0));
		
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		driver.switchTo().frame(0);
		String totalPrice = driver.findElement(By.xpath("//span[contains(@class,'css-1um1mkq')]")).getText();
		totalPrice = totalPrice.replaceAll("[^0-9.]", "");
		System.out.println("Total: "+totalPrice);
		Assert.assertEquals(totalPrice, price);			

		driver.quit();
		
	}

		




	}


