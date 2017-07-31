package com.barter.www;

import com.barter.mvc.Model;

public class MediaModel extends Model {
	private int id;
	private int item_id;
	private String image;

	public MediaModel() {

	}

	public MediaModel(int id, int item_id, String image) {
		this.setId(id);
		this.setItemId(item_id);
		this.setImage(image);

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
