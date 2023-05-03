package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class CrossbrowserTesting {
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeClass
	public void browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver =new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
	}
	
	
	
  @Test
  public void f() throws Exception{
	  driver .get("https://www.facebook.com/");
	  Thread.sleep(5000);
	  //type username and password
	  driver.findElement(By.name("email")).sendKeys("DummyTestEmail@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("aslkjwekj");
	  //click on ligin button
	  driver.findElement(By.name("login")).click();
	  
  }
}
