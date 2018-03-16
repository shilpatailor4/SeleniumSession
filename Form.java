package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form {
	public static void main(String[] args) throws InterruptedException {
		
		// declaration and instantiation of objects/variables	
        System.setProperty("webdriver.gecko.driver","/home/shilpatailor/Driver/geckodriver");
        
        WebDriver driver = new FirefoxDriver();
        
        String baseUrl = "http://demo.guru99.com/test/login.html";
        
        driver.get(baseUrl);
        
        // Get the WebElement corresponding to the Email Address(TextField)	
        WebElement email = driver.findElement(By.id("email"));
        
        // Get the WebElement corresponding to the Password Field	
        WebElement password = driver.findElement(By.name("passwd"));
        
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");
        System.out.println("Text field set");
        
        Thread.sleep(3000);
        
        // Deleting values in the text box	
        email.clear();
        password.clear();
        System.out.println("Text field cleared");
        
        Thread.sleep(3000);
        
        // Find the submit button	
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        
        // Using click method to submit form		
        email.sendKeys("abcd@gmail.com");					
        password.sendKeys("abcdefghlkjl");					
        login.click();			
        System.out.println("Login Done with Click");	
        
        
      //using submit method to submit the form. Submit used on password field		
        driver.get(baseUrl);					
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");	
        
        Thread.sleep(5000);
        
        // Hit on Radio button url
        driver.get("http://demo.guru99.com/test/radio.html");
        
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        
        //Radio Button1 is selected	
        
        radio1.click();
        System.out.println("Radio Button Option 1 Selected");
        
      //Radio Button1 is de-selected and Radio Button2 is selected
        radio2.click();
        System.out.println("Radio Button Option 2 Selected");
        
        Thread.sleep(2000);
        
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
        
     // This will Toggle the Check box
        option1.click();
        
     // Check whether the Check box is toggled on
        
        if(option1.isSelected()) {
        	
        	System.out.println("Checkbox is Toggled On");
        	
        }else {
        	
        	System.out.println("Checkbox is Toggled Off");
        }
        
        Thread.sleep(4000);
        
      //Selecting Checkbox and using isSelected Method	
        driver.get("http://demo.guru99.com/test/facebook.html");
        
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
        
        for(int i=0; i<2; i++) {
        	
        	
        	chkFBPersist.click();
        	
        	System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
        	
        }
        
        driver.close();
	}

}
