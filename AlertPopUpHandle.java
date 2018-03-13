package firstPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","D:\\Drivers\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();// Lounch firefox
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();// click on GO btn
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
	
	    if(text.equals("Please enter a valid user name")) {
	    	System.out.println("correct alert message");
	    }else {
	    	System.out.println("In-correct alert message");
	    }
		
		alert.accept();// click on Ok btn
		
		//alert.dismiss();// click on Cancel btn
		
		driver.close();
		
		
	}	

}
