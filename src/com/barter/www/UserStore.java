package com.barter.www;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

import java.sql.ResultSet;

import com.barter.mvc.MySQLConnection;
import com.barter.mvc.Store;
import com.barter.www.UserModel;


public class UserStore extends Store {
	public UserModel model;
	
	// manipulate base/parent class fields data
	static {
		SQL_TABLE = "USER";
		SQL_FIELDS = Arrays.asList("fullname", "username", "password", "date_of_birth", "gender", "email", "card_number", "mobile", "phone", "address", "location");
	}
	
	public UserStore(UserModel model) {
		this.model = model;
	}
	
	public List<UserModel> Select() throws Exception {
		List<UserModel> list = new ArrayList<UserModel>();
		ResultSet result_set = MySQLConnection.getResultSet(SELECT_QUERY);
		while(result_set.next()) {
			list.add(new UserModel(
				result_set.getString(1),
				result_set.getString(2),
				result_set.getString(3),
				result_set.getString(4),
				result_set.getString(5),
				result_set.getString(6),
				result_set.getString(7),
				result_set.getString(8),
				result_set.getString(9),
				result_set.getString(10),
				result_set.getString(11)
			));
		}
		return list;
	}
	
	public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>()  {
			private static final long serialVersionUID = 1L;
			{
				put("fullname", model.getFullname());
				put("username", model.getUsername());
				put("password", model.getPassword());
				put("date_of_birth", model.getDateOfBirth());
				put("gender", model.getGender());
				put("email", model.getEmail());
				put("card_number", model.getCardNumber());
				put("mobile", model.getMobile());
				put("phone", model.getPhone());				
				put("address", model.getAddress());
				put("location", model.getLocation());
			}
		};
    }
}
