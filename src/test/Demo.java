package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
  public static void main(String[] args)
  {
	System.setProperty("webdriver.driver.chromedriver","./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String dr = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])//div//div[1]")).getText();
	System.out.println(dr);
	driver.quit();
	
	
	  
}
}
