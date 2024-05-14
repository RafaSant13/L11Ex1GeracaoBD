package view;

import java.sql.SQLException;

import persistence.GenericDaoSql;

public class Teste {

	public static void main(String[] args) {
		GenericDaoSql gdsql = new GenericDaoSql();
		
		try {
			gdsql.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
