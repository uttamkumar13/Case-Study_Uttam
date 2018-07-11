package Homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5_Item_selection_from_offer_zone implements Object_Repository {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Path_Driver);
		  WebDriver driver= new ChromeDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  try {
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		  driver.findElement(By.xpath("//span[@class='_25Wjx4']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Big Steals of the Week")).click();
		  driver.findElement(By.xpath("//div[@class='iUmrbN']")).click();
		  
		  Thread.sleep(3000);    
		  driver.close();
		  

	} catch(Exception e){
		
	}
	}

}

