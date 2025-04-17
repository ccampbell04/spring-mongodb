package com.example.mongotest.controller;

import com.example.mongotest.model.GroceryItem;
import com.example.mongotest.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grocery")
public class GroceryController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/add")
    public String addGroceryItem(@RequestBody GroceryItem item) {
        itemRepository.save(item);
        return "groceryItemAdded";
    }

    @GetMapping("/get/{name}")
    public String getGroceryItem(@PathVariable String name) {
        GroceryItem item = itemRepository.findByName(name);
        if (item != null) {
            return "groceryItemFound " + item.toString();
        } else {
            return "groceryItemNotFound";
        }
    }
}
