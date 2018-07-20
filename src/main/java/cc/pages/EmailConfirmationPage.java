package cc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vladimirstovpovoj on 7/16/18.
 */
public class EmailConfirmationPage {

    public EmailConfirmationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;


    @FindBy(xpath = "/*[@id=\"changePassword_newPassword_first\"]")
    private WebElement newPassword;

    @FindBy(xpath = "//*[@id=\"changePassword_newPassword_second\"]")
    private WebElement repeatNewPassword;

    @FindBy(xpath = "//*[@id=\"_submit\"]")
    private WebElement resetButtom;

    public void setNewPassword(){
        resetButtom.click();
    }


}
