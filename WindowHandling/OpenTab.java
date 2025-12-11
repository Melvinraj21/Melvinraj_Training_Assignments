package SeleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenTabTest {
  @Test
  public void OpenTab() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  
	  String parentWindow = driver.getWindowHandle();
	  System.out.println(parentWindow);
	  
	  WebElement openTab = driver.findElement(By.id("opentab"));
	  openTab.click();
	  
	  Set<String> allWindows = driver.getWindowHandles();
	  for(String eachWindow: allWindows) {
		  if(!eachWindow.equals(allWindows))
			  System.out.println(eachWindow);
	  }
	  
	  System.out.println("passed");
	  
	  
  }
}
