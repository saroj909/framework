package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orghrm_adminPage
{

	public WebDriver driver;
    public WebDriverWait wait ;
    public JavascriptExecutor js ;
	
	// 1st part is declaration 
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement addButton;
	
	
	
	public Orghrm_adminPage(WebDriver driver)
	{  
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void addButton()
	{
//		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
//		wait.until(ExpectedConditions.visibilityOf(addButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",addButton);
		//addButton.click();
		
		
	}

}
