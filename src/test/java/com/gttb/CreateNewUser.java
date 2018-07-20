package com.gttb;

/**
 * Created by vladimirstovpovoj on 5/7/18.
 */

import cc.pages.Header;
import cc.pages.LoginPage;
import cc.pages.Sysytem.AccountsManagerPage;
import cc.pages.Tubs;
import javafx.scene.paint.Stop;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;



public class CreateNewUser {

    public static WebDriver driver;
    public static LoginPage loginpage;
    public static Tubs tubs;
    public static AccountsManagerPage accountPage;
    public static Header header;


    public CreateNewUser(){
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");

        driver = new FirefoxDriver();
        loginpage = new LoginPage(driver);
        tubs = new Tubs(driver);
        accountPage = new AccountsManagerPage(driver);
        header = new Header(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://192.168.0.62/login");

    }
    // New Domain User
    @Test
    public void newDomainUser(){
        loginpage.loginAsAdministrator();
        loginpage.clickLoginButton();
        tubs.clickOnAccountsManager();
        accountPage.clickOnCreateUserAccount();
        accountPage.clickOnBrowseDominButton();
        accountPage.searchUser();
        accountPage.pressOnSerachUser();
        accountPage.selectFoundUser();
        accountPage.saveNewUser();

        if (accountPage.messageField.getText().equals("User successfully saved.")){
            System.out.println("Add domain user - OK");
        }else {
            System.out.println("Add domain user - FAILED");
        }
        // Login as new user
        header.clickLogoutButton();
        loginpage.inputLogin("Bart@gtbtechnologies.com.ua");
        loginpage.inputPassword("Password1");
        loginpage.clickLoginButton();

        // Log out and deleting user

        header.clickLogoutButton();


        Connection postgreSQL = null;
        Statement delteUser = null;

        try {
            Class.forName("org.postgresql.Driver");
            postgreSQL = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.62:17023/dashboard",
                    "dashboard",
                    "dashboard");
            delteUser = postgreSQL.createStatement();
            String sql = "delete from users where name ilike '%Bart Simpson%'";
            delteUser.execute(sql);
            delteUser.close();
            postgreSQL.close();
        }catch (Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }

        System.out.println("Bart Simpson were deleted");

        }


    // NewLocalUser

        @Test
        public void newLocalUser(){
        loginpage.loginAsAdministrator();
        loginpage.clickLoginButton();
        tubs.clickOnAccountsManager();
        accountPage.clickOnCreateUserAccount();
        accountPage.saveNewUser();


        // EMPTY FIELDS///
        if (accountPage.emptyUserLogonName.getText().equals("This value should not be blank.")){
            System.out.println("Empty User logon name:      OK");
        }else {
            System.out.println("Empty User logon name:  FAILED");
        }

        if (accountPage.emptyEmail.getText().equals("Email address is required.")){
            System.out.println("Empty Email:     OK");
        }else {
            System.out.println("Empty Email: FAILED");
        }

        if (accountPage.emptyName.getText().equals("Name is required.")){
            System.out.println("Empty Name:     OK");
        }else {
            System.out.println("Empty Name: FAILED");
        }

        if (accountPage.requiredField.getText().equals("* Required field")){
            System.out.println("Required field:     OK");
        }else {
            System.out.println("Required field: FAILED");
        }

        // Incorrect Email

            accountPage.typeEmail.clear();
            accountPage.typeName.clear();
            accountPage.userLogonName.clear();
            accountPage.typeEmail.sendKeys("incorrectemail.com");
            accountPage.saveNewUser();
            if (accountPage.emptyEmail.getText().equals("Email address is invalid.")){
                System.out.println("incorrect Email:     OK");
            }else {
                System.out.println("incorrect Email: FAILED");
            }

        // New local user

            accountPage.userLogonName.sendKeys("autu_test_user");
            accountPage.typeEmail.clear();
            accountPage.typeEmail.sendKeys("vstovpovoy@gttb.com");
            accountPage.typeName.sendKeys("Auto Test");
            accountPage.pressSaveButton.click();

            if (accountPage.newUserWasCreated.getText().equals("Changes successfully saved, confirmation email was sent to user.")){
                System.out.println("New User Was Created:      OK");
            }else {
                System.out.println("New User Was Created:  FAILED");
            }


        header.clickLogoutButton();

            driver.get("https://192.168.0.62/login");



    }

    }
