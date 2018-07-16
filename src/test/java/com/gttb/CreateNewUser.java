package com.gttb;

/**
 * Created by vladimirstovpovoj on 5/7/18.
 */

import cc.pages.Header;
import cc.pages.LoginPage;
import cc.pages.Sysytem.AccountsManagerPage;
import cc.pages.Tubs;
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
//        FirefoxOptions options = new FirefoxOptions();
//        options.setLogLevel(Level.OFF);
        driver = new FirefoxDriver();
        loginpage = new LoginPage(driver);
        tubs = new Tubs(driver);
        accountPage = new AccountsManagerPage(driver);
        header = new Header(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://192.168.0.24/login");

    }

    @Test
    public void newUser(){
        loginpage.loginAsAdministrator();
        loginpage.clickLoginButton();
        tubs.clickOnAccountsManager();
        accountPage.clickOnCreateUserAccount();
        accountPage.clickOnBrowseDominButton();
        accountPage.searchUser();
        accountPage.pressOnSerachUser();
        accountPage.selectFoundUser();
        accountPage.seveNewUser();

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
                    "jdbc:postgresql://192.168.0.24:17023/dashboard",
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



    }
