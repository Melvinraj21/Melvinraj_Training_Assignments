package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTest {
  @Test
  public void Navigate() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/?zx=1765439843729&no_sw_cr=1");
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://www.battlegroundsmobileindia.com/");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  driver.navigate().to("https://www.youtube.com/");
	  Thread.sleep(2000);
	  driver.navigate().refresh();
  }
}
