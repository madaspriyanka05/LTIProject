package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {

		@Autowired
		private MailSender mailSender;
		
		@Autowired
		private SimpleMailMessage message;
		
		public void send(String email,String subject,String content) {
			message.setTo(email); //set a proper recipient of the mail
			message.setSubject(subject);
			message.setText(content);
			mailSender.send(message);
		
	}
}
