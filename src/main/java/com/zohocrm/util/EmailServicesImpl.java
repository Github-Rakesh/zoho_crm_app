package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServicesImpl implements EmailServices {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendSimpleMail(String to, String sub, String emailBody) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(sub);
		mail.setText(emailBody);
		
		javaMailSender.send(mail);
	}

}
