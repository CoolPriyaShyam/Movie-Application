//package com.kpn.movieservice.service;
//
//
//// Importing required classes
//
//import java.io.File;
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//import com.kpn.movieservice.domain.EmailDetails;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//// Annotation
//@Service
//// Class
//// Implementing EmailService interface
//public class EmailServiceImpl implements EmailService {
//
//	@Autowired private JavaMailSender javaMailSender;
//
//	@Value("${spring.mail.username}") private String sender;
//
//	// Method 1
//	@Override
//	// To send a simple email
//	public String sendSimpleMail(String to, String subject, String body)
//	{
//
//		// Try block to check for exceptions
//		try {
//
//			// Creating a simple mail message
//			SimpleMailMessage mailMessage
//					= new SimpleMailMessage();
//
//			// Setting up necessary details
////			mailMessage.setFrom(sender);
//			mailMessage.setTo(to);
//			mailMessage.setSubject(subject);
//			mailMessage.setText(body);
//
//			// Sending the mail
//			javaMailSender.send(mailMessage);
//			return "Mail Sent Successfully...";
//		}
//
//		// Catch block to handle the exceptions
//		catch (Exception e) {
//			return "Error while Sending Mail";
//		}
//	}
//
//
//}
