package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Autoconstant;
import generic.ReadExcelData;

public class OrghrmHomepage extends ReadExcelData  implements Autoconstant
{   
	public WebDriver driver;
	public WebDriverWait wait ;
	public JavascriptExecutor js;

	@FindBy (xpath="//a[@href='/web/index.php/admin/viewAdminModule']")
	private WebElement adminButton;
	@FindBy(xpath="//a[normalize-space()='']")
	private WebElement pimbutton;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']")
	private WebElement leaveButton;
	@FindBy(xpath="//span[normalize-space()='Time']")
	private WebElement timeButton;
	@FindBy(xpath="//span[normalize-space()='Recruitment']")
	private WebElement requirmentButton;
	@FindBy(xpath="//span[normalize-space()='My Info']")
	private WebElement myinfoButton;
	@FindBy(xpath="//span[normalize-space()='Performance']")
	private WebElement performanceButton;
	@FindBy(xpath="//span[normalize-space()='Dashboard']")
	private WebElement dashboardButton;
	@FindBy(xpath="//span[normalize-space()='Directory']")
	private WebElement directoryButton;	
	@FindBy (xpath="//span[normalize-space()='Maintenance']")
	private WebElement maintanceButton;
	@FindBy (xpath="//span[normalize-space()='Buzz']")
	private WebElement buzzButton;
	@FindBy(xpath="//img[@class='oxd-userdropdown-img']")
	private WebElement logoutlink;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoulink2;
	@FindBy (xpath="//input[@placeholder='Username']")
	private WebElement usernametextfiled;
	
	
	// Initialization part
	public OrghrmHomepage(WebDriver driver)
	{    this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	//utilization
	public void logoutMethod() throws InterruptedException
	{   
		js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", logoutlink);
		//js.executeScript("arguments[0].click()", logoulink2);
		//wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		logoutlink.click();
		Thread.sleep(5000);
		logoulink2.click();
	}
	public void adminButtonMethod()
	{ 
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", adminButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(adminButton));
		//adminButton.click();
	}
	public void pimMethod()
	{  
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", pimbutton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(pimbutton));
		//pimbutton.click();
	}
	public void leaveMethod()
	{  
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", leaveButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(leaveButton));
		//leaveButton.click();
	}
	public void timeMethod()
	{ 
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", timeButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(timeButton));
		//timeButton.click();
	}
	public void requirmentMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", requirmentButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(requirmentButton));
		//requirmentButton.click();
	}
	public void myinfoMethod()
	{ 
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", myinfoButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(myinfoButton));
		//myinfoButton.click();
	}
	public void performanceMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", performanceButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(performanceButton));
		//performanceButton.click();
	}
	public void dashboardMethod()
	{   
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", dashboardButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(dashboardButton));
		//dashboardButton.click();
	}
	public void directoryMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", directoryButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(directoryButton));
		//directoryButton.click();
	}
	public void maintanceMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", maintanceButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(maintanceButton));
		//maintanceButton.click();
	}
	public void buzzMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", buzzButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(buzzButton));
		//buzzButton.click();
	}
}
