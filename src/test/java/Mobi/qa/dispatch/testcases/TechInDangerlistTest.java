package Mobi.qa.dispatch.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import Mobi.qa.dispatch.base.TestBase;
import Mobi.qa.dispatch.pages.Alerts;

import Mobi.qa.dispatch.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by fatma on 5/28/2018.
 */
public class TechInDangerlistTest extends TestBase {
    LoginPage loginPage;
    Alerts Alerts;
   
public TechInDangerlistTest(){
        super();
    }

    @BeforeMethod
	
    public void setUp(){
        initialization();
        Alerts = new Alerts ();
    }

    @Test(priority=2)
    public void TechInDangerlistTest(){
        String title = Alerts.techIndangerlist ();
        AssertJUnit.assertEquals(title, "mobi Dispatch Metrics");
    }



    @Test(priority=1)
    public void loginTest(){
     loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }



}
