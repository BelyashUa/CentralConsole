package cc.pages.Sysytem;

/**
 * Created by vladimirstovpovoj on 5/3/18.
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class AccountsManagerPage {

    public AccountsManagerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;


    //refresh view
    @FindBy (xpath = ".//*[@id='ext-gen36']")
    public WebElement refreshViewButton;

    //Create User Account
    @FindBy (xpath = ".//*[@id='ext-gen38']")
    public WebElement createUsrAccount;

    public void clickOnCreateUserAccount(){
        createUsrAccount.click();
    }

    //Refresh Policies Button
    @FindBy (xpath = ".//*[@id='ext-gen40']")
    public WebElement refreshPoliciesButton;

    //SAVE button
    @FindBy (xpath = ".//*[@id='user_form']/div[2]/button[1]")
    public WebElement pressSaveButton;

    public void saveNewUser(){
        pressSaveButton.click();
    }

    // Message filed
    @FindBy (xpath = ".//*[@id='flash_message']/div")
    public WebElement messageField;



//------- NEW USER WINDOW------------//

    //Browse Domain Button
    @FindBy (id = "show_domain_tree")
    private WebElement browseDominButton;

    public void clickOnBrowseDominButton(){
        browseDominButton.click();
    }
    //search user button
    @FindBy (id = "ext-gen1133")
    private WebElement searchUser;

    public void pressOnSerachUser(){
        searchUser.click();
    }


    @FindBy (xpath = "//*[@id=\"user_login\"]")
    public WebElement userLogonName;

    public void typeUserLogonName(){
        userLogonName.sendKeys();
    }

    @FindBy (xpath = "//*[@id=\"user_email\"]")
    public WebElement typeEmail;

    public void typeEmail(){
        typeEmail.sendKeys();
    }

    @FindBy (xpath = "//*[@id=\"user_name\"]")
    public WebElement typeName;

    public void typeName(){
        typeName.sendKeys();
    }

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/fieldset/ul[1]/li[1]/span[2]/span/ul/li")
    public WebElement emptyUserLogonName;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/fieldset/ul[1]/li[4]/span[2]/span/ul/li")
    public WebElement emptyEmail;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/fieldset/ul[1]/li[5]/span[2]/span/ul/li")
    public WebElement emptyName;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/fieldset/ul[2]/li/div")
    public WebElement requiredField;


    @FindBy (xpath = "/html/body/div[1]/div[1]/div[2]/div[1]/div/div[1]/div")
    public WebElement newUserWasCreated;



//--------------------------------------//


    //Search user
    @FindBy (id = "ext-comp-1013-inputCell")
    private WebElement searchUserButton;

    public void searchUser(){
        searchUserButton.click();
        searchUserButton.sendKeys("Bart Simpson");
    }

    // Found user
    @FindBy ( xpath= ".//*[@id='treeview-1012-record-CN=Bart Simpson,CN=Users,DC=gtbtechnologies,DC=com,DC=ua']/td/div")
    private WebElement foundUser;

    public void selectFoundUser(){
       foundUser.click();
    }



}