package Homepage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2_Item_Search {

	public static void main(String[] args) {
		// Launching Flipkart home page and searching some specific product
		
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Uttam\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
					
		  driver.get("https://www.flipkart.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  try {
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Motorola Mobiles");
		  driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		  driver.findElement(By.xpath("//div[@class='_3wU53n']")).click();
		  
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
		 
		System.out.println(driver.switchTo().window(child_window).getTitle());
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _14O7kc mrmU5i']")).click();
		  
		  
		}
          }
		  Thread.sleep(3000);
		  driver.quit();
		}catch(Exception e) {
		  System.out.println(e);
			}
		}
		
	}

