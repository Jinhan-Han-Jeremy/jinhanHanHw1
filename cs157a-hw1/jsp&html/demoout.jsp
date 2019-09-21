  <%@ page import="java.sql.*"%>
    <html>
    <head>
    <title>JDBC Connection example</title>
    </head>
    <body>
    <h1>JDBC Connection example</h1>

    <table border="1">
    <tr>
    <td>iD</td>
    <td>pwd</td>
    <td>age</td>
    </tr>
      <%
     String db = "cs157a";
        String user; // assumes database name is the same as username
          user = "root";
        String password = "57575Han";
        try {

            java.sql.Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs157a?serverTimezone=UTC",user, password);
            out.println(db + " database successfully opened.<br/><br/>");

            out.println("Initial entries in table \"cs157a\": <br/>");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cs157a");
            while (rs.next()) {
                out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + "<br/><br/>");
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException e) {
            out.println("SQLException caught: " + e.getMessage());
        }
    %>
    </body>
    </html>
