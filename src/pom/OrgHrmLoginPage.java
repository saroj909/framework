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

public class OrgHrmLoginPage extends ReadExcelData implements Autoconstant
{   public WebDriver driver;
    public WebDriverWait wait ;
    public JavascriptExecutor js ;
	
	// 1st part is declaration 
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTextField;
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordTextField;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	//2nd part is initialization
	
	public OrgHrmLoginPage(WebDriver driver)
	{  
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	//3rd part is utilization
	
	public void loginMethod( ) throws Exception 
	{   
		js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", loginButton);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		wait.until(ExpectedConditions.visibilityOf(usernameTextField));
		wait.until(ExpectedConditions.visibilityOf(passwordTextField));
		usernameTextField.sendKeys(excellLibrary("saroj", 1, 1));
		passwordTextField.sendKeys(excellLibrary("saroj", 2, 1));
        loginButton.click();		
	}
	
}
