package Homepage.Firefox;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase3_Item_selection_using_deals_of_the_day implements Object_Repository {

	public static void main(String[] args) {
		// Launching Flipkart home page and selecting items from the deals of the day section
		  
		 System.setProperty(webdriver, Path_Driver2);
		  WebDriver driver= new FirefoxDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  try {
			  driver.findElement(LoginWindowCross).click();
			  String text= driver.findElement(DealsOfTheDay).getText();
			  System.out.println(text);
		   if(text.equals("Deals of the Day")) {
		       driver.findElement(ViewAllButton).click();
		     //  Thread.sleep(2000);
		       driver.findElement(SelectFirstProduct).click();
		       driver.findElement(SelectFirstItem).click();
		       String parent=driver.getWindowHandle();
				  
			// This will return the number of windows opened by Webdriver and will return Set of Strings
				Set<String>s1=driver.getWindowHandles();
				 
			//  Iteration using Iterator
				Iterator<String> I1= s1.iterator();
				 
				while(I1.hasNext())
				{
				  String child_window=I1.next();
				 
				// Comparing if parent window is not equal to child window
				 
				if(!parent.equals(child_window))
				{
				driver.switchTo().window(child_window);
		        driver.findElement(BuyNowButton).click();
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