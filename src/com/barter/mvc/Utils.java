package com.barter.mvc;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Utils {

	private static String USER_EMAIL = "example@gmail.com"; // YOUR GMAIL ID
	private static String USER_PASSWORD = "examplepass1"; // YOUR GMAIL PASS
	private static String FROM_EMAIL = USER_EMAIL;
	
	public static String join(String delimiter, List<String> list) {
        StringBuilder out_text = new StringBuilder();
        String _delimiter = "";
        for(String value : list) {
            out_text.append(_delimiter);
            out_text.append(value);
            _delimiter = delimiter;
        }
        return out_text.toString();
    }

    public static String generateString(String value, int numbers, String delimiter) {
        StringBuilder out_text = new StringBuilder();
        String _delimiter = "";
        for (int i = 0; i < numbers; i++) {
            out_text.append(_delimiter);
            out_text.append(value);
            _delimiter = delimiter;
        }
        return out_text.toString();
    }

	public static void sendEmail(String to, String subject, String body) {

		Properties props = System.getProperties();
		String host = "smtp.gmail.com";
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", USER_EMAIL);
		props.put("mail.smtp.password", USER_PASSWORD);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props);
		MimeMessage message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress(FROM_EMAIL));
			message.addRecipients(Message.RecipientType.TO, to);
			message.setSubject(subject);
			message.setText(body);
			Transport transport = session.getTransport("smtp");
			transport.connect(host, USER_EMAIL, USER_PASSWORD);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (AddressException ae) {
			ae.printStackTrace();
		} catch (MessagingException me) {
			me.printStackTrace();
		}
	}
}
