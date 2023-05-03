package Testscenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoTestData5_2 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://autotestdata.com/");
	 // Thread.sleep(6000);
	 // driver.findElement(By.linkText("Need Help?")).click();
	 // driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[2]/div/button/div/div/div")).click();
	  Thread.sleep(2000);
	driver.findElement(By.id("bs-select-6-8")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[3]")).click();
	driver.findElement(By.id("exampleRadios2")).click();
	driver.findElement(By.id("total-rows-gen")).clear();
	driver.findElement(By.id("total-rows-gen")).sendKeys("15");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/div")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/button")).click();
	driver.close();
	
}
}