
package factorymethod;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        productA.doSomething();

        Product productB = ProductFactory.createProduct("B");
        productB.doSomething();
    }
}
