package com.example.snap.account.util;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

public class MailUtils {
    private JavaMailSender javaMailSender;
    private MimeMessage mimeMessage;
    private MimeMessageHelper mimeMessageHelper;

    public MailUtils(JavaMailSender javaMailSender) throws MessagingException {
        this.javaMailSender = javaMailSender;
        mimeMessage = this.javaMailSender.createMimeMessage();
        mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "utf-8");
    }

    public void setSubject(String subject) throws MessagingException {
        mimeMessageHelper.setSubject(subject);
    }

    public void setText(String htmlContent) throws MessagingException {
        System.out.println(htmlContent);
        mimeMessageHelper.setText(htmlContent);
    }

    public void setFrom(String email, String name) throws UnsupportedEncodingException, MessagingException {
        mimeMessageHelper.setFrom(email, name);
    }

    public void setTo(String email) throws MessagingException {
        mimeMessageHelper.setTo(email);
    }

    public void addInLine(String contentId, DataSource dataSource) throws MessagingException {
        mimeMessageHelper.addInline(contentId,dataSource);
    }

    public void send(){
        javaMailSender.send(mimeMessage);
    }

}
