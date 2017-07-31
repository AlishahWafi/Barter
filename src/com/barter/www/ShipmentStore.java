package com.barter.www;

import java.util.Arrays;
import java.util.LinkedHashMap;

import com.barter.mvc.Store;
import com.barter.www.ShipmentModel;


public class ShipmentStore extends Store {
	public ShipmentModel model;
	
	// manipulate base/parent class fields data
	static {
		SQL_TABLE = "SHIPMENT";
		SQL_FIELDS = Arrays.asList("id","item_id","payment_method_id","date_of_payment","seller_user_id","buyer_user_id","status");
	}
	
	public ShipmentStore(ShipmentModel model) {
		this.model = model;
	}
	
	public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>()  {
			private static final long serialVersionUID = 1L;
			{
				put("id", Integer.toString(model.getId()));
				put("item_id", Integer.toString(model.getItemId()));
				put("payment_method_id", Integer.toString(model.getPaymentMethodId()));
				put("date_of_payment", (model.getDateOfPayment()));
				put("seller_user_id", Integer.toString(model.getSellerUserId()));
				put("buyer_user_id", Integer.toString(model.getBuyerUserId()));
				put("status", (model.getStatus()));
				
			}
		};
    }
}
