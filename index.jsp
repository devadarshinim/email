<html>
<% if(true)
{
    %>  
<form action="loginPage" method="post"> 
<h1 style="text-align: center"> Welcome</h1>
<h2 style="text-align: center"> User ID:<input type="text" name="id"/><br/></h1> 
<h2 style="text-align: center">     Password:<input type="password" name="upass"/><br/></h1> 
  <h2 style="text-align: center">   <input type="submit" name="button" value="Login"/> 
  </h2>

  </form> 
  <h2  style="text-align: center">  <input type="button" onclick="window.location.href='/register'" value="Register"/>
</h2>
<% }
else
{
  response.sendRedirect("out.jsp");
}%>
    </html>
