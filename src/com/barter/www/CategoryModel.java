package com.barter.www;

import com.barter.mvc.Model;

public class CategoryModel extends Model {
	private int id;
	private String name;

	public CategoryModel() {

	}

	public CategoryModel(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
