package Homepage.IE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testcase8_Font_Properties implements Object_Repository{

	public static void main(String[] args) {
		// Launching Flipkart and finding the Font properties
		
		  System.setProperty(webdriver, Path_Driver);
		  WebDriver driver= new InternetExplorerDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  try {
		  driver.findElement(LoginWindowCross).click();
		  
		  String text= driver.findElement(DealsOfTheDay).getText();
		  System.out.println(text);
		  
		  String text1=driver.findElement(DealsOfTheDay).getCssValue("font-size");
		  System.out.println("font-size="+text1);
		  String text2=driver.findElement(DealsOfTheDay).getCssValue("color");
		  System.out.println("color="+text2);
		  String text3=driver.findElement(DealsOfTheDay).getCssValue("font-Family");
		  System.out.println("font-Family="+text3);
		  String text4=driver.findElement(DealsOfTheDay).getCssValue("text-align");
		  System.out.println("text-align="+text4);
		  driver.close();

	} catch (Exception e) {
		e.printStackTrace();
	}
		  
}
}