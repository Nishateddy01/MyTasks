package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LeafGroundForRadio {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("(//label[text()='Chrome']/preceding-sibling::div)[1]")).click();
		
		driver.findElement(By.xpath("(//label[text()='Chennai']/preceding-sibling::div)[1]")).click();
		WebElement radioValue = driver.findElement(By.xpath("(//label[text()='Chennai']/preceding-sibling::div)[1]"));
		driver.findElement(By.xpath("(//label[text()='Chennai']/preceding-sibling::div)[1]")).click();
		Assert.assertEquals(true, !radioValue.isSelected());

		driver.findElement(By.xpath("(//label[text()='Safari']/preceding-sibling::div)[2]")).click();
		driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div")).click();
        driver.close();
	}

}
