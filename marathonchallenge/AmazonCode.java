package marathonchallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCode {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");	
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		
		WebElement text = driver.findElement(By.xpath("(//div[contains(@class,'a-spacing-small')])[1]"));
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("//li[@aria-label='American Tourister']//div[1]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Safari']//div[1]")).click();
		driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
		WebElement firstResult = driver.findElement(By.xpath("(//div[contains(@class,'s-title-instructions-style')])[1]"));
		System.out.println(firstResult.getText());
		
		WebElement priceResult = driver.findElement(By.xpath("(//div[contains(@class,'a-color-base')])[1]"));
		System.out.println(priceResult.getText());
		System.out.println(driver.getTitle());
		driver.close();

	}

}
