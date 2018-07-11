package Homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase1_Login implements Object_Repository{

 public static void main(String[] args) {
	
	// Launching Flipkart home page
	
	
	  System.setProperty("webdriver.chrome.driver", Path_Driver);
	  WebDriver driver= new ChromeDriver();
				
	  driver.get(BaseURL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  try {
	  driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("uttamkumar13@yahoo.co.in");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
	  driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	  
	  WebElement element = driver.findElement(By.xpath("//div[@class='_2cyQi_']"));
	  Actions action = new Actions(driver);
      action.moveToElement(element).build().perform();
	   
      driver.findElement(By.linkText("Logout")).click();
	    
	  
	  Thread.sleep(3000);
	  driver.close();
	 	}catch(Exception e) {
	  System.out.println(e);
		}
	}

}
