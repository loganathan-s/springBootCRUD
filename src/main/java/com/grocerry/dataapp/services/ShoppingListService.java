package com.grocerry.dataapp.services;

import com.grocerry.dataapp.models.ShoppingList;
import com.grocerry.dataapp.repositories.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShoppingListService {

	@Autowired
	private ShoppingListRepository repository;
	private List<ShoppingList> shoppingLists;


	public ShoppingListService () {
	}

	public List<ShoppingList> getAllShoppingLists () {
		List<ShoppingList> shoppingLists = new ArrayList<>();
		//this.repository.findAll().forEach(x -> shoppingLists.add(x));
		//SHORT WAY
		this.repository.findAll().forEach(shoppingLists::add);
		return shoppingLists;
	}

	public Optional<ShoppingList> getAllShoppingListById (int shoppingListId) {
		return this.repository.findById(shoppingListId);
//		return this.shoppingLists.stream().filter(
//			x -> x.getShoppingListId() == shoppingListId
//		).findFirst().get();
	}

	public void addShoppingList(ShoppingList shoppingList ) {
		this.repository.save(shoppingList);
	}

	public void updateShoppingList(ShoppingList shoppingList ) {
		Optional<ShoppingList> result = getAllShoppingListById(shoppingList.shoppingListId);
		if(result.isPresent()) {
				ShoppingList persistanceShoppingList = result.get();
				persistanceShoppingList.setTitle(shoppingList.getTitle());
				this.repository.save(persistanceShoppingList);
		}
	}

	public void deleteShoppingList(int shoppingListId) {
		Optional<ShoppingList> result = getAllShoppingListById(shoppingListId);
		if(result.isPresent()) {
			this.repository.deleteById(shoppingListId);
		}
	}

}
