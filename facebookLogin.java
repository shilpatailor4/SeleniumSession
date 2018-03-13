package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Successfully opened the website \"https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		//driver.close();
		/*do {
			
		}while(driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed()); */
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		login.sendKeys("testxyz231@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("test@123");
		
		WebElement submit = driver.findElement(By.id("loginbutton"));
		submit.click();
		
		//Thread.sleep(5);
		
		WebElement arrow = driver.findElement(By.className("_5lxt"));
		arrow.click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("Log out")).click();
		//logOut.click();
		
		Thread.sleep(6);
		driver.close();
	}

}
