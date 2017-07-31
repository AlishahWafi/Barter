package com.barter.www;

import com.barter.mvc.Model;

public class SubCategoryModel extends Model {
	private int id;
	private int category_id;
	private String name;

	public SubCategoryModel() {
	}

	public SubCategoryModel(int id, int category_id, String name) {
		this.setId(id);
		this.setCategoryId(category_id);
		this.setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return category_id;
	}

	public void setCategoryId(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
