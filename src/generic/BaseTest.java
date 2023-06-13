package generic;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.OrghrmHomepage;
public class BaseTest implements Autoconstant
{
	public WebDriver driver;
  @BeforeSuite
  public void excutionStart()
  {
	  System.out.println("execution start");
  }
  //@Parameters("browser")
 @BeforeClass
  //@BeforeTest
  public void openBrowser(/*String browser*/)
  {
	    EdgeOptions option = new EdgeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("disable notification");
		option.addArguments("headless browser");
		System.setProperty("webdriver.edge.silentOutput", "true");
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		
		System.setProperty(firefoxkey,firefoxvalue);
		// in selenium 4.9 system.set() is not mandatory
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		System.out.println("browser open successfuly");
  }
  
  
  @AfterClass()
 // @AfterTest
  public void closeBrowser() throws InterruptedException 
  {
	  driver.quit();
	  System.out.println("browser close successfully");
  }
  
  
  
  @AfterSuite 
  public void executionEnd()
  {
	System.out.println("execution end "); 
  
  }
  }
