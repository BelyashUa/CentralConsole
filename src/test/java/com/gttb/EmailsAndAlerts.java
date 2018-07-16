package com.gttb;

/**
 * Created by vladimirstovpovoj on 4/27/18.
 */

import cc.pages.LoginPage;
import cc.pages.Sysytem.EmailsAndAlertsPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class EmailsAndAlerts {

    public static WebDriver driver;
    public static LoginPage loginpage;
    public static EmailsAndAlertsPage emailsandal;

    public EmailsAndAlerts() {
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");
        driver = new FirefoxDriver();
        loginpage = new LoginPage(driver);
        emailsandal = new EmailsAndAlertsPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://192.168.0.24/login");

    }

    @Test
    public void testEmail(){

        loginpage.loginAsAdministrator();
        loginpage.clickLoginButton();
        driver.get("https://192.168.0.24/setup/system/emails");
        emailsandal.setEncriptionSSL();
        emailsandal.selectOnAlertManager();

    }







}
