package com.grocerry.dataapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShoppingList {

	private String title;

	@Id
	private int shoppingListId;

	public ShoppingList () {
	}

	public ShoppingList (String title) {
		this.title = title;
	}

	public ShoppingList (int shoppingListId, String  title) {
		this.title = title;
		this.shoppingListId = shoppingListId;
	}


	public String getTitle () {
		return title;
	}

	public void setTitle (String title) {
		this.title = title;
	}

	public int getShoppingListId () {
		return shoppingListId;
	}

	public void setShoppingListId (int shoppingListId) {
		this.shoppingListId = shoppingListId;
	}
}
