package Homepage.Chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5_Item_selection_from_offer_zone implements Object_Repository {

	public static void main(String[] args) {
		// Launching Flipkart home page and selecting item from offer zone
		
		 System.setProperty(webdriver, Path_Driver);
		  WebDriver driver= new ChromeDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  try {
		  driver.findElement(LoginWindowCross).click();
		  driver.findElement(OfferZoneLink).click();
		  Thread.sleep(2000);
		  driver.findElement(BigStealsOfTheWeekLink).click();
		  driver.findElement(SelectItem).click();
		  
		  Thread.sleep(3000);    
		  driver.close();
		  
	} catch(Exception e){
		
	}
	}

}

