package cc.pages;

/**
 * Created by vladimirstovpovoj on 4/25/18.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    //username
    @FindBy (xpath = "//*[@id=\"username\"]")
    public WebElement loginname;

    public void inputLogin (String login){
        loginname.sendKeys(login);
    }

    //password
    @FindBy (xpath="//*[@id=\"password\"]")
    public WebElement loginpassword;

    public void inputPassword (String password){
        loginpassword.sendKeys(password);
    }

    //Login button
    @FindBy (xpath = "//*[@id=\"_submit\"]")
    public WebElement login;

    public void clickLoginButton(){
        login.click();
    }

    //Login button
    @FindBy (xpath = "/html/body/div[1]/div[1]/div[3]/form/fieldset/div[2]/span/a")
    public WebElement forgotpass;

    public void clickForgotPassButton(){
        forgotpass.click();
    }

    //Error field button
    @FindBy (xpath = "/html/body/div[1]/div[1]/div[3]/form/div[2]")
    public WebElement errorfield;

    public void loginAsAdministrator() {
        loginname.sendKeys("Administrator");
        loginpassword.sendKeys("password");
        loginname.click();

    }

}