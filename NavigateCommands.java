package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {
	public static void main(String[] arg) {
		System.setProperty("webdriver.gecko.driver","/home/shilpatailor/Driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";
		
		driver.get(appUrl);
		
		driver.manage().window().maximize();
		
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		
		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		
		// Go back to Home Page
		driver.navigate().back();
		
		// Go forward to Registration page
		driver.navigate().forward();
		
		// Go back to Home page
		driver.navigate().to(appUrl);
		
		// Refresh browser
		driver.navigate().refresh();
		
		// Close browser
		driver.close();
		
			
	}

}
