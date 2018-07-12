package Homepage.Chrome;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase7_Capturing_Printing_subheaders_Titles implements Object_Repository{

	public static void main(String[] args) {
		// Capturing five sub Header titles from the Flipkart homepage and printing it in console
		
		  System.setProperty(webdriver, Path_Driver);
		  WebDriver driver= new ChromeDriver();
					
		  driver.get(BaseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		  try {
		  driver.findElement(LoginWindowCross).click();
		  
		  String text1=  driver.findElement(ElectronicsLink).getText(); 
		  if(text1.equals("Electronics")) {
		       System.out.println(text1);
		       System.out.println("Pass");
	      }     else {
		   System.out.println("Fail");
	       }
		   String text2=  driver.findElement(TVsAndAppliancesLink).getText(); 
			 if(text2.equals("TVs & Appliances")) {
			       System.out.println(text2);
			       System.out.println("Pass");
		} else {
			   System.out.println("Fail");
		   }
		   
			String text3=  driver.findElement(MenLink).getText(); 
				 if(text3.equals("Men")) {
				       System.out.println(text3);
				       System.out.println("Pass");
			}else {
				   System.out.println("Fail");
			   }
		   
				   String text4=  driver.findElement(WomenLink).getText(); 
					  if(text4.equals("Women")) {
					       System.out.println(text4);
					       System.out.println("Pass");
				} else {
					   System.out.println("Fail");
				   }
		   
					   String text5=  driver.findElement(BabyAndKidsLink).getText(); 
						  if(text5.equals("Baby & Kids")) {
						       System.out.println(text5);
						       System.out.println("Pass");
					}else {
						   System.out.println("Fail");
					   }
		
						   Thread.sleep(2000);
						   driver.close();
						   
		  } catch (Exception e) {
		 }
}
}

