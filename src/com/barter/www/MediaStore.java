package com.barter.www;

import java.util.Arrays;
import java.util.LinkedHashMap;

import com.barter.mvc.Store;
import com.barter.www.MediaModel;


public class MediaStore extends Store {
	public MediaModel model;
	
	// manipulate base/parent class fields data
	static {
		SQL_TABLE = "MEDIA";
		SQL_FIELDS = Arrays.asList("id", "item_id", "image");
	}
	
	public MediaStore(MediaModel model) {
		this.model = model;
	}
	
	public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>()  {
			private static final long serialVersionUID = 1L;
			{
				put("id", Integer.toString(model.getId()));
				put("item_id", Integer.toString(model.getItemId()));
				put("image", model.getImage());
			}
		};
    }
}
