package jenkins;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.loadproof.com");
	    
	    String maintab = driver.getWindowHandle();
		System.out.println(maintab);
		
		WebElement login = driver.findElement(By.xpath("//a[@href='https://loadproof.us']"));
		login.click();
		Thread.sleep(2000);
		
	    Set<String> alltabs = driver.getWindowHandles();
		System.out.println(alltabs);
		 
		for(String tab:alltabs)
		 {
			 driver.switchTo().window(tab);
			 String title = driver.getTitle();
			 System.out.println(title);
			 
			 if(title.equals("Load Proof"))

			 {
				 WebElement signup = driver.findElement(By.id("btn2"));
					signup.click();
					Thread.sleep(2000); 
				//positive testing for valid registration credentials
					driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("saranya");
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
					driver.findElement(By.xpath("//input[@id='cpassword']")).sendKeys("123456");
					driver.findElement(By.xpath("//input[@id='userpin']")).sendKeys("1234");
                    driver.findElement(By.xpath("//input[@id='cuserpin']")).sendKeys("1234");
                    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saranyasubramanian12@gmail.com");
					driver.findElement(By.xpath("//input[@id='cardname']")).sendKeys("saranya");
					driver.findElement(By.xpath("//input[@id='cardno']")).sendKeys("4242424242424242");
				    //driver.findElement(By.xpath("//select[@id='cmonth']")).sendKeys.(Keys.ARROW_DOWN);
					//driver.findElement(By.xpath("//select[@id='ccyear']")).sendKeys.(Keys.ARROW_DOWN);
                    driver.findElement(By.xpath("//input[@id='ccaddress1']")).sendKeys("mogappair");
					driver.findElement(By.xpath("//input[@id='ccaddress2']")).sendKeys("mogappair");
					//driver.findElement(By.xpath("//select[@id='cccountry']")).sendKeys.(Keys.ARROW_DOWN);
					//driver.findElement(By.xpath("//select[@id='state']")).sendKeys.(Keys.ARROW_DOWN);
	                driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
					driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("600037");
					driver.findElement(By.xpath("//input[@id='cccvv']")).sendKeys("043");
					driver.findElement(By.xpath("//input[@id='chkagree']")).click();
					driver.findElement(By.xpath("//input[@id='button_color']")).click();

                  //i)negative testing for invalid registration credentials
					driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("ramya");
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
					driver.findElement(By.xpath("//input[@id='cpassword']")).sendKeys("123456");
					driver.findElement(By.xpath("//input[@id='userpin']")).sendKeys("1234");
                    driver.findElement(By.xpath("//input[@id='cuserpin']")).sendKeys("1234");
                    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saranyasubramanian216@gmail.com");
					driver.findElement(By.xpath("//input[@id='cardname']")).sendKeys("saranya");
					driver.findElement(By.xpath("//input[@id='cardno']")).sendKeys("4000008260003178");
				    //driver.findElement(By.xpath("//select[@id='cmonth']")).sendKeys.(Keys.ARROW_DOWN);
					//driver.findElement(By.xpath("//select[@id='ccyear']")).sendKeys.(Keys.ARROW_DOWN);
                    driver.findElement(By.xpath("//input[@id='ccaddress1']")).sendKeys("mogappair");
					driver.findElement(By.xpath("//input[@id='ccaddress2']")).sendKeys("mogappair");
					//driver.findElement(By.xpath("//select[@id='cccountry']")).sendKeys.(Keys.ARROW_DOWN);
					//driver.findElement(By.xpath("//select[@id='state']")).sendKeys.(Keys.ARROW_DOWN);
	                driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
					driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("600037");
					driver.findElement(By.xpath("//input[@id='cccvv']")).sendKeys("043");
					driver.findElement(By.xpath("//input[@id='chkagree']")).click();
					driver.findElement(By.xpath("//input[@id='button_color']")).click();

					//ii)negative testing for invalid registration credentials
					driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Lokesh");
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
					driver.findElement(By.xpath("//input[@id='cpassword']")).sendKeys("123456");
					driver.findElement(By.xpath("//input[@id='userpin']")).sendKeys("1234");
                    driver.findElement(By.xpath("//input[@id='cuserpin']")).sendKeys("1234");
                    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saranyasubramanian216@gmail.com");
					driver.findElement(By.xpath("//input[@id='cardname']")).sendKeys("saranya");
					driver.findElement(By.xpath("//input[@id='cardno']")).sendKeys("4242424242424242");
				    //driver.findElement(By.xpath("//select[@id='cmonth']")).sendKeys.(Keys.ARROW_DOWN);
					//driver.findElement(By.xpath("//select[@id='ccyear']")).sendKeys.(Keys.ARROW_DOWN);
                    driver.findElement(By.xpath("//input[@id='ccaddress1']")).sendKeys("mogappair");
					driver.findElement(By.xpath("//input[@id='ccaddress2']")).sendKeys("mogappair");
					//driver.findElement(By.xpath("//select[@id='cccountry']")).sendKeys.(Keys.ARROW_DOWN);
					//driver.findElement(By.xpath("//select[@id='state']")).sendKeys.(Keys.ARROW_DOWN);
	                driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
					driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("600037");
					driver.findElement(By.xpath("//input[@id='cccvv']")).sendKeys("043");
					driver.findElement(By.xpath("//input[@id='chkagree']")).click();
					driver.findElement(By.xpath("//input[@id='button_color']")).click();



			 
			 
			 }
		 }
		
		 driver.switchTo().window(maintab);
		 WebElement login1=driver.findElement(By.xpath("//a[@href='https://loadproof.us']"));
		 login1.click();
		 //positive testing for login credentials
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testcorp");
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			driver.findElement(By.xpath("//input[@value='login']")).click();
			
			//i)negative testing for login credentials
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("saranya.@26");
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			driver.findElement(By.xpath("//input[@value='login']")).click();
		
			//ii)negative testing for login credentials
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramyabjqwkakwdwjadijwijdqiwjdqwjdwjwi");
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			driver.findElement(By.xpath("//input[@value='login']")).click();
		
			//iii)negative testing for login credentials
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramya");
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("saranya.@26#");
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			driver.findElement(By.xpath("//input[@value='login']")).click();
		
			//iv)negative testing for login credentials
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramya");
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("saranya7638%^&**((((^^%##^&*(K");
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			driver.findElement(By.xpath("//input[@value='login']")).click();
		
			//v)negative testing for login credentials
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testcorp");
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			driver.findElement(By.xpath("//input[@value='login']")).click();
		

	}

}
