package com.xworkz.common_module.utility;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMailSender {

	public static void main(String[] args) {
		JavaMailSenderImpl mailSenderImpl=new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setPort(587);
		mailSenderImpl.setUsername("ashamanu.a@gmail.com");
		mailSenderImpl.setPassword("ashamanu.a@96");
		
		Properties javaMailProperties=new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable","true");
		javaMailProperties.put("mail.smtp.auth","true");
		javaMailProperties.put("mail.transport.protocol","smtp");
		javaMailProperties.put("mail.debug","true");
		 
		mailSenderImpl.setJavaMailProperties(javaMailProperties);
		
		String []bccs= {"manasaashap01@gmail.com"};
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("rakshugowdar@gmail.com");
		message.setTo("sumana.xworkz@gmail.com");
		message.setBcc(bccs);
		message.setSubject("demo mail sender");
		message.setText("hello everyone \n i'm manasa p \n from xworkz \n");
		mailSenderImpl.send(message);
		

	}

}
