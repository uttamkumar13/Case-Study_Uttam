package Homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase4_Comparing_two_items implements Object_Repository { 

	public static void main(String[] args) {
		// Launching Flipkart home page and comparing two items
		
		System.setProperty("webdriver.chrome.driver", Path_Driver);
		  WebDriver driver= new ChromeDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  try {
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();  
		  WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[1]/a/span"));
		  Actions action = new Actions(driver);
		  action.moveToElement(element).build().perform();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[1]/ul/li/ul/li[3]/ul/li[1]/a/span[1]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[2]/div[1]/div/ul/li[2]/a")).click();
		  
		  //radio button selection
		  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[2]/div/span/div/label/div")).click();
		  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[2]/div/span/div/label/div")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div[4]/div/a/span")).click();
		  Thread.sleep(5000);
		  driver.close();
		  		  
			    
	} catch(Exception e){
		
	}
	}

}
