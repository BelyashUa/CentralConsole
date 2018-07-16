package cc.pages;

/**
 * Created by vladimirstovpovoj on 4/26/18.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Header {


    public Header(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;


    //logout button
    @FindBy (xpath = "/html/body/div[1]/div[1]/div[1]/div/div[2]/ul[1]/li[2]/a")
    private WebElement logOutButton;

    //username
    @FindBy (xpath = "/html/body/div[2]/div[1]/div[1]/div/div[2]/ul[1]/li[1]")
    private WebElement username;

    //data&version
    @FindBy (xpath="/html/body/div[2]/div[1]/div[1]/div/div[2]/ul[2]/li/div")
    private WebElement dataandversion;


    public void clickLogoutButton(){
        logOutButton.click();
    }


}
