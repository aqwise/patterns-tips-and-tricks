package com.example.factory;

public class ProductFactory {
    public Product createProduct(ProductType type) {
        return switch (type) {
            case PRODUCT_A -> new ConcreteProductA();
            case PRODUCT_B -> new ConcreteProductB();
        };
    }

    public Product createProduct(ProductTypeSealed type) {
        return switch (type) {
            case ProductTypeA a -> new ConcreteProductA();
            case ProductTypeB b -> new ConcreteProductB();
        };
    }
}
