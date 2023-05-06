package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckLoginWorks {

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
		WebElement selectValue1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec1 = new Select(selectValue1);
		sec1.selectByIndex(4);

		WebElement selectValue2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec2 = new Select(selectValue2);
		sec2.selectByVisibleText("Automobile");
		
		WebElement selectValue3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec3 = new Select(selectValue3);
		sec3.selectByValue("OWN_CCORP");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nisha123@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0123456789");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());

				
	}

}
