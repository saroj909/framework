package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BasePage implements Autoconstant  // method storing class
{
	//Select Class
		public void selectbyvisibletext(WebElement element , String text)
		{
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}
		
		//Actions Class
		public void movetoelement(WebDriver driver , WebElement element)
		{
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
		}
		
		//Robot Class
		public void robotClass() throws AWTException
		{
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		//Alert Interface
		public void alertacceptForpopup(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		
		public void alertenter(WebDriver driver , String text)
		{
			driver.switchTo().alert().sendKeys(text);
		}
		
		//JavascriptExecutor Interface
		public void javascriptclick(WebDriver driver , WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
			js.executeScript("argument[0].value='hii'", element);
		}
		
		//WebDriver Interface
		public void gettitle(WebDriver driver , String text)
		{
			String actualTitle=driver.getTitle();
			if(actualTitle.contains(text))
			{
				System.out.println("titles are matching");
			}
			else
			{
				System.out.println("titles are not matching");
			}
		}
		
		// Hard and soft Assert
		public void hardAssertclass(WebDriver driver)
		{
			String exceptedtitle = driver.getTitle();
			String actualtitle = exceptedtitle;
			
			Assert.assertEquals(actualtitle, exceptedtitle);
			
		}
		
		public void softAssertclass(WebDriver driver)
		{
			String exceptedtitle = driver.getTitle();
			String actualtitle = exceptedtitle;
			
			SoftAssert s = new SoftAssert();
			s.assertEquals(actualtitle,exceptedtitle );
			System.out.println("assert use succesfull");
			s.assertAll();
			
		}
		
		//WebDriverWait Class
		public void visibilityofelementlocated(WebDriver driver , By locator)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public void titleis(WebDriver driver , String title)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(title));
		}
}
