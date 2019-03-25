package com.grocerry.dataapp.repositories;

import com.grocerry.dataapp.models.ShoppingList;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ShoppingListRepository extends CrudRepository<ShoppingList, Integer> {

}
