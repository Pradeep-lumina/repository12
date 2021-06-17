package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.navigate().to("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			//driver.findElement(By.linkText("Forgotten password?")).click();
			
			//driver.findElement(By.partialLinkText("Forgotten")).click();
			
			//driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("Testing");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Testing xpath");

	}

}
