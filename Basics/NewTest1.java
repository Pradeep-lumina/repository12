import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\eclipse-workspace\\Framework\\Driver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
  }
}
