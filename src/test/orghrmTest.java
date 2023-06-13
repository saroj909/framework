package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.AddUserPage;
import pom.OrgHrmLoginPage;
import pom.OrghrmHomepage;
import pom.Orghrm_adminPage;

public class orghrmTest  extends BaseTest
{ 
	@Test
	public void loginpage() throws Exception
	{   
		System.out.println("test class method execution start");
		OrgHrmLoginPage lp = new OrgHrmLoginPage(driver);
		lp.loginMethod();
		
	}
	@Test(priority = 1)
	public void  homepage() throws Exception
	{
		OrghrmHomepage ohp =new OrghrmHomepage(driver);
		ohp.adminButtonMethod();
	}
	@Test(priority = 2)
	public void adminpage() throws Exception
	{
		Orghrm_adminPage oap= new Orghrm_adminPage(driver);
		oap.addButton();
		AddUserPage ap = new AddUserPage(driver);
		ap.userRole();
		ap.employeeName();
	}
	@Test(priority =3)
	public void adduserpage() throws Exception
	{
		AddUserPage au = new AddUserPage(driver);
		au.userRole();
		au.admin();
		au.employeeName();
		au.status();
		au.username();
		au.password();
		au.confirmpassword();
		au.saveButton();
	}
}
