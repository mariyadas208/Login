package com.tcs.emp.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
	
	@Autowired
	
	LoginSevice loginService;
	@RequestMapping("/")
	public String loginpage()
	{	return "login";
	}
	
	/*
	 * @RequestMapping("/loginaction1") public String loginCheck(HttpServletRequest
	 * request) { String username = request.getParameter("username"); String
	 * password = request.getParameter("password");
	 * 
	 * if(username.equals("ratan") && password.equals("anu")) { return "success"; }
	 * else { return "fail"; } }
	 */
	
	@RequestMapping(value = "/loginaction",method = RequestMethod.POST)
	public String loginData(HttpServletRequest request,Model model)
	{	String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		model.addAttribute("username",username);
		
		return loginService.loginCheck(username, password);
	}
}

