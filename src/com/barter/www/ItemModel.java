package com.barter.www;

import com.barter.mvc.Model;

public class ItemModel extends Model {
	private int id;
	private int user_id;
	private int sub_category_id;
	private String title;
	private double price;
	private String description;

	public ItemModel() {
	}

	public ItemModel(int id, int user_id, int sub_category_id, String title, double price, String description) {
		this.id = id;
		this.user_id = user_id;
		this.sub_category_id = sub_category_id;
		this.title = title;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return user_id;
	}

	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	public int getSubCategoryId() {
		return sub_category_id;
	}

	public void setSubCategoryId(int sub_category_id) {
		this.sub_category_id = sub_category_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
