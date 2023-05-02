package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autotest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://autotestdata.com/");
	  Thread.sleep(6000);
	 // driver.findElement(By.linkText("Need Help?")).click();
	  driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("email")).sendKeys("uma.vadla@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("uma12345");
	  driver.findElement(By.xpath("//*[@id=\"login-register-modal\"]/div/div/div[2]/section/form[1]/div[3]/button")).click();
  }
}
