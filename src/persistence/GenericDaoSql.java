package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoSql {
	
	private Connection c;

	public GenericDaoSql() {
		super();
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "mysql";
		String user = "root";
		String senha = "alunofatec";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = DriverManager.getConnection(
				String.format("jdbc:mysql://%s:3306/%s", hostName, dbName), 
				user, senha);
		String sgdb = c.getMetaData().getDatabaseProductName();
		System.out.println(sgdb);
		return c;
	}
}
