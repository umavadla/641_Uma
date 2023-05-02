package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JustRecharge {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://www.justrechargeit.com/");
	  Thread.sleep(4000);
	  
	  driver.findElement(By.linkText("Create New Account")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.name("signup_name")).sendKeys("Uma");
	  driver.findElement(By.name("signup_mobileno")).sendKeys("5715287028");
	  Thread.sleep(5000);
	  driver.findElement(By.name("signup_email")).sendKeys("uma.vadla@gmail.com");
	  driver.findElement(By.name("signup_password")).sendKeys("umareddy");
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.navigate().forward();
  }
}
