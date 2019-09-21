  <%@ page contentType="text/html;charset=utf-8" import="java.sql.*" %>
      <%
 request.setCharacterEncoding("utf-8");  //Set encoding
 String id  =        request.getParameter("id");
 String pwd =     request.getParameter("pwd");
 String email  =   request.getParameter("email");


 try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/cs157a?useUnicode=true&characterEncoding=utf-8";
    Connection con = DriverManager.getConnection(url,"root","57575Han");
    Statement stat = con.createStatement();
    String query = "INSERT INTO member(id, pwd, age)  VALUES('"+id+"','"+pwd+"','"+age+"')";

  stat.executeUpdate(query);
  stat.close();
  con.close();
 }
 catch(Exception e){
  out.println( e );
 }
 response.sendRedirect("output.jsp");
%>

