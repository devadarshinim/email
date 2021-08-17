package com.exam;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    String id = request.getParameter("id");
    String passWord = request.getParameter("upass");

    HashMap<String, String> map = User.users;
    System.out.println(map);
    
    if (map.containsKey(id)) {
      System.out.println(map.get(id));

      if (map.get(id).equals(passWord)) {
        List<String> list=User.userdata.get(id);    
        request.getSession().setAttribute("list", list);
        request.setAttribute("list", list.toString());
        request.getRequestDispatcher("out.jsp").forward(request, response);;
      } else {
        response.sendRedirect("index.jsp");
      }
    } else {
  
      response.sendRedirect("index.jsp");
    }
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    if (request.getSession().getAttribute("list") != null) {
      request.getRequestDispatcher("out.jsp").forward(request, response);
    } else {
      request.getRequestDispatcher("index.jsp").forward(request, response);
    }
  }
}
