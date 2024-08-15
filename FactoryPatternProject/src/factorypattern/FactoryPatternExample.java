
package factorypattern;

public class FactoryPatternExample {
    public static void main(String[] args) {
        IceCreamFactory vanillaFactory = new VanillaIceCreamFactory();
        IceCream vanilla = vanillaFactory.createIceCream();
        vanilla.serve();

        IceCreamFactory chocolateFactory = new ChocolateIceCreamFactory();
        IceCream chocolate = chocolateFactory.createIceCream();
        chocolate.serve();
    }
}
