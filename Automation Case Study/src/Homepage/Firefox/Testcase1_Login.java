package Homepage.Firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase1_Login implements Object_Repository{

 public static void main(String[] args) {
	
	// Launching Flipkart home page and logging using proper Credentials
	
	
	  System.setProperty(webdriver, Path_Driver2);
	  WebDriver driver= new FirefoxDriver();
				
	  driver.get(BaseURL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  try {
	  driver.findElement(Username).sendKeys("uttamkumar13@yahoo.co.in");
	  driver.findElement(Password).sendKeys("Test@123");
	  driver.findElement(Login).click();
	  
	  WebElement element = driver.findElement(LoggedUsername);
	  Actions action = new Actions(driver);
      action.moveToElement(element).build().perform();
	  driver.findElement(Logout).click();
	    
	  Thread.sleep(3000);
	  driver.close();
	 	}catch(Exception e) {
	  System.out.println(e);
		}
	}

}
