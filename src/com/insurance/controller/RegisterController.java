package com.insurance.controller;


import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.insurance.beans.Insurance;


public class RegisterController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("request reached..............");
		ModelAndView mav1=new ModelAndView("RegisterPage");
	
		return mav1;
		
	}

}