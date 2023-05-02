package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assginment8_1 {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  Thread.sleep(4000);
	  driver.findElement(By.name("imgbtnSignin")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.name("txtUserName")).sendKeys("uma.vadla");
	  driver.findElement(By.name("imgbtnSignin")).click();
	String sr=  driver.findElement(By.id("MessageCaption2")).getText();
	Thread.sleep(6000);
	 System.out.println(sr);
	driver.close();
	  
  }
}
