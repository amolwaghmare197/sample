package com.example.demo.AopPlusLog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AopPlusLog.entity.login_det;
import com.example.demo.AopPlusLog.loginServices.loginServices;

@RestController
@RequestMapping("/app")
public class login_controller {

	Logger log = LoggerFactory.getLogger(login_controller.class);
	
	@Autowired  
	private loginServices sp; 
	
	@Autowired
	private Environment ev;
	
	@GetMapping("/all")
	public List<login_det>  getAll()  {
		log.info("throw cont method");
		List<login_det> a1 =sp.getlAll();
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i).toString());
		}
		log.info("executed cont method" + a1);
		log.info(ev.getProperty("spring.application.name"));
		return a1;
	}
}
