package marathonchallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemasCode {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//driver.findElement(By.xpath("//input[@name='search-cities']")).sendKeys("Chennai");
		//driver.findElement(By.xpath("//img[@alt='Chennai']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Movie Library')]")).click();
		Select selectValue = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		selectValue.selectByVisibleText("Chennai");
		Select genreValue = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
		genreValue.selectByVisibleText("ANIMATION");
		Select langValue = new Select(driver.findElement(By.xpath("//select[@name='lang']")));
		langValue.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[contains(@class,'movie-wrapper')]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Select ciniValue = new Select(driver.findElement(By.xpath("//select[@name='cinemaName']")));
		ciniValue.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		Select timeValue = new Select(driver.findElement(By.xpath("//select[@name='timings']")));
		timeValue.selectByVisibleText("09:00 AM - 12:00 PM");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Nisha");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9477890567");
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nisha1202@gmail.com");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Nisha");
		Select foodValue = new Select(driver.findElement(By.xpath("//select[@name='food']")));
		foodValue.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("ABCD");

		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

		driver.findElement(By.xpath("(//button[contains(text(),'CANCEL')])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
		System.out.println(driver.getTitle());
		driver.close();


	}

}
