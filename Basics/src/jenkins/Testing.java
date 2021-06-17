package jenkins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\eclipse-workspace\\Framework\\Driver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://shareselenium.herokuapp.com/WebTable.html");
	  
	  WebElement table = driver.findElement(By.xpath("//table[@cellspacing='0']"));
	  
	  List <WebElement> alltable = table.findElements(By.tagName("tr"));
	  
	  System.out.println("The number of rows :"+alltable.size());
	  
	  for(WebElement tab:alltable)
	  {
		 List<WebElement> cells = table.findElements(By.tagName("th"));
		 
		 for(WebElement cell : cells)
		 {
			 String value = cell.getText();
			 System.out.print(value);
		 }
		 System.out.println();
	  }
	  
  }
}
