package cc.pages.Sysytem;

/**
 * Created by vladimirstovpovoj on 4/26/18.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmailsAndAlertsPage {

    public EmailsAndAlertsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    //Email Server
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_server\"]")
    private WebElement emailServer;

    //Email Port
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_port\"]")
    private WebElement emailPort;

    //Email UserName
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_login\"]")
    private WebElement emailUserName;

    //Email Password
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_passwordVisible\"]")
    private WebElement emailPassword;

    //Email Origiator:
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_originator\"]")
    private WebElement emailOriginator;
//
    //Email Encryption
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_encrypted\"]")
    private WebElement emailEncryption;

    //Email Alert manager:
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_manager_notify_inspector\"]")
    private WebElement alertManager;

    //Send Test Email
    @FindBy (xpath = "//*[@id=\"test_connect\"]")
    private WebElement sendTestEmail;

    //Cancel
    @FindBy (xpath = "html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/form/div/button[2]")
    private WebElement Cancel;

    //Massage field
    @FindBy (xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/div")
    private WebElement massageField;

    @FindBy (xpath = "//*[@id='setup_system_smtp_encrypted']/option[1]")
    private WebElement encriptionNone;
    @FindBy (xpath = "//*[@id='setup_system_smtp_encrypted']/option[2]")
    private WebElement encriptionSSL;
    @FindBy (xpath = "//*[@id='setup_system_smtp_encrypted']/option[3]")
    private WebElement encriptionTLS;
//-----------------------------------------------------------------------//

    //Send Email To
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_test_email_to\"]")
    private WebElement sendTestEmailTo;

    //Email Subject
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_test_email_subject\"]")
    private WebElement emailSubject;

    //Email Body
    @FindBy (xpath = "//*[@id=\"setup_system_smtp_test_email_body\"]")
    private WebElement emailBody;

    //Send Button
    @FindBy (xpath = "//*[@id=\"send_button\"]")
    private WebElement sendButton;

    //Cancel Button
    @FindBy (xpath = "//*[@id=\"close_button\"]")
    private WebElement CuncelButton;

//-----------------------------------------------------------------------//


    public void inputEmailServer (String emaailserver){
        emailServer.sendKeys(emaailserver);
    }
    public void inputEmailPort (String emailport){
        emailPort.sendKeys(emailport);
    }
    public void inputEmailUserName (String emailuserName){
        emailUserName.sendKeys(emailuserName);
    }
    public void inputEmailPassword (String emailpassword){
        emailPassword.sendKeys(emailpassword);
    }
    public void inputEmailOriginator (String emailoriginator){
        emailOriginator.sendKeys(emailoriginator);
    }


    public void setEncriptionNone (){
         encriptionNone.click();
    }
    public void setEncriptionSSL (){
        encriptionSSL.click();
    }
    public void setEncriptionTLS (){
        encriptionTLS.click();
    }

    public void selectOnAlertManager() {
        alertManager.click();
    }

    public void clicOnSendTestEmailButton() {
        sendTestEmail.click();
    }

    public void clicOnCancelButton() {
        Cancel.click();
    }

    //-----------------------------------------------------------------------//

    public void inputSendTestEmailTo(String sendtestemailto) {
        sendTestEmailTo.sendKeys(sendtestemailto);
    }

    public void inputEmailSubject(String emailsubject) {
        emailSubject.sendKeys(emailsubject);
    }

    public void inputEmailBody(String emailbody) {
        emailBody.sendKeys(emailbody);
    }

    public void clicOnSendButton() {
        sendButton.click();
    }

    public void clicOnCuncelButton() {
        CuncelButton.click();
    }

    //-----------------------------------------------------------------------//

}
