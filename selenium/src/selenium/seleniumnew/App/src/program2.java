import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","3366");
		Statement stmt=con.createStatement();
		//int i=stmt.executeUpdate("insert into persons values(11,'hari','krishna','andhra','kurnool')");
          int i=stmt.executeUpdate("update dept set City='ts' where personid=33)");
        		  
		System.out.println("Rows Created :"+i);
		stmt.close();
		con.close();  
		
		
}


	}


