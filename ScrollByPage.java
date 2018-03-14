package newpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollByPage {
	public static void main(String[] arg) {
		System.setProperty("webdriver.gecko.driver","/home/shilpatailor/Driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");

        //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}

}
