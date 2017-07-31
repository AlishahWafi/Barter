package com.barter.www;

import com.barter.mvc.Model;

public class PaymentMethodModel extends Model {
	private int id;
	private String method;

	public PaymentMethodModel() {

	}

	public PaymentMethodModel(int id, String method) {
		this.setId(id);
		this.setMethod(method);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
