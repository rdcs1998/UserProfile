
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectDatabase {

	public static void main(String[] args) {
	try{// TODO Auto-generated method stub
		String driver ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://database-1.c8muyavuvtju.us-east-2.rds.amazonaws.com:3306";
		String username="admin";
		String password = "password";
		
		//Step1
		
		Class.forName(driver);
		//Step2 connect
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("SIIIIIIIUUUUUUUUUUUUUU");
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	

}
