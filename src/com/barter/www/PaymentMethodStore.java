package com.barter.www;

import java.util.Arrays;
import java.util.LinkedHashMap;

import com.barter.mvc.Store;
import com.barter.www.PaymentMethodModel;


public class PaymentMethodStore extends Store {
	public PaymentMethodModel model;
	
	// manipulate base/parent class fields data
	static {
		SQL_TABLE = "PAYMENT_METHOD";
		SQL_FIELDS = Arrays.asList("id", "method");
	}
	
	public PaymentMethodStore(PaymentMethodModel model) {
		this.model = model;
	}
	
	public LinkedHashMap<String, String> getData() {
    	return new LinkedHashMap<String, String>()  {
			private static final long serialVersionUID = 1L;
			{
				put("id", Integer.toString(model.getId()));
				put("method", model.getMethod());
			}
		};
    }
}
