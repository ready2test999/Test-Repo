package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://flipkart.com");
	  driver.manage().window().maximize();
	  String s = driver.getTitle();
	  System.out.println(s);
	  Assert.assertEquals(s,"abc");
	  driver.quit();
  }
}
