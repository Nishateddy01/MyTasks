package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		/*		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login" 
		 * 2. Enter UserName and Password Using Id Locator 
		 * 3. Click on Login Button using Class Locator
		 * 4. Click on CRM/SFA Link
		 * 5. Click on contacts Button
		 * 6. Click on Merge Contacts using Xpath Locator
		 * 7. Click on Widget of From Contact
		 * 8. Click on First Resulting Contact
		 * 9. Click on Widget of To Contact
		 * 10. Click on Second Resulting Contact
		 * 11. Click on Merge button using Xpath Locator
		 * 12. Accept the Alert
		 * 13. Verify the title of the page
		 */
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//---------From click From Contact------------
		driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();		
        String popupWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();      
        List<String> handles=new ArrayList<String>(windowHandles);
        driver.switchTo().window(handles.get(1));                
        driver.findElement(By.xpath("//a[@class='linktext']")).click();        
        driver.switchTo().window(popupWindow);
        
		//---------To click From Contact------------
        driver.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();
        String popupWindow2 = driver.getWindowHandle();
        Set<String> windowHandles2 = driver.getWindowHandles();                    
        List<String> handles2=new ArrayList<String>(windowHandles2);
        driver.switchTo().window(handles2.get(1));
        driver.findElement(By.name("firstName")).sendKeys("nisha");
        driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='linktext']")).click();
        driver.switchTo().window(popupWindow2);
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        
        driver.switchTo().alert().accept();
		
        String pageTitle="View Contact";
		System.out.println(driver.getTitle());
		Assert.assertEquals(true, driver.getTitle().contains(pageTitle));		
	}

}
