import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


class Drop{
  public static void main(String[]args){
	 String className="com.mysql.cj.jdbc.Driver";
	 String url="jdbc:mysql://localhost:3306/Chandan?useSSL=false";
	 String username="root";
	 String password="Cpatel@123456";
	 String sql="Drop table emp";
 
			 try{
			   Class.forName(className);
			   System.out.println("Load and Configure...");
			   
			   Connection connection=DriverManager.getConnection(url,username,password);
			   System.out.println("Eshtabish Connection...");
			   
			   Statement statement=connection.createStatement();
			  int count=statement.executeUpdate(sql);
			   System.out.println("Query Excuted...");
			   
			   connection.close();
			 }
			 
			 catch(ClassNotFoundException e){
			  System.out.println("Query not Excuted...");
			 }
			 
			 catch(SQLException e){
			  e.printStackTrace();
			 }
}
}