package com.tcs.emp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginSevice {
	
	
		public String loginCheck(String username,String password)
		{
			if(username.equals("Mariyadas") && password.equals("332266"))
			{	return "success";
			}
			else
			{	return "fail";
			}
		}
	}

