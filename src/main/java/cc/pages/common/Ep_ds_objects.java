package cc.pages.common;

import org.junit.Test;

import java.sql.*;

/**
 * Created by vladimirstovpovoj on 7/18/18.
 */
public class Ep_ds_objects {


//    Connection conn = null;
//    Statement st = null;


    public int getGlobalCount() throws  SQLException{
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");

        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.62:17023/dashboard",
                    "dashboard",
                    "dashboard");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        st = conn.createStatement();
        String sql = "select count(*) from ep_ds_objects where type='0'";
        ResultSet rs = st.executeQuery(sql);

        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }conn.close();

        return count;

    }

    public int getDomainCount() throws  SQLException {
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");

        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.24:17023/dashboard",
                    "dashboard",
                    "dashboard");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        st = conn.createStatement();
        String sql = "select count(*) from ep_ds_objects where type='1'";
        ResultSet rs = st.executeQuery(sql);

        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }conn.close();

        return count;
        }

    public int getGroupCount() throws  SQLException {
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");

        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.62:17023/dashboard",
                    "dashboard",
                    "dashboard");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        st = conn.createStatement();
        String sql = "select count(*) from ep_ds_objects where type='2'";
        ResultSet rs = st.executeQuery(sql);

        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }conn.close();

        return count;
        }

    public int getComputerCount() throws  SQLException {
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");

        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.62:17023/dashboard",
                    "dashboard",
                    "dashboard");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        st = conn.createStatement();
        String sql = "select count(*) from ep_ds_objects where type='3'";
        ResultSet rs = st.executeQuery(sql);

        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }conn.close();

        return count;
        }

    public int getUserCount() throws  SQLException {
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");

        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.24:17023/dashboard",
                    "dashboard",
                    "dashboard");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        st = conn.createStatement();
        String sql = "select count(*) from ep_ds_objects where type='4'";
        ResultSet rs = st.executeQuery(sql);

        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }conn.close();

        return count;
        }

    public int getOuCount() throws  SQLException {
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");

        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.62:17023/dashboard",
                    "dashboard",
                    "dashboard");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        st = conn.createStatement();
        String sql = "select count(*) from ep_ds_objects where type='5'";
        ResultSet rs = st.executeQuery(sql);

        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }conn.close();

        return count;
        }

    public int getNdpcCount() throws  SQLException {
        System.setProperty("webdriver.gecko.driver", "/Users/vladimirstovpovoj/Documents/GTB_AUTO/geckodriver");

        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.62:17023/dashboard",
                    "dashboard",
                    "dashboard");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        st = conn.createStatement();
        String sql = "select count(*) from ep_ds_objects where type='6'";
        ResultSet rs = st.executeQuery(sql);

        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }conn.close();

        return count;
        }











}



