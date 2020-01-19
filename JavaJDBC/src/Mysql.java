import java.sql.*;  
public class Mysql {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/javajdbc","root","admin");  
		 
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
			System.out.println(rs.getInt(3)+"  "+rs.getString(2)+"  "+rs.getInt(1));  
		}
		catch(Exception e){ System.out.println(e);
		
		}  
		
		
		}
	
		
	

}
