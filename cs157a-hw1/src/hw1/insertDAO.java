package hw1;

import java.io.*;
import java.sql.*;

 
public class insertDAO {
	
  public static boolean create(DTO dto) throws Exception {
	 
   boolean flag = false;
   Connection con = null;
   Statement stmt = null; // transfer data
   String name = dto.getId();
   String passwd = dto.getPassword();
   String age = dto.getAge();
   
   String sql = "INSERT INTO guest(id, password, age) VALUES";
 
   try {
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs157a?serverTimezone=UTC", "root", "57575Han");
    System.out.println("success connection");
    
    
   stmt = (Statement) con.createStatement();
   
   ResultSet rs=stmt.executeQuery("select * from cs157a");
   while(rs.next())
   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
   
    flag = true;
   } catch (Exception e) {
    System.out.println(e);
    flag = false;
   } finally {
 
    try {
    
    if (stmt != null)
      stmt.close();
     if (con != null)
      con.close();
    } catch (Exception e) {
     System.out.println(e.getMessage());
    }
   }
 
   return flag;
 
  }
  public static void main(String[] args) {
		
  }
}
