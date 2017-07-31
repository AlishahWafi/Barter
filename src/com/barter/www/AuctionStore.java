package com.barter.www;

import java.util.Arrays;
import java.util.LinkedHashMap;

import com.barter.mvc.Store;
import com.barter.www.AuctionModel;


public class AuctionStore extends Store {
	public AuctionModel model;
	
	// manipulate base/parent class fields data
	static {
		SQL_TABLE = "AUCTION";
		SQL_FIELDS = Arrays.asList("id", "item_id","start_price","increment","current_price","expiration","status","description");
	}
	
	public AuctionStore(AuctionModel model) {
		this.model = model;
	}
	
	public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>()  {
			private static final long serialVersionUID = 1L;
			{
				put("id", Integer.toString(model.getId()));
				put("item_id", Integer.toString(model.getItemId()));
				put("start_price", Double.toString(model.getStartPrice()));
				put("increment", Double.toString(model.getIncrement()));
				put("current_price", Double.toString(model.getCurrentPrice()));
				put("expiration", (model.getExpiration()));
				put("status", Integer.toString(model.getStatus()));
				put("description", model.getDescription());
				
			}
		};
    }
}
