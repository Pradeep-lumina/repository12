package jenkins;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.navigate().to("https://www.gmail.com/");
			
			driver.manage().window().maximize();
			/*
			String title = driver.getTitle();
			System.out.println("The title is "+title);
			*/
			
			System.out.println(driver.getTitle());
			
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			
			//System.out.println(driver.getPageSource());
			
			WebElement text = driver.findElement(By.xpath("//div[@id='headingSubtext']"));
			System.out.println(text.getText());
			
			WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));
			username.sendKeys("Testing");
			Thread.sleep(2000);
			
			System.out.println(username.getAttribute("value"));
			
			//driver.findElement(By.linkText("Help")).click();
			//username.clear();
			//Thread.sleep(2000);
			/*
			username.sendKeys("Automation");
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			Thread.sleep(2000);
			*/
			
			//Boolean next = driver.findElement(By.xpath("//span[text()='Nexts']")).isDisplayed();
			//System.out.println("The give locators is "+next);
			//driver.quit();
			try {
			WebElement next = driver.findElement(By.xpath("(//button[@jsname='LgbsSes'])[1]"));
			
			if(next.isDisplayed())
			{
				
				next.click();
			}
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			System.out.println("Is display completed");
			
			Alert alert = driver.switchTo().alert();
			alert.accept();

	}

}
