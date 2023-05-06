package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TaskForFaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nisha");
		driver.findElement(By.name("lastname")).sendKeys("Amul");
		driver.findElement(By.name("reg_email__")).sendKeys("0123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("Nisha123456!~@#");
		Select dateValue = new Select(driver.findElement(By.id("day")));
		dateValue.selectByIndex(13);
		Select monthValue = new Select(driver.findElement(By.id("month")));
		monthValue.selectByIndex(1);
		Select yearValue = new Select(driver.findElement(By.id("year")));
		yearValue.selectByValue("1996");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.name("websubmit")).isDisplayed();
		System.out.println("Steps are passed");
						
	}

}
