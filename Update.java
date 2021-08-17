package com.exam;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    request.getRequestDispatcher("welcome.jsp").forward(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    String msg = request.getParameter("messages");
    String dobs = request.getParameter("dobs");
    String names = request.getParameter("names");
    String emails = request.getParameter("emails");
    String ids = request.getParameter("ids");
    String passs = request.getParameter("passs");
    String phones = request.getParameter("phoness");
    request.setAttribute("msg", msg);
    request.setAttribute("dobs", dobs);
    request.setAttribute("names", names);
    request.setAttribute("emails", emails);
    request.setAttribute("ids", ids);
    request.setAttribute("passs", passs);
    request.setAttribute("phoness", phones);
  /*  List<String> lis = new ArrayList<String>();
    lis.set(0,msg);
    lis.set(1,dobs);
    lis.set(3,names);
    lis.set(4,emails);
    lis.set(5,phones);
    User.users.put(ids, passs);
    User.userdata.put(ids, lis);
    System.out.println(names + " " + passs);
    HashMap<String, String> map = User.users;
    System.out.println(map);
    User.userdata.get(ids);
*/    request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
