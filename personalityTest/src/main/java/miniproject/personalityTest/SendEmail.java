package miniproject.personalityTest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class SendEmail {
	public static boolean sendMail(String to , String personality , String tag , String description , String likePersonalityPeople) {
		final String from = "";		//enter your email id here
		final String password = "";		//enter your email account password here
		
		String host = "smtp.gmail.com";
		
        // Get system properties
        Properties properties = System.getProperties();
        
        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass 
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
            	return new PasswordAuthentication(from, password);
            }
        });
        
        //session.setDebug(true);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Personality Test Application");

            Multipart multipart = new MimeMultipart();


            MimeBodyPart textPart = new MimeBodyPart();

            textPart.setText("Here is the result of your personality test which you took in our app." +
            		"\n\nYour Personality is " + personality + 
            		"\n\nTag: " + tag + 
            		" which means: " + description + 
            		"\n\nPeople like you: " + likePersonalityPeople + 
            		"\n\nPlease note that the App is under development, so the results of the " +
            		"Personality test cannot be completely trusted.\n\nRegards,\nTeam Personality Test Application." +
            		"\n\nHave a good day.");
            
            multipart.addBodyPart(textPart);
            
            message.setContent(multipart);

            // Send message
            Transport.send(message);
            return true;
        } catch(Exception mex) {
        	return false;
        }
	}
}

