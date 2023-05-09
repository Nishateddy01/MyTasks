package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundForButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		driver.navigate().back();

		driver.findElement(By.xpath("//span[text()='Disabled']")).isDisplayed();
		driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).click();
    	WebElement mouseHover = driver.findElement(By.xpath("(//span[text()='Success']/parent::button[@type='button'])[1]"));
		Actions action = new Actions(driver);
    	action.moveToElement(mouseHover).perform();
    	
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		driver.findElement(By.xpath("//div[@class='ui-overlaypanel-content']//img")).click();

		driver.findElement(By.xpath("//button[contains(@class,'rounded-button')]//span[text()='Primary']")).isDisplayed();
		driver.findElement(By.xpath("//button[contains(@class,'rounded-button')]//span[text()='Secondary']")).isDisplayed();
		driver.findElement(By.xpath("(//span[text()='Success']/parent::button[@type='button'])[2]")).isDisplayed();
		driver.findElement(By.xpath("//button[contains(@class,'rounded-button')]//span[text()='Info']")).isDisplayed();
        driver.close();



	}

}
