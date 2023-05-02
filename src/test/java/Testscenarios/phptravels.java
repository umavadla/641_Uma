package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class phptravels {
  @Test
  public void f() throws InterruptedException {
WebDriver driver;
	  
	  driver  = new ChromeDriver();
	  
	  driver.get("https://phptravels.com/demo/");
	  Thread.sleep(6000);
	  driver.findElement(By.linkText("Sign Up")).click();
  }
}
