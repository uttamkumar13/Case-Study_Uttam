package Homepage.Chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase4_Comparing_two_items implements Object_Repository { 

	public static void main(String[] args) {
		// Launching Flipkart home page and comparing two items
		
		 System.setProperty(webdriver, Path_Driver);
		  WebDriver driver= new ChromeDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  try {
		  driver.findElement(LoginWindowCross).click();  
		  WebElement element = driver.findElement(ElectronicsTextMousehover);
		  Actions action = new Actions(driver);
		  action.moveToElement(element).build().perform();
		  Thread.sleep(1000);
		  driver.findElement(LaptopsLink).click();
		  Thread.sleep(1000);
		  driver.findElement(DellButton).click();
		  
		  //radio button selection
		  driver.findElement(FirstRadioButton).click();
		  driver.findElement(SecondRadioButton).click();
		  driver.findElement(CompareButton).click();
		  Thread.sleep(5000);
		  driver.close();
		  		  
			    
	} catch(Exception e){
		
	}
	}

}
