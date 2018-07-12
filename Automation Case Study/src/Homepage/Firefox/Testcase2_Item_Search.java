package Homepage.Firefox;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase2_Item_Search implements Object_Repository{

	public static void main(String[] args) {
		// Launching Flipkart home page and searching some specific product and adding it to Cart
		
		
		 System.setProperty(webdriver, Path_Driver2);
		  WebDriver driver= new FirefoxDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  try {
		  driver.findElement(LoginWindowCross).click();
		  driver.findElement(Search).sendKeys("Motorola Mobiles");
		  driver.findElement(SearchButton).click();
		  driver.findElement(SelectSearchItem).click();
		  
		  String parent=driver.getWindowHandle();
		  
		// This will return the number of windows opened by Webdriver and will return Set of Strings
		Set<String>s1=driver.getWindowHandles();
		 
		// Iteration using Iterator
		Iterator<String> I1= s1.iterator();
		 
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		 
		// Comparing if parent window is not equal to child window
		 
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		 
		  System.out.println(driver.switchTo().window(child_window).getTitle());
		  Thread.sleep(3000);
		  driver.findElement(AddToCartButton).click();
		  Thread.sleep(3000);
		  driver.findElement(ContinueButton).click(); 
		  
		}
          }
		  Thread.sleep(3000);
		  driver.quit();
		}catch(Exception e) {
		  System.out.println(e);
			}
		}
		
	}

