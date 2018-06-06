package Mobi.qa.dispatch.pages;

import Mobi.qa.dispatch.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by fatma on 5/28/2018.
 */
public class Alerts extends TestBase {


    //Page Factory - OR :{
    @FindBy(linkText="https://stage-dispatch.mobicorp.com/overview/summary?collapsed=true&notificationsCategory=all&alert=techInDanger")
    WebElement techInDanger;

    @FindBy(xpath=".//*[@id='root']/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div[1]/p")
    WebElement jobsAtRisk;

    @FindBy(xpath=".//*[@id='root']/div/div[2]/div/div[1]/div[2]/div[3]/div/div/div/div[1]/p")
    WebElement availableTechs;

    @FindBy(xpath=".//*[@id='root']/div/div[2]/div/div[1]/div[2]/div[4]/div/div/div/div[1]/p")
    WebElement unAssignedjobs;

    @FindBy(xpath=".//*[@id='root']/div/div[2]/div/div[1]/div[2]/div[5]/div/div/div/div[1]/p")
    WebElement missedJObs;

    @FindBy(xpath=".//*[@id='root']/div/div[2]/div/div[1]/div[2]/div[6]/div/div/div/div[1]/p")
    WebElement onJobnotAtLocation;


    @FindBy(xpath=".//*[@id='root']/div/div[2]/div/div[1]/div[2]/div[7]/div/div/div/div[1]/p")
    WebElement overRunningJobs;


    @FindBy(xpath=".//*[@id='root']/div/div[2]/div/div[1]/div[2]/div[8]/div/div/div/div[1]/p")
    WebElement lastJob;

    //Initializing the Page Objects:
    public Alerts(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public String techIndangerlist (){

        techInDanger.click();
        return driver.getTitle();
    }
}
