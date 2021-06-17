package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

	@Test
	public void method() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  //driver.findElement(By.id("email")).sendKeys("Testing");
		  
		  //driver.findElement(By.name("email")).sendKeys("Testing name");
		  
		  //driver.findElement(By.linkText("Facebook Lite")).click();
		  
		  //driver.findElement(By.partialLinkText("Facebook")).click();
		  
		  //driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("Testing css selector");
		  
		  //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/div/input")).sendKeys("Testing absolute xpath");
		  
		  //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Testing xpath");
		  
		  //driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy _9npi'])[2]")).sendKeys("Testing Relative xpath");
		  
		  driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		  
	}

}
