package com.exam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Register extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    request.getRequestDispatcher("welcome.jsp").forward(request, response);
  };
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    String name = request.getParameter("name");
    String passWord = request.getParameter("pass");
    String passWord1 = request.getParameter("pswd2");
    String dob = request.getParameter("dob");
    String id = request.getParameter("id");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    if(passWord.equals(passWord1))
    {   
    List<String>list= new ArrayList<>(); 
    list.add(name);
    list.add(passWord);
    list.add(dob);
    list.add(id);
    list.add(email);
    list.add(phone); 
    User.users.put(id, passWord);
    User.userdata.put(id,list);
    System.out.println(name + " " + passWord);
    HashMap<String, String> map = User.users;
    System.out.println(map);
    request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    else{
      request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }    
  }
}
