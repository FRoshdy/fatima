package Mobi.qa.dispatch.testcases;

import Mobi.qa.dispatch.base.TestBase;
import Mobi.qa.dispatch.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Enter your username and password");
	}



	@Test(priority=2)
	public void loginTest(){
		 loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}






}
