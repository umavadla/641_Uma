package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Auto2 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://phptravels.com/demo/");
	  Thread.sleep(6000);
	 // driver.findElement(By.linkText("Need Help?")).click();
	  driver.findElement(By.name("first_name")).sendKeys("uma");
	  driver.findElement(By.name("last_name")).sendKeys("v");
	  driver.findElement(By.name("business_name")).sendKeys("vbbb");
	  driver.findElement(By.name("email")).sendKeys("vbbb");
	  
	//  driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/button")).click();
	//  Thread.sleep(2000);
 
  }
}

