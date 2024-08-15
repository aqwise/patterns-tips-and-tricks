package com.example;

import com.example.factory.*;

public class App {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        // Using enum
        Product productA = factory.createProduct(ProductType.PRODUCT_A);
        productA.use();  // Output: Using Product A

        Product productB = factory.createProduct(ProductType.PRODUCT_B);
        productB.use();  // Output: Using Product B

        // Using sealed interface
        Product sealedProductA = factory.createProduct(new ProductTypeA());
        sealedProductA.use();  // Output: Using Product A

        Product sealedProductB = factory.createProduct(new ProductTypeB());
        sealedProductB.use();  // Output: Using Product B
    }
}
