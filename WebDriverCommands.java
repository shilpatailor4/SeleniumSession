package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","/home/shilpatailor/Driver/geckodriver");
		
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();
		
		// Storing the Application Url in the String variable
		String Url = "http://www.store.demoqa.com";
		
		// Lounch the ToolsQA profile
		driver.get(Url);
		Thread.sleep(5000);
		
		// Storing Title name in the String variable
		String title = driver.getTitle();
		
		// Storing Title length in the Int variable
		int titleLength = driver.getTitle().length();
		
		// Printing Title & Title length in the Console window
		System.out.println("Title of the page is : " + title);
		System.out.println("Title of the pagelength is : " + titleLength);
		
		// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.equals(Url)){
			System.out.println("Verification Successful - The correct Url is opened.");
			
		}else{
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual Url is : " + actualUrl);
			System.out.println("Expected Url is : " + Url);
			
		}
		
		// Storing Page Source in String variable
		String pageSource = driver.getPageSource();
		
		// Storing Page Source length in Int variable
		int pageSourceLength = pageSource.length();
		
		// Printing length of the Page Source on console
		System.out.println("Total length of the page source is : " + pageSourceLength);
		
		Thread.sleep(5000);
		
		//Closing browser
		driver.close();
		
	
		
	}

}
