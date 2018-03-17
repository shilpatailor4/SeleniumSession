package firstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//dynamic wait
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.get("http://spicejet.com/");
		 
		 Thread.sleep(5000);
		 
		 Actions action = new Actions(driver);
		 
		 action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.linkText("SpiceClub Membership Offer")).click();
		 
		 driver.close();


	}

}
