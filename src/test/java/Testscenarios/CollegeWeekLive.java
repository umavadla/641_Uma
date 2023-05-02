package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CollegeWeekLive {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver;
	  
	  driver  = new ChromeDriver();
	  
	  driver.get("https://collegeweeklive.com/go-signup/");
	  Thread.sleep(5000);
	  driver.findElement(By.name("firstName")).sendKeys("Uma");
	  driver.findElement(By.name("lastName")).sendKeys("vadla");
	  driver.findElement(By.name("emailAddress")).sendKeys("uma.vadla@gmail.com");
	  driver.findElement(By.name("phoneNumber")).sendKeys("5715287028");
	  driver.findElement(By.name("password")).sendKeys("uma@12345");
	  driver.findElement(By.name("ConfirmPassword")).sendKeys("uma@12345");
	  driver.findElement(By.linkText("terms & conditions")).click();
  }
}
//a stands for ancor tag
//Hyper link-1.check the tagname of webelement
//2.if the htmlcode tagname is 'a'(Anchor),it is hyperlink
//2.use the below locators to do action on element

