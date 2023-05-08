package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Amul");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nisha");	
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nisha123@gamil.com");
		Select stateValue = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		stateValue.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Notes");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();
}
}
