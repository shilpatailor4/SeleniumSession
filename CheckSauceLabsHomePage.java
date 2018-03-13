package firstPackage;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckSauceLabsHomePage {

	@Test
	public void test() {
		System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://saucelabs.com");
		
		WebElement header = driver.findElement(By.id("page-header"));
		
		assertTrue((header.isDisplayed()));
		
		//fail("Not yet implemented");
		
		driver.close();
	}

}
