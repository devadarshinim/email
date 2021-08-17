package com.exam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataOut extends HttpServlet {
    public void doGet(HttpServletRequest request, 
    HttpServletResponse response) 
      throws ServletException, IOException 
  {
      response.sendRedirect("out.jsp");  
  }
}
