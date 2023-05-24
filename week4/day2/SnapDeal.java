package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws IOException, InterruptedException {
/*
1. Launch https://www.snapdeal.com/
2. Go to Mens Fashion
3. Go to Sports Shoes
4. Get the count of the sports shoes
5. Click Training shoes
6. Sort by Low to High
7. Check if the items displayed are sorted correctly
8.Select the price range (900-1200)
9.Filter with color Navy 
10 verify the all applied filters 
11. Mouse Hover on first resulting Training shoes
12. click QuickView button
13. Print the cost and the discount percentage
14. Take the snapshot of the shoes.
15. Close the current window
16. Close the main window
 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement men = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		String count = driver.findElement(By.xpath("//div[contains(@class,'child-cat-count')]")).getText();
		System.out.println("sports_shoes count:" +count);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[@class='sort-label']")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		Thread.sleep(3000);
		 List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		 for (WebElement each : price) {
			System.out.println(each.getText());
		}		 
		 
		 driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("fromVal")).sendKeys("900");
		 driver.findElement(By.name("toVal")).sendKeys("1200");
		 driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		 String filters = driver.findElement(By.className("filters")).getText();
		 System.out.println("Filters applied: " +filters);
		 Thread.sleep(3000);
		 WebElement shoeImg = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		 Actions shoeBuilder=new Actions(driver);
		 shoeBuilder.moveToElement(shoeImg).perform();
		 driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		 String price2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		 System.out.println("Price of the shoe:"+price2);
		 String discount = driver.findElement(By.xpath("//span[contains(@class,'percent-desc')]")).getText();
		 System.out.println("Discount of the shoe:"+discount);

		 File source = driver.getScreenshotAs(OutputType.FILE);
		 File destination = new File("./snapshot/shoe.png");
		 FileUtils.copyFile(source, destination);
		 driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
         System.out.println(driver.getTitle());
		 driver.quit();
		 
	}

}
