package cc.pages;

/**
 * Created by vladimirstovpovoj on 5/7/18.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tubs {
    public Tubs (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;


    //Dashboard
    @FindBy (xpath = ".//*[@id='ext-gen3']/div[1]/div[1]/div[1]/ul/li[1]/a")
    public WebElement dashboard;

    public void clickOnDashboard(){
        dashboard.click();
    }

    //Accounts Manager
    @FindBy (linkText = "Accounts Manager")
    public WebElement accountsManager;

    public void clickOnAccountsManager(){
        accountsManager.click();
    }




}
