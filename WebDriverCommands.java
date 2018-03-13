package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		String Url = "http://www.store.demoqa.com";
		driver.get(Url);
		
		System.out.println("Successfully opened the website http://www.store.demoqa.com");
		
		String title = driver.getTitle();
		
		int titleLength = driver.getTitle().length();
		
		System.out.println("Title page is : " + title);
		System.out.println("Title page length is : " + titleLength);
		
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.equals(Url))
		{
			System.out.println("Verification Successful - The correct Url is opened.");
		}else {
			System.out.println("Verification Failed - An incorrect Url is opened.");
			
			System.out.println("Actual url is : " + actualUrl);
			System.out.println("Expected url is : " + Url);
		}
		
		String pageSource = driver.getPageSource();
		System.out.println("Total length of the page source is : " + pageSource);
		
		Thread.sleep(8000);
		driver.close();
		
		
		
	}

}
