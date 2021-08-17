<html>
  <%@ page import="java.util.ArrayList" %>
  <%@ page import="java.util.Arrays" %> 
  <%@ page import="java.util.List" %>
  <% 
  response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  if(session.getAttribute("list")!=null)
  { 
    List<String> list=new ArrayList(Arrays.asList(request.getAttribute("list")));
      
      %>
      <p style="text-align: center">Date of Birth : <%out.print(list.get(0)); %>
  </p><%
      
  }
    else{
      response.sendRedirect("index.jsp");
    }%>

<form action="logoutPage">
<h3 style="text-align: center"> <input type="submit" value="LogOut"/></h3>
</form>
<form action="dataIn">
  <h3 style="text-align: center"> <input type="submit" value="Registered Data"/></h3>
  </form>

</html>
