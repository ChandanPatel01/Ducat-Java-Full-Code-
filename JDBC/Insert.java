import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Insert {
  public static void main(String[] args) {
     String className="com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/Chandan?useSSL=false";
    String username = "root";
    String password = "Cpatel@123456";
    String sql = "INSERT INTO emp (Empno, EmpNmae, EmpAddress) VALUES (101, 'Chandan', 'Noida')";

    try {
      // Load and configure the MySQL JDBC driver
      Class.forName(className);
      System.out.println("Driver loaded and configured...");

      // Establish the connection
      Connection connection = DriverManager.getConnection(url, username, password);
      System.out.println("Connection established...");

       
      Statement statement = connection.createStatement();
      statement.executeUpdate(sql);
      System.out.println("Query executed...");


      connection.close();
    } 
	catch (ClassNotFoundException e) {
      System.out.println("Driver not found...");
    }
	catch (SQLException e) {
      
    }
  }
}
