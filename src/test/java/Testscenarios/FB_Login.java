package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_Login {
  @Test
  public void f() {
	  //create webdriver object
	  WebDriver driver;
	  
	  //open any browser
	  driver = new ChromeDriver();
	  
	  
	  //type fb url
	  driver .get("https://www.facebook.com/");
	  //type username and password
	  driver.findElement(By.name("email")).sendKeys("DummyTestEmail@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("aslkjwekj");
	  //click on ligin button
	  driver.findElement(By.name("login")).click();
	  
	  
  }
}
//web driver locators:
//8 loactors we have
//ID,NAME,CLASS,LINK TEXT,PARTIAL LINK TEXT,TAGNAME,CSS SELECTOR,XPATH
//WEB DRIVER METHODS
//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email or phone number" autofocus="1" aria-label="Email or phone number">
