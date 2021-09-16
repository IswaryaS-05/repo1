package com.insurance.controller;


import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.insurance.beans.Insurance;



public class DbOperations{


public Integer insert(Insurance i) {
Configuration cfg=new Configuration();
cfg.configure("insurance.cfg.xml");

SessionFactory factory=cfg.buildSessionFactory();
Session sess=factory.openSession();
Transaction tx=sess.beginTransaction();
Serializable sid=sess.save(i);
tx.commit();
sess.close();
factory.close();

return (int)sid;
}
public boolean loginCheck(String u, String p)
{
String n1;
String n2;
int flag=0;
Configuration cfg=new Configuration();
cfg.configure("insurance.cfg.xml");


SessionFactory factory=cfg.buildSessionFactory();
Session sess=factory.openSession();
Transaction tx=sess.beginTransaction();

         List stu=sess.createQuery("from Insurance").list();
         for(Iterator iterator=stu.iterator();iterator.hasNext();)
         {
        Insurance stu1=(Insurance) iterator.next();
        n1=stu1.getClientNumber();
        n2=stu1.getPassword();
         

         if(n1.equalsIgnoreCase(u)&& n2.equalsIgnoreCase(p)) {
       
        flag=1;
    break;
    }
    else {
   
    flag=0;
    }
         
         }
         tx.commit();
  sess.close();
  factory.close();
         
         if(flag==1)
         {
        return true;
         }
         else
         {
        return false;
         }
}

         
}
