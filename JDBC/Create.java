import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create{
public static void main(String[]args){

 String className="com.mysql.cj.jdbc.Driver";// Yha pr driver Load ho rha hai
 
 String url="jdbc:mysql://localhost:3306/Chandan?useSSL=false";
 String username="root";
 String password="Cpatel@123456";
 String sql="create table emp(Empno int,EmpNmae varchar(20), EmpAddress varchar(20))";
 
 try{
     Class.forName(className);
	 System.out.println("Class and Configure is load....");
	 
	 Connection connection=DriverManager.getConnection(url,username,password);
	 System.out.println("Connection is Establish...");
	 
	 Statement statement=connection.createStatement();
	 int count=statement.executeUpdate(sql);  // hm store kra bhi skate nhi bhi choice
	 System.out.println("Query is Executed...");
	 
	 connection.close();
	 
 }
    catch(ClassNotFoundException e){
       System.out.println("Database not Connect!");
    }
 
    catch(SQLException e){
      e.printStackTrace();
      }
 }
}
