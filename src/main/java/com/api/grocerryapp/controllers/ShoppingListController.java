package com.api.grocerryapp.controllers;

import com.api.grocerryapp.models.ShoppingList;
import com.api.grocerryapp.services.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ShoppingListController {

	@Autowired
	private ShoppingListService shoppingService;

	@RequestMapping("/shoppinglists")
	public List<ShoppingList> getShoppingLists() {
		return this.shoppingService.getAllShoppingLists();
	}

	@RequestMapping("/")
	public String hello () {
		return "Hello World";
	}

	@RequestMapping("/shoppinglist/{id}")
	public ShoppingList getShoppingList(@PathVariable int id) {
		return this.shoppingService.getAllShoppingListById(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/shoppinglist")
	public void addShoppingList (@RequestBody ShoppingList shoppingList) {
		this.shoppingService.addShoppingList(shoppingList);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/shoppinglist/{id}")
	public void addShoppingList (@PathVariable int id) {
		this.shoppingService.deleteShoppingList(id);
	}
}
