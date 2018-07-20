package cc.pages.common;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created by vladimirstovpovoj on 7/17/18.
 */

public class DbConnector {


    public DbConnector() {

        Connection connect = null;

        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.62:17023/dashboard",
                    "dashboard",
                    "dashboard");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }




}



