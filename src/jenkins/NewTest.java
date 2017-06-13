package jenkins;

import org.openqa.selenium.By;
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
	  driver.findElement(By.name("jenkins"));
	  Assert.assertEquals(s,"Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More");
	  driver.quit();
  }
}
