package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment8_2 {
  @Test
  public void f() {
	  WebDriver driver;
	  driver =new ChromeDriver();
	  driver.get("https://blazedemo.com/");
	 Select sc= new Select(driver.findElement(By.name("fromPort")));
	 sc.selectByVisibleText("Portland");
	 Select sc1= new Select(driver.findElement(By.name("toPort")));
	 sc1.selectByVisibleText("London");
	 driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
	 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
	 driver.findElement(By.name("inputName")).sendKeys("uma");
	 driver.findElement(By.name("address")).sendKeys("23236 hanwoth");
	 
	 driver.findElement(By.name("city")).sendKeys("Ash");
	 driver.findElement(By.name("state")).sendKeys("VA");
	 driver.findElement(By.name("zipCode")).sendKeys("20148");
	 Select sc3= new Select(driver.findElement(By.name("cardType")));
	 sc3.selectByVisibleText("American Express");
	 driver.findElement(By.name("creditCardNumber")).sendKeys("1223234345");
	 driver.findElement(By.name("creditCardMonth")).sendKeys("12");
	 driver.findElement(By.name("creditCardMonth")).sendKeys("12");
	 driver.findElement(By.name("creditCardYear")).sendKeys("2002");
	 driver.findElement(By.name("nameOnCard")).sendKeys("UMA");
	 driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
	 
	 
	 
	 
	 
  }
	  
  }

