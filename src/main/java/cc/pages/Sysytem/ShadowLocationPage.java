package cc.pages.Sysytem;

/**
 * Created by vladimirstovpovoj on 4/26/18.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadowLocationPage {

    public ShadowLocationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    //Shadow path
    @FindBy (xpath = "//*[@id=\"setup_system_shadow_shadowPath\"]")
    private WebElement shadow_path;

    //Domain\Username
    @FindBy (xpath = "//*[@id=\"setup_system_shadow_shadowUsername\"]")
    private WebElement domain_username;

    //Password
    @FindBy (xpath = "//*[@id=\"setup_system_shadow_shadowPasswordVisible\"]")
    private WebElement password;

    //Maximum file size to shadow
    @FindBy (xpath = "//*[@id=\"setup_system_shadow_shadowCopyMaxSize\"]")
    private WebElement max_size;

    //test connection button
    @FindBy (xpath = "//*[@id=\"test_connect\"]")
    private WebElement test_connection;



    public void inputShadow_path (String shadowpath){
        shadow_path.sendKeys(shadowpath);
    }
    public void inputDomain_username (String domainusername){
        domain_username.sendKeys(domainusername);
    }
    public void inputPassword (String password){
        domain_username.sendKeys(password);
    }
    public void inputmax_size (String maxsize){
        max_size.sendKeys(maxsize);
    }
    public void clicOnTestConnectionButton(){
        test_connection.click();
    }

}
