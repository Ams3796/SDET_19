package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFrom_DB
{
	public static void main(String[] args) throws SQLException {
		//1.Register the driver
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		//2.Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33060/fruits","root","root");
        
	    //3.Create statement
	    Statement stat = con.createStatement();
		
		//4.Execute any query - provide table name
		ResultSet result = stat.executeQuery("Select * from fruit");
        while(result.next())
        {
        	System.out.println(result.getString(1)+"/t"+result.getString(2));
        }
        
        //5.Close the database connection
        con.close();
	}

}
