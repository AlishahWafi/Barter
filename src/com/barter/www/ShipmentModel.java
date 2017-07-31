package com.barter.www;

import com.barter.mvc.Model;

public class ShipmentModel extends Model {
	private int id;
	private int item_id;
	private int payment_method_id;
	private String date_of_payment;
	private int seller_user_id;
	private int buyer_user_id;
	private String status;

	public ShipmentModel() {
	}

	public ShipmentModel(int id, int item_id, int payment_method_id, String date_of_payment, int seller_user_id,
			int buyer_user_id, String status) {
		this.setId(id);
		this.setItemId(item_id);
		this.setPaymentMethodId(payment_method_id);
		this.setDateOfPayment(date_of_payment);
		this.setSellerUserId(seller_user_id);
		this.setBuyerUserId(buyer_user_id);
		this.setStatus(status);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemId() {
		return item_id;
	}

	public void setItemId(int item_id) {
		this.item_id = item_id;
	}

	public int getPaymentMethodId() {
		return payment_method_id;
	}

	public void setPaymentMethodId(int payment_method_id) {
		this.payment_method_id = payment_method_id;
	}

	public String getDateOfPayment() {
		return date_of_payment;
	}

	public void setDateOfPayment(String date_of_payment) {
		this.date_of_payment = date_of_payment;
	}

	public int getSellerUserId() {
		return seller_user_id;
	}

	public void setSellerUserId(int seller_user_id) {
		this.seller_user_id = seller_user_id;
	}

	public int getBuyerUserId() {
		return buyer_user_id;
	}

	public void setBuyerUserId(int buyer_user_id) {
		this.buyer_user_id = buyer_user_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
