package com.infotech.basepage;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email1 {
	
	public static void main(String[] args) {
		
		try {
            String to="TR.Nagaraj@itcinfotech.com";
            String from="TR.Nagaraj@itcinfotech.com";

            Properties props = new Properties();
//            props.put("mail.smtp.socketFactory.port", "587");
//            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//            props.put("mail.smtp.socketFactory.fallback", "true");
            props.put("mail.smtp.host", "smtp-mail.outlook.com");
            props.put("mail.smtp.port", 587);
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("TR.Nagaraj@itcinfotech.com","Nag@1992");
                        }
                    });

//            Session emailSession = Session.getDefaultInstance(props, null);

            String msgBody = "Sending email using JavaMail API...";

            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from, "NoReply"));
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to, "Mr. Recipient"));
            msg.setSubject("Welcome To Java Mail API");
            msg.setText(msgBody);
            Transport.send(msg, msg.getAllRecipients());
            System.out.println("Email sent successfully...");
            //logger.error("Email sent successfully...");
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
        	 e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
        	 e.printStackTrace();
        }
		
	}

}
