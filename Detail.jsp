<html>
  <head>
    <style>
      table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
      }
      th, td {
        padding: 5px;
        text-align: left;    
      }
      </style>
  </head>
    
  <%@ page import="java.util.HashMap" %>
  <%@ page import="java.util.List" %>
  <%@ page import="com.exam.User"%>


  <%response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  %>
<table style="width:100%"><tr><th>Message</th>
<th>DOB</th><th>Id</th><th>Name</th><th>password</th><th>Email</th><th>Phone No</th><th>update</th></tr>
  <% List<String> lis= User.getUserValue();
    for(int i=0;i<=lis.size();i+=7)
      {
        out.println(lis.get(i));

      %>
      <h2  style="text-align: center">  <input type="button"  onclick="window.location.href='/update'" value="Update"/>
      </h2>
  

      <%  }
  %>
</table>
<form action="dataOut">
  <h3 style="text-align: center"> <input type="submit" value="Back"/></h3>
  </form>
<form action="logoutPage">
  <h3 style="text-align: center"> <input type="submit" value="LogOut Registered Data"/></h3>
  </form>
</html>
