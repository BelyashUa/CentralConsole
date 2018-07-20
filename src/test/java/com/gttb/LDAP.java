package com.gttb;


import cc.pages.LoginPage;
import cc.pages.Tubs;
import cc.pages.common.DbConnector;
import cc.pages.common.Ep_ds_objects;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.sql.*;
import java.util.concurrent.TimeUnit;


/**
 * Created by vladimirstovpovoj on 7/17/18.
 */

public class LDAP {

    public Ep_ds_objects ep_ds_objects = new Ep_ds_objects();

    @Test










    public void getLdapObjects() throws SQLException, InterruptedException {

       int global = ep_ds_objects.getGlobalCount();
       int domain = ep_ds_objects.getDomainCount();
       int group = ep_ds_objects.getGroupCount();
       int computer = ep_ds_objects.getComputerCount();
       int user = ep_ds_objects.getUserCount();
       int ou = ep_ds_objects.getOuCount();
       int ndpc = ep_ds_objects.getNdpcCount();

        System.out.println("Global " + global + " Domains: " + domain + " Groups: " + group + " Computers: " + computer + " Users: " + user + " OU: "+ ou + " None-domain computer: "+ ndpc);



    }


    }














