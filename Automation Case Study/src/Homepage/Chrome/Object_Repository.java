package Homepage.Chrome;

import org.openqa.selenium.By;

interface  Object_Repository {
	
	String BaseURL="https://www.flipkart.com";
	String Path_Driver="D:\\Uttam\\chromedriver.exe";
	String webdriver= "webdriver.chrome.driver";	
	//Login Xpaths
	
	By Username=By.xpath("//input[@class='_2zrpKA']");
	By Password=By.xpath("//input[@type='password']");
	By Login=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	By LoggedUsername=By.xpath("//div[@class='_2cyQi_']");
	By Logout=By.linkText("Logout");
	
	//Search and Item Selection Xpaths
	
	By LoginWindowCross=By.xpath("//button[@class='_2AkmmA _29YdH8']");
	By Search=By.xpath("//input[@type='text']");
	By SearchButton=By.xpath("//button[@class='vh79eN']");
	By SelectSearchItem=By.xpath("//div[@class='_3wU53n']");
	By AddToCartButton=By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']");
	By ContinueButton=By.xpath("//button[@class='_2AkmmA _14O7kc mrmU5i']");
	By DealsOfTheDay=By.xpath("//h2[@class='puxlXr']");
	By ViewAllButton=By.xpath("//a[@class='_2AkmmA _1eFTEo']");
	By SelectFirstProduct=By.xpath("//div[@class='iUmrbN']");
	By SelectFirstItem=By.xpath("//a[@class='_2cLu-l']");
	By BuyNowButton=By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']");
	
	//Mouseover, links and checkbox Xpaths
	By ElectronicsTextMousehover=By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/a/span");
	By LaptopsLink=By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/ul/li/ul/li[3]/ul/li[1]/a/span[1]");
	By DellButton=By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div[1]/div/ul/li[2]/a");
	By FirstRadioButton=By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[2]/div/label/span");
	By SecondRadioButton=By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[2]/div/span/div/label/div");
	By CompareButton=By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[4]/div/a/span/span");		
	By OfferZoneLink=By.xpath("//span[@class='_25Wjx4']");		
	By BigStealsOfTheWeekLink=By.linkText("Big Steals of the Week");
	By SelectItem=By.xpath("//div[@class='iUmrbN']");
	By MoreDropdown=By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/div[2]/div/div/span");
	By SellOnFlipkartLink=By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/ul/li[1]/a/div");
	By StartSellingText=By.xpath("//*[@id=\"edit-submit--2\"]");
	
	//Sub-Headers xPaths
	
	By ElectronicsLink=By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/a/span");
	By TVsAndAppliancesLink=By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[2]/a/span");
	By MenLink=By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[3]/a/span");
	By WomenLink=By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[4]/a/span");
	By BabyAndKidsLink=By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[5]/a/span");
		
	
}
