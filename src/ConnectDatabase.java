
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectDatabase {

	public static void main(String[] args) throws Exception 
	{
	CreateTable();
	}
	
	public static void CreateTable() throws Exception{
		try {
			Connection connect=getConnection();
			PreparedStatement createTable=connect.prepareStatement("CREATE TABLE IF NOT EXISTS`ProfilesDB` (\r\n"
					+ "	`id` INT NOT NULL AUTO_INCREMENT,\r\n"
					+ "	`firstName` VARCHAR(255),\r\n"
					+ "	`lastName` VARCHAR(255),\r\n"
					+ "	`email` VARCHAR(255),\r\n"
					+ "	`password` VARCHAR(255),\r\n"
					+ "	PRIMARY KEY (`id`)\r\n"
					+ ");");
			createTable.executeUpdate();
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("done");}
	}
	
	public static Connection getConnection() throws Exception{
		try{// TODO Auto-generated method stub
			String driver ="com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://database-1.c8muyavuvtju.us-east-2.rds.amazonaws.com:3306/SDETData";
			String username="admin";
			String password = "password";
			
			//Step1
			
			Class.forName(driver);
			//Step2 connect
			Connection connect = DriverManager.getConnection(url, username, password);
			System.out.println("SIIIIIIIUUUUUUUUUUUUUU");
			return connect;
		}catch(Exception e) {System.out.println(e);}
		return null;
		}
	
	public static void post(String first,String last, String email, String password) throws Exception{
		
		try {
			Connection connect = getConnection();
			PreparedStatement posted = connect.prepareStatement("INSERT INTO ProfilesDB (firstName, lastName, email, password) VALUES('"+first+"', '"+last+"', '"+email+"', '"+password+"')");
			
			posted.executeUpdate();
			
		}catch(Exception e) {System.out.println(e);}
		
	}

}
	



