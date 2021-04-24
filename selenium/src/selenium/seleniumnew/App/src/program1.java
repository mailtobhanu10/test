import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "3366");
		Statement stmt = cn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Persons");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5));
		}
		stmt.close();
		cn.close();
	}
}