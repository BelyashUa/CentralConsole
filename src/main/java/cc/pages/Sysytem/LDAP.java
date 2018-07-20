package cc.pages.Sysytem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vladimirstovpovoj on 7/16/18.
 */
public class LDAP {

    public LDAP(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"addPath-btnInnerEl\"]")
    public WebElement addLdap;

    public void clickAddLdap() {
        addLdap.click();
    }

    @FindBy(xpath = "//*[@id=\"textfield-1024-inputEl\"]")
    public WebElement LdapServer;

    public void ldapServer(){
        LdapServer.sendKeys();
    }

    @FindBy(xpath = "//*[@id=\"textfield-1027-inputEl\"]")
    public WebElement domainUsername;

    public void setDomainUsername()

    {
        domainUsername.sendKeys();
    }

    @FindBy(xpath = "//*[@id=\"textfield-1028-inputEl\"]")
    public WebElement password;

    public void setPassword()

    {
        password.sendKeys();
    }

    @FindBy(xpath = "//*[@id=\"button-1020-btnIconEl\"]")
    public WebElement update;

    public void pressApdate()

    {
        update.sendKeys();
    }

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/form/div/button[1]")
    public WebElement save;

    public void pressSave()

    {
        save.sendKeys();
    }

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div[3]/ul[1]/li/span")
    public WebElement updateStatus;


}