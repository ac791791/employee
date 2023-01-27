
package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class PrintHello {
	
	public static final Logger logger = Logger.getLogger("PrintHello.class");
	
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashish", "root", "India@12345");

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select* from employee");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}

		insert(con);
		
		System.out.println("After Update");
		rs = stmt.executeQuery("Select* from employee");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}

		
		con.close();
	}

	public static void insert(Connection con) throws SQLException {
		Statement stmt= con.createStatement();
		String query="insert into employee values(101,'Nitin Gajraj',25)";
		stmt.executeUpdate(query);
		
	}
}
