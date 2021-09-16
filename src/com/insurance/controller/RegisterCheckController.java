package com.insurance.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.insurance.beans.Insurance;



public class RegisterCheckController implements Controller {

@Override
public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
// TODO Auto-generated method stub
Integer id=Integer.parseInt("id");
String clientNumber=req.getParameter("cn");
String clientType=req.getParameter("ct");
String  dob=req.getParameter("dob");
String  mobile=req.getParameter("mobile");
String address=req.getParameter("address");
String state=req.getParameter("state");
String  initialAmount=req.getParameter("ia");
String name=req.getParameter("name");
String password=req.getParameter("pw");
String  age=req.getParameter("age");
String email=req.getParameter("email");
String city=req.getParameter("city");
String nation=req.getParameter("nation");



ModelAndView mav=null;
Insurance s=new Insurance(id,clientNumber,clientType,dob,mobile,address,state,initialAmount,name,password,age,email,city,nation);
PrintWriter pw=res.getWriter();
DbOperations dop=new DbOperations();

if(clientNumber.isEmpty() ||clientType.isEmpty() ||dob.isEmpty()||mobile.isEmpty() ||address.isEmpty() || state.isEmpty() ||initialAmount.isEmpty()|| name.isEmpty() || password.isEmpty() ||age.isEmpty()|| email.isEmpty() || city.isEmpty() || nation.isEmpty()) 
{
System.out.println("Your registration failed ");
mav=new ModelAndView("failr","msg1","not registered");

}
else {
int ids =dop.insert(s);

  System.out.println("Your registration sucess ");
mav=new ModelAndView("Registersuccess","user",clientNumber);
}

return mav;
}

}
