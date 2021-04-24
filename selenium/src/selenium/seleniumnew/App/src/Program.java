import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author super
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception 
	{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","3366");
			Statement stmt=con.createStatement();
			//ResultSet rs=stmt.executeQuery("select * from dept");
			//int i=stmt.executeUpdate("insert into dept values(11,'ME','Telengana')");
			//int i=stmt.executeUpdate("update dept set loc='ts' where deptno=11");
			int i=stmt.executeUpdate("delete dept where deptno=10");
			//int i=stmt.executeUpdate("create table emp_tab(eid number(5),ename varchar2(20),sal number(5))");
			System.out.println("Rows Created :"+i);
			//System.out.println("Rows inserted :"+i);
			/*while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
			}*/
			stmt.close();
			con.close();  
			
			
	}

}
