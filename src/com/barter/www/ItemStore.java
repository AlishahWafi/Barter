package com.barter.www;

import java.util.Arrays;
import java.util.LinkedHashMap;

import com.barter.mvc.Store;
import com.barter.www.ItemModel;


public class ItemStore extends Store {
	public ItemModel model;
	
	// manipulate base/parent class fields data
	static {
		SQL_TABLE = "ITEM";
		SQL_FIELDS = Arrays.asList("id", "user_id", "sub_category_id", "title", "price", "description");
	}
	
	public ItemStore(ItemModel model) {
		this.model = model;
	}
	
	public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>()  {
			private static final long serialVersionUID = 1L;
			{
				put("id", Integer.toString(model.getId()));
				put("user_id", Integer.toString(model.getUserId()));
				put("sub_category_id", Integer.toString(model.getSubCategoryId()));
				put("title", (model.getTitle()));
				put("price", Double.toString(model.getPrice()));
				put("description", (model.getDescription()));
				
			}
		};
    }
}
