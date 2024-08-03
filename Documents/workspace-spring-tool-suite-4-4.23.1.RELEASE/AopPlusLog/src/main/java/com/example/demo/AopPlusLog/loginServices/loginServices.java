package com.example.demo.AopPlusLog.loginServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AopPlusLog.entity.login_det;
import com.example.demo.AopPlusLog.repoopository.loginRepository;

@Service
public class loginServices {

	
	@Autowired  
	private loginRepository rp;
	
	public List<login_det> getlAll() {
		List<login_det> a1 = rp.findAll();
		
		return a1;
	}
}
