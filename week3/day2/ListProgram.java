package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListProgram {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);	
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		List<Integer> list = new ArrayList<>();
		for (WebElement each : prices) {
			String text = each.getText();
			String replacedText = text.replaceAll(",", "");
			if(!replacedText.isEmpty()) {
				int convertPrice = Integer.parseInt(replacedText);
				list.add(convertPrice);			

			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list.get(0));
	
	}
	
	 //Load the url(https://www.amazon.in/)
    //Search for mobiles in the search box ad click Enter
    //get all the mobile price
        //List<WebElement> prices = driver.findElements(By.className("a-price-whole"));    
        //Iterate through for each loop and get text
        //After getting the text-It will print some white spaces
        //to remove comma from the text
        //String replaced String = text.replaceAll(",","");
        //Convert String to Integer
      //Declare a list 
      //List<Integer> list = new ArrayList<>();
     /* for(){
         if (!replacedString.isEmpty()) {
            //int numbers = Integer.parseInt(replaced String);
         list.add(numbers);
      }   
      } */
      //Print list
      //Sort the list
      //print the least mobile price(Hint:use get())

}
