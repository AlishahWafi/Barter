package com.barter.www;

import com.barter.mvc.Model;

public class AuctionModel extends Model {
	private int id;
	private int item_id;
	private double start_price;
	private double increment;
	private double current_price;
	private String expiration;
	private int status;
	private String description;

	public AuctionModel() {
	}

	public AuctionModel(int id, int item_id, double start_price, double increment, double current_price,
			String expiration, int status, String description) {
		this.setId(id);
		this.setItemId(item_id);
		this.setStartPrice(start_price);
		this.setIncrement(increment);
		this.setCurrentPrice(current_price);
		this.setExpiration(expiration);
		this.setStatus(status);
		this.setDescription(description);

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

	public double getStartPrice() {
		return start_price;
	}

	public void setStartPrice(double start_price) {
		this.start_price = start_price;
	}

	public double getIncrement() {
		return increment;
	}

	public void setIncrement(double increment) {
		this.increment = increment;
	}

	public double getCurrentPrice() {
		return current_price;
	}

	public void setCurrentPrice(double current_price) {
		this.current_price = current_price;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
