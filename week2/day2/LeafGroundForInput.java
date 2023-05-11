package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class LeafGroundForInput {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following::input)[2]")).sendKeys(Keys.ENTER);
		WebElement errorMsg = driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		Assert.assertEquals(true, errorMsg.isDisplayed());
		
		driver.findElement(By.cssSelector("input[placeholder='Babu Manickam']")).sendKeys("Nisha");
		driver.findElement(By.cssSelector("input[value='Chennai']")).sendKeys(" - India");
		WebElement txtBox = driver.findElement(By.cssSelector("input[placeholder='Disabled']"));
		Assert.assertEquals(true, !txtBox.isEnabled());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@value,'please')]")).clear();
		driver.findElement(By.xpath("//input[contains(@value,'learning')]")).isDisplayed();
		WebElement retrive = driver.findElement(By.xpath("//input[contains(@value,'learning')]"));
		String text = retrive.getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//input[contains(@placeholder,'email')]")).sendKeys("nisha123@gmail.com");		
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'yourself')]")).sendKeys("ABCD");

		driver.findElement(By.xpath("(//div[@class='card']/following::input)[5]")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("1");
		driver.findElement(By.xpath("//li[@data-item-value='11']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ui-calendar')]")).isDisplayed();
		driver.findElement(By.xpath("//input[contains(@class,'spinner-input')]")).sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@id,'slider')]")).sendKeys("80");
		driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Review Xpath Locators");
		driver.findElement(By.xpath("//input[contains(@class,'keyboard-input')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'keypad-popup')]")).isDisplayed();
		driver.quit();





	


	}

}
