package Homepage.IE;

import java.util.concurrent.TimeUnit;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase6_Opening_Sell_on_flipkart_link implements Object_Repository {

	public static void main(String[] args) {
		// Launching Flipkart home page and opening sell on flipkart page and navigate back to Flipkart homepage
		
		  System.setProperty(webdriver, Path_Driver);
		  WebDriver driver= new InternetExplorerDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  try {
		  driver.findElement(LoginWindowCross).click();
		  WebElement element = driver.findElement(MoreDropdown);
		  Actions action = new Actions(driver);
		  action.moveToElement(element).build().perform();
		  Thread.sleep(1000);
		  driver.findElement(SellOnFlipkartLink).click();
		  		  		    
		  String text=  driver.findElement(StartSellingText).getText(); 
		  System.out.println(text);
		   if(text.equals("Start Selling")) {
		       driver.navigate().back();
		   }else {
			   System.out.println("Fail");
		   }
		  Thread.sleep(1000);
		  driver.close();
		  }catch(Exception e){

     }
 
}
}