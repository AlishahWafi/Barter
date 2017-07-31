package com.barter.www;

import java.util.Arrays;
import java.util.LinkedHashMap;

import com.barter.mvc.Store;
import com.barter.www.SubCategoryModel;


public class SubCategoryStore extends Store {
	public SubCategoryModel model;
	
	// manipulate base/parent class fields data
	static {
		SQL_TABLE = "SUBCATEGORY";
		SQL_FIELDS = Arrays.asList("id", "category_id", "name");
	}
	
	public SubCategoryStore(SubCategoryModel model) {
		this.model = model;
	}
	
	public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>()  {
			private static final long serialVersionUID = 1L;
			{
				put("id", Integer.toString(model.getId()));
				put("category_id", Integer.toString(model.getCategoryId()));
				put("name", model.getName());
			
			}
		};
    }
}
