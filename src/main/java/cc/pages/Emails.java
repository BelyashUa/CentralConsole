package cc.pages;

/**
 * Created by vladimirstovpovoj on 5/8/18.
 */

import java.util.Properties;
import javax.mail.*;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Emails {

    public static void checkEmail(String host, String storeType, String user,
                             String password) {
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.socketFactory.port", "465");
            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("autotest.gttb@gmail.com", "Ytgbnfq1");
                }

            });

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Store store = Sessi


    }

}