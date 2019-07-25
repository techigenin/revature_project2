package com.revature.festivalapp.controller;



import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.revature.festivalapp.pojos.RegInfo;
import com.revature.festivalapp.pojos.RoleDTO;
import com.revature.festivalapp.services.FestivalEventServicesImpl;
import com.revature.festivalapp.services.RegInfoServiceImpl;

@RestController
public class AddRoleController {
	
	private FestivalEventServicesImpl eventService;
	private RegInfoServiceImpl regInfoService;
	
	@Autowired
	public void setRegInfoService(RegInfoServiceImpl regInfoService) {
		this.regInfoService = regInfoService;
	}
	
	@Autowired
	public void setEventService(FestivalEventServicesImpl eventService) {
		this.eventService = eventService;
	}
//	Date date = new Date();
  
    long timeMilli = System.currentTimeMillis();
 
    static String emailToRecipient, emailSubject, emailMessage;
    static final String emailFromRecipient = "festivalapp1905@gmail.com";
 
    static ModelAndView modelViewObj;
 
    @Autowired
    private JavaMailSender mailSenderObj;
 
 
    // This Method Is Used To Prepare The Email Message And Send It To The Client
    @PostMapping(value ="/add_role", consumes={"application/json"})
    public ModelAndView sendEmailToClient(@RequestBody RoleDTO roles, HttpSession sess) {
 
        // Reading Email Form Input Parameters      
//    	mimeMsgHelperObj.setTo(emailToRecipient);
//        mimeMsgHelperObj.setFrom(emailFromRecipient);               
//        mimeMsgHelperObj.setText(emailMessage);
//        mimeMsgHelperObj.setSubject(emailSubject);
        
    	emailMessage = "Hello! \n We would like you to join our event as " + ((roles.getRole().equalsIgnoreCase("artist")) ? "an " : "a ") + roles.getRole() 
        + ". Click this link to begin the process." +"http://ec2-54-215-220-80.us-west-1.compute.amazonaws.com:8080/festivalApp/role_reg/?val="+ timeMilli;
        
    	emailToRecipient = roles.getEmail();
    	
    	emailSubject = "You've Been Invited...";
 
        // Logging The Email Form Parameters For Debugging Purpose
        System.out.println("\nReceipient?= " + emailToRecipient + ", Subject?= " + emailSubject + ", Message?= " + emailMessage + "\n");
 
        mailSenderObj.send(new MimeMessagePreparator() {
            public void prepare(MimeMessage mimeMessage) throws Exception {
 
                MimeMessageHelper mimeMsgHelperObj = new MimeMessageHelper(mimeMessage, true, "UTF-8");             
                mimeMsgHelperObj.setTo(emailToRecipient);
                mimeMsgHelperObj.setFrom(emailFromRecipient);
                mimeMsgHelperObj.setText(emailMessage);
                
                
                RegInfo eUser = new RegInfo(timeMilli, roles.getRole(), eventService.getFestivalEvent(roles.getEventNum()), null, null);
                
                regInfoService.insertRegInfo(eUser);
                		
                
                mimeMsgHelperObj.setSubject(emailSubject);
 
                // Determine If There Is An File Upload. If Yes, Attach It To The Client Email              
               
                
            }
        });
        System.out.println("\nMessage Send Successfully.... Hurrey!\n");
 
        modelViewObj = new ModelAndView("success","messageObj","Thank You! Your Email Has Been Sent!");
        return  modelViewObj;   
    }
}