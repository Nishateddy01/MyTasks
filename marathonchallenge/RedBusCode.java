package marathonchallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusCode {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("chennai");		
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("dest")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("(//td[@class='we day'])[1]")).click();
		driver.findElement(By.id("search_btn")).click();
		
		WebElement text = driver.findElement(By.xpath("//span[contains(@class,'busFound')]"));
		System.out.println(text.getText());
		//input[@id='bt_SLEEPER']/following-sibling::label[1]
		//WebElement element = driver.findElement(By.xpath("//label[@title='SLEEPER']"));
       // driver.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]")).click();
		
		WebElement sleeperText = driver.findElement(By.xpath("(//div[contains(@class,'travels')])[2]"));
		System.out.println(sleeperText.getText());

		System.out.println(driver.getTitle());
	}

}
