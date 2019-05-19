package com.infotech.basepage;

import java.util.Properties;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;


	public class Email {

			final String senderEmailID = "TR.Nagaraj@itcinfotech.com";
		    final String senderPassword = "Nag@1992";
		    final String emailSMTPserver = "smtp-mail.outlook.com";
		    //final String emailSMTPserver = "Smtp.live.com";
		    //final String emailServerPort = 587;
		    String receiverEmailID = null;
		    static String emailSubject = "Test Mail";
		    static String emailBody = ":)";

		    //mail.smtp.ssl.enable = "true";
		    public Email(String receiverEmailID, String Subject, String Body) {
		        this.receiverEmailID = receiverEmailID;
		        this.emailSubject = Subject;
		        this.emailBody = Body;
		        Properties props = new Properties();
		        //System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
		        props.put("mail.smtp.user", senderEmailID);
		        props.put("mail.smtp.host", emailSMTPserver);
		        props.put("mail.smtp.port", 993);
		        props.put("mail.smtp.starttls.enable", "true");
		        props.put("mail.smtp.auth", "true");
		        props.put("mail.smtp.socketFactory.port", 993);
		        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		        props.put("mail.smtp.socketFactory.fallback", "false");
		        props.put("mail.smtp.ssl.enable", "true"); 
		        SecurityManager security = System.getSecurityManager();
		        //mail.smtp.ssl.enable "true"

		        try {
		            // SMTPAuthenticator auth = new SMTPAuthenticator();
		            Session session = Session.getInstance(props, new SMTPAuthenticator("TR.Nagaraj@itcinfotech.com", "Nag@1992"));
		            MimeMessage msg = new MimeMessage(session);
		            msg.setText(emailBody);
		            msg.setSubject(emailSubject);
		            msg.setFrom(new InternetAddress(senderEmailID));
		            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmailID));
		            Transport.send(msg);
		            //sendMessage(msg, msg.getAllRecipients());
		            System.out.println("Message send Successfully:)");
		        }

		        catch (Exception mex) {
		            mex.printStackTrace();
		        }
		    }

		    public class SMTPAuthenticator extends Authenticator {
		        String user;
		        String pwd;

		        SMTPAuthenticator(String senderEmailID, String senderPassword) {

		            super();
		            this.user = senderEmailID;
		            this.pwd = senderPassword;

		        }

		        public PasswordAuthentication getPasswordAuthentication() {
		            return new PasswordAuthentication(user, pwd);
		        }
		    }

		    public static void main(String[] args) {

		    	Email obj1 = new Email("TR.Nagaraj@itcinfotech.com", "hi", "test");

		    }
		
		/*public static void main(String[] args) {
			
			String to = "TR.Nagaraj@itcinfotech.com";
			String from = "TR.Nagaraj@itcinfotech.com";
			 //final String senderPassword = "Nag@1992";
			 String emailSubject = "Test Mail";
			    String emailBody = ":)";
		     //String emailSMTPserver = "";
		    //final String emailSMTPserver = "Smtp.live.com";
		    //final String emailServerPort = "587";
			Properties props = new Properties();
	        //System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp-mail.outlook.com");
	        props.put("mail.smtp.port", 587);
	        
	        Session session = Session.getDefaultInstance(props, new Authenticator() {
	        	
	        	
				protected PasswordAuthentication getPwdAuthentication() {
					return new PasswordAuthentication("TR.Nagaraj@itcinfotech.com", "Nag@1992");
				}
	        	
			});
	        
	        try {
				
	        	 // SMTPAuthenticator auth = new SMTPAuthenticator();
	            MimeMessage msg = new MimeMessage(session);
	            msg.setFrom(new InternetAddress(from));
	            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	            msg.setSubject(emailSubject);
	            msg.setText(emailBody);
	            Transport.send(msg);
	            //sendMessage(msg, msg.getAllRecipients());
	            System.out.println("Message send Successfully:)");
			} catch (MessagingException e) {
				e.printStackTrace();
			}
			
		}*/
	
}