/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendMail;

/**
 *
 * @author trinh
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMail {

    public static String fromEmail = "handbookgreenfairy.fpt@gmail.com";
    public static String password = "handbookgreenfairy";

    public String getRandom() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    public static void send(String to,
            String code, final String user, final String pass, String sub,String mess) {
        //create an instance of Properties Class   
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        //below mentioned mail.smtp.port is optional
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        /* Pass Properties object(props) and Authenticator object   
           for authentication to Session instance 
         */
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

        try {

            /* Create an instance of MimeMessage, 
 	      it accept MIME types and headers 
             */
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject(sub);
//            message.setContent(msg, "text/html");
                        //set email subject
            message.setSubject(sub);

            //set message text
            message.setText(mess + code);

            /* Transport class is used to deliver the message to the recipients */
            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        
//        String subject = "Your order has been processing.";
//        String message = "<!DOCTYPE html>\n"
//                + "<html lang=\"en\">\n"
//                + "\n"
//                + "<head>\n"
//                + "</head>\n"
//                + "\n"
//                + "<body>\n"
//                + "    <h3 style=\"color: blue;\">Your order has been processing.</h3>\n"
//                + "    <div>Full Name :Trinh Bao Khanh</div>\n"
//                + "    <div>Phone : 08986370xx</div>\n"
//                + "    <div>address : Thanh Hoa</div>\n"
//                + "    <h3 style=\"color: blue;\">Thank you very much!</h3>\n"
//                + "\n"
//                + "</body>\n"
//                + "\n"
//                + "</html>";
//        SendMail.send("Khanhtbhe153468@fpt.edu.vn", subject, message, fromEmail, password);
//        //vd để gửi email tới "dich@gmail.com" bằng email "nguon@gmail.com" pass "123456"
////        SendMail.send("dich@gmail.com", subject, message, "nguon@gmail.com", "123456");
//    }
}
