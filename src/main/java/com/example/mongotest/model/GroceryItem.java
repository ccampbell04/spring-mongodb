package com.example.mongotest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("GroceryItem")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroceryItem {

    @Id
    private String id;
    private String name;
    private int quantity;
    private String category;

}
