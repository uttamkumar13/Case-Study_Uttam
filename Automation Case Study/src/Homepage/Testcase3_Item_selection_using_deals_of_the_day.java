package Homepage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3_Item_selection_using_deals_of_the_day implements Object_Repository {

	public static void main(String[] args) {
		// Launching Flipkart home page and selecting items from the deals of the day section
		  
		  System.setProperty("webdriver.chrome.driver", Path_Driver);
		  WebDriver driver= new ChromeDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  try {
			  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			  String text= driver.findElement(By.xpath("//h2[@class='puxlXr']")).getText();
			  System.out.println(text);
		   if(text.equals("Deals of the Day")) {
		       driver.findElement(By.xpath("//a[@class='_2AkmmA _1eFTEo']")).click();
		     //  Thread.sleep(2000);
		       driver.findElement(By.xpath("//div[@class='iUmrbN']")).click();
		       driver.findElement(By.xpath("//a[@class='_2cLu-l']")).click();
		       String parent=driver.getWindowHandle();
				  
				// This will return the number of windows opened by Webdriver and will return Set of Strings
				Set<String>s1=driver.getWindowHandles();
				 
				// Now we will iterate using Iterator
				Iterator<String> I1= s1.iterator();
				 
				while(I1.hasNext())
				{
				 
				   String child_window=I1.next();
				 
				// Here we will compare if parent window is not equal to child window then we            will close
				 
				if(!parent.equals(child_window))
				{
				driver.switchTo().window(child_window);
		       driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();
				}}	
			 
		   }else {
				  System.out.println("Deals of the Day section is not available");
			  }
		   Thread.sleep(3000);    
		   driver.quit();	
		   
		 	  	}catch(Exception e) {
		  		e.printStackTrace();
		  	}

	}
}