package com.exam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DataIn extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      request.getSession().getAttribute("list");
      if (request.getSession().getAttribute("list") != null) {
      request.getRequestDispatcher("detail.jsp").forward(request, response);
    } else {
      request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
}
