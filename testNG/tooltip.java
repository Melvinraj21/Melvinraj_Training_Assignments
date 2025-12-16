package MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TooltipTest {
  @Test
  public void Tooltip() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/?zx=1765904149249&no_sw_cr=1");  
	  driver.manage().window().maximize();
	  
	  
	  WebElement micIcon = driver.findElement(
              By.xpath("//div[@aria-label='Search by voice']"));
	  
	  String tooltip = micIcon.getAttribute("aria-label");
	  System.out.println(tooltip);
	  
	  
  }  
	  
}
//div[@jscontroller='lpsUAf']
//div[@aria-label='Search by voice']