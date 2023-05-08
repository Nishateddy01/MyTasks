package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Nisha");
		driver.findElement(By.id("lastNameField")).sendKeys("Amul");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nisha");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Amul");		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ABC");
		driver.findElement(By.id("createContactForm_description")).sendKeys("XYZ");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nisha123@gmail.com");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("0123456789");
		Select stateValue = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		stateValue.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Notes");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
	}

}
