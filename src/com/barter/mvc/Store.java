package com.barter.mvc;

import com.barter.mvc.Utils;
import com.barter.mvc.MySQLConnection;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.LinkedHashMap;


public class Store {
	// every store class must inherit this class
	
	public static String SQL_TABLE;
	public static List<String> SQL_FIELDS;
	public String SELECT_QUERY = String.format("SELECT * FROM %s;", SQL_TABLE);
    public String INSERT_QUERY = String.format("INSERT INTO %s (%s) VALUES (%s);", SQL_TABLE, Utils.join(", ", SQL_FIELDS), Utils.generateString("?", SQL_FIELDS.size(), ", "));
    public String UPDATE_QUERY = String.format("UPDATE %s SET %s=? ", SQL_TABLE, Utils.join("=?, ", SQL_FIELDS));
    
    public Store() {
    }
    	
    public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>();
    }
    
	public void Save() throws Exception {
		RunQuery(INSERT_QUERY);
	}
	
	public void Update(String where) throws Exception {
		RunQuery(String.format("%s WHERE %s;", UPDATE_QUERY, where));
	}
	
	public void RunQuery(String query) throws Exception {
    	PreparedStatement statement = MySQLConnection.getStatement(query);
		int index = 0;
		for (String key : getData().keySet()) {
			statement.setString(++index, getData().get(key));
		}
		statement.executeUpdate();
    }
}
