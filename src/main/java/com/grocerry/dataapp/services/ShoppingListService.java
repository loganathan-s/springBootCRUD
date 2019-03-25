package com.grocerry.dataapp.services;

import com.grocerry.dataapp.models.ShoppingList;
import com.grocerry.dataapp.repositories.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShoppingListService {

	@Autowired
	private ShoppingListRepository repository;
	private List<ShoppingList> shoppingLists;


	public ShoppingListService () {
//		this.shoppingLists = new ArrayList<ShoppingList>();
//		this.shoppingLists.add(new ShoppingList(1,"wallmart1"));
//		this.shoppingLists.add(new ShoppingList(2,"wallmart2"));
//		this.shoppingLists.add(new ShoppingList(3,"wallmart3"));
	}

	public List<ShoppingList> getAllShoppingLists () {
		List<ShoppingList> shoppingLists = new ArrayList<>();
		//this.repository.findAll().forEach(x -> shoppingLists.add(x));
		//SHORT WAY
		this.repository.findAll().forEach(shoppingLists::add);
		return shoppingLists;
	}

	public ShoppingList getAllShoppingListById (int shoppingListId) {
		return this.shoppingLists.stream().filter(
			x -> x.getShoppingListId() == shoppingListId
		).findFirst().get();
	}

	public void addShoppingList(ShoppingList shoppingList ) {
		this.shoppingLists.add(shoppingList);
	}

	public void deleteShoppingList(int shoppingListId) {
		ShoppingList shoppingList = getAllShoppingListById(shoppingListId);
		this.shoppingLists.remove(shoppingList);
	}

}
