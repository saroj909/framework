package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Autoconstant;

public class AddUserPage implements Autoconstant
{
	public WebDriver driver;
	public WebDriverWait wait ;
	public JavascriptExecutor js ;

	// 1st part is declaration 
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRoleButton;
	@FindBy (xpath="//span[.='Admin']")
	private WebElement adminButton;
	@FindBy (xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeename;
	@FindBy (xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement status;
	@FindBy (xpath = "//div[contains(text(),'Enabled')]")
	private WebElement enabled;
	

	@FindBy (xpath = "(//input[@autocomplete='off'])[1]")
	private WebElement username;

	@FindBy (xpath = "(//input[@autocomplete='off'])[2]")
	private WebElement password;
	@FindBy (xpath = "(//input[@autocomplete='off'])[3]")
	private WebElement confirmPassword;
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement saveButton;


	public AddUserPage(WebDriver driver)
	{  
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void userRole() throws Exception
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(userRoleButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",userRoleButton);
		//addButton.click();
		List<WebElement> f=driver.findElements(By.xpath("//div[contains(text(),'Admin')]"));
		for (int i=0;i<f.size();i++)
		{
			System.out.println("hii");
			if (f.get(i).getText().contains("Admin"))
			{	Thread.sleep(5000);
			f.get(i).click();
			break;
			}
		}
	}
	public void admin()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(admin));
		js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()",addButton);
		System.out.println("admin click successfull");
		adminButton.click();
	}
	public void employeeName()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(employeename));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='saroj'", employeename);
		//addButton.click();
		System.out.println("employee name enter successfull");
	}
	public void status()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(userRoleButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",status);
		//js.executeAsyncScript("arguments[0],click()", enabled);
		//addButton.click();
		System.out.println("status enabled successfull");
	}
	public void username()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(userRoleButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='saroj123'",username);
		//addButton.click();
		System.out.println("username entry successfull");
	}
	public void password()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(userRoleButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='man9776@'",password);
		//addButton.click();
		System.out.println("password entry successfull");
	}

	public void confirmpassword()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(userRoleButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='man9776@'",confirmPassword);
		//addButton.click();
		System.out.println("password reentry successfull");
	}

	public void saveButton()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(userRoleButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",confirmPassword);
		//addButton.click();
		System.out.println("save button click successfull");
	}



}
