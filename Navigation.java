package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
	public static void main(String[] arg) {
    System.setProperty("webdriver.gecko.driver","/home/shilpatailor/Driver/geckodriver");
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://google.com");
        
        Screenshot.captureScreenShot(driver);
        
        driver.navigate().to("https://www.amazon.com/");
        
        Screenshot.captureScreenShot(driver);
        
        driver.navigate().back();
        
        driver.navigate().forward();
        
        driver.navigate().back();
        
        driver.close();
	}

}
