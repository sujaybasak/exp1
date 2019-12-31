package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class jdbcEx {

	public static void main(String[] args) throws Exception {
		
		jdbcEx ex = new jdbcEx();
		ex.addRow();
		ex.fetchAndDisplay();
	}
	Connection createConnection() throws SQLException{
		DriverManager.registerDriver(new OracleDriver());
		String url ="jdbc:oracle:thin:@192.168.2.180:1521:xe";
		//String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		//String url ="jdbc:oracle:thin:@localhost:1521:xe";
		//creating connection
		Connection connection = DriverManager.getConnection(url,"system","oracle");
		//create statement object
		return connection;
	}
	public void addRow() {
		try {
			Connection connection =createConnection();
			//statement object
			Statement statement = connection.createStatement();
			//execute query to fetch result
			String sql ="insert into employees(id,name) values(53,'abcr')";
			int count = statement.executeUpdate(sql);
			System.out.println("no of rows updated="+count);
		}
		catch(SQLException e) {
			e.printStackTrace();
	}
			
	}
	public void fetchAndDisplay() {
		try {
			Connection connection = createConnection();
			Statement  statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from employees");
			while(resultset.next()) {
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				System.out.println("id: "+id+"name: "+name);
				
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	}

}

	
	


