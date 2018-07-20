package com.gttb;

/**
 * Created by vladimirstovpovoj on 4/25/18.
 */

import cc.pages.LoginPage;
import cc.pages.Header;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class Login {
    public static WebDriver driver;
    public static LoginPage loginpage;
    public static Header header;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");
        driver = new FirefoxDriver();
        loginpage = new LoginPage(driver);
        header = new Header(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://192.168.0.62/login");
    }

    @Test
    public void testLogin() {

        // Administrator login
        loginpage.inputLogin("Administrator");
        loginpage.inputPassword("password");
        loginpage.clickLoginButton();
        header.clickLogoutButton();

        //Local user login
        loginpage.inputLogin("test_user");
        loginpage.inputPassword("Password1");
        loginpage.clickLoginButton();
        header.clickLogoutButton();

        // Domain user login
        loginpage.inputLogin("vstovpovoy@gtbtechnologies.com.ua");
        loginpage.inputPassword("Password1");
        loginpage.clickLoginButton();
        header.clickLogoutButton();

        // incorrect name
        loginpage.inputLogin("dministrator");
        loginpage.inputPassword("password");
        loginpage.clickLoginButton();

        if (loginpage.errorfield.getText().equals("Incorrect username.")) {
            System.out.println("Incorrect name : OK");
        } else {
            System.out.println("Incorrect name : FAIL");
        }

        // incorrect password
        loginpage.loginname.clear();
        loginpage.inputLogin("Administrator");
        loginpage.inputPassword("password999");
        loginpage.clickLoginButton();

        if (loginpage.errorfield.getText().equals("Incorrect password!")) {
            System.out.println("Incorrect password: OK");
        } else {
            System.out.println("Incorrect password: FAIL");
        }

        // incorrect user name and password
        loginpage.loginname.clear();
        loginpage.loginpassword.clear();
        loginpage.inputLogin("Administrator999");
        loginpage.inputPassword("password999");
        loginpage.clickLoginButton();
        if (loginpage.errorfield.getText().equals("Incorrect username.")) {
            System.out.println("Incorrect password: OK");
        } else {
            System.out.println("Incorrect password: FAIL");
        }

        // empty username
        loginpage.loginname.clear();
        loginpage.loginpassword.clear();
        loginpage.inputLogin("");
        loginpage.inputPassword("password");
        loginpage.clickLoginButton();
        if (loginpage.errorfield.getText().equals("Username could not be found.")) {
            System.out.println("empty username: OK");
        } else {
            System.out.println("empty username: FAIL");
        }

        // empty password
        loginpage.loginname.clear();
        loginpage.loginpassword.clear();
        loginpage.inputLogin("Administrator");
        loginpage.inputPassword("");
        loginpage.clickLoginButton();
        if (loginpage.errorfield.getText().equals("Incorrect password!")) {
            System.out.println("empty password: OK");
        } else {
            System.out.println("empty password: FAIL");

        }
        // empty name and password
        loginpage.loginname.clear();
        loginpage.loginpassword.clear();
        loginpage.inputLogin("");
        loginpage.inputPassword("");
        loginpage.clickLoginButton();
        if (loginpage.errorfield.getText().equals("Username could not be found.")) {
            System.out.println("empty name and password: OK");
        } else {
            System.out.println("empty name and password: FAIL");
        }

        driver.quit();

    }
}