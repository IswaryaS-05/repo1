package com.insurance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.insurance.beans.Insurance;


public class LoginCheckController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		

		String username=req.getParameter("cn");
		String password=req.getParameter("pw");

		System.out.println("request got by"+username);
		 ModelAndView mav=null;
		 Insurance s1=new Insurance(username,password);
		 DbOperations dop=new DbOperations();
		 
		 Boolean a=dop.loginCheck(username, password);
		if(a)	
		{
			mav=new  ModelAndView("success","user",username);
		}
		else
		{
			mav=new  ModelAndView("fail","msg","your not authorized user");
		}
				return mav;
	}

}