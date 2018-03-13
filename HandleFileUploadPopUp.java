package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();// Lounch firefox
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Lounch chrome
		
		driver.get("https://html.com/input-type-file/");
		
		//Page scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)", "");
		
		//Upload file
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\SHILPA\\Desktop\\5FebRent.pdf");
		
	}

}
