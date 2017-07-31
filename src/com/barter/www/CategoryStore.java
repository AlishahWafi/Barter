package com.barter.www;

import java.util.Arrays;
import java.util.LinkedHashMap;

import com.barter.mvc.Store;
import com.barter.www.CategoryModel;


public class CategoryStore extends Store {
	public CategoryModel model;
	
	// manipulate base/parent class fields data
	static {
		SQL_TABLE = "CATEGORY";
		SQL_FIELDS = Arrays.asList("id", "name");
	}
	
	public CategoryStore(CategoryModel model) {
		this.model = model;
	}
	
	public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>()  {
			private static final long serialVersionUID = 1L;
			{
				put("id", Integer.toString(model.getId()));
				put("name", model.getName());
			
			}
		};
    }
}
