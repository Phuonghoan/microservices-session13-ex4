package org.example.identityservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductTestController {

    @GetMapping("/api/products")
    public List<Map<String, Object>> getProducts() {

        return List.of(
                Map.of(
                        "id", 1,
                        "name", "Product A",
                        "price", 100000
                ),
                Map.of(
                        "id", 2,
                        "name", "Product B",
                        "price", 200000
                )
        );
    }
}
