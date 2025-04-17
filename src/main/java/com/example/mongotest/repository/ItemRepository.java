package com.example.mongotest.repository;

import com.example.mongotest.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {

    @Query("{'name': ?0}")
    GroceryItem findByName(String name);

    @Query(value = "{category: ?0}", fields = "{'name': 1, 'quantity': 1}")
    GroceryItem findAll(String category);

    public long count();
}
