package Mobi.qa.dispatch.pages;


import Mobi.qa.dispatch.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {


	//Page Factory - OR:
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="btn")
	WebElement loginBtn;

	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

	public void login(String un, String pwd){


		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
