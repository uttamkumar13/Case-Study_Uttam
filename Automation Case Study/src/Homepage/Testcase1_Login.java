package Homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1_Login {

 public static void main(String[] args) {
	
	// Launching Flipkart home page
	
	
	  System.setProperty("webdriver.chrome.driver", "D:\\Uttam\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
				
	  driver.get("https://www.flipkart.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  try {
	  driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("uttamkumar13@yahoo.co.in");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
	  driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	  driver.close();
	}catch(Exception e) {
	  System.out.println(e);
		}
	}

}
