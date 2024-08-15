package com.example.factory;

public sealed interface Product permits ConcreteProductA, ConcreteProductB {
    void use();
}
