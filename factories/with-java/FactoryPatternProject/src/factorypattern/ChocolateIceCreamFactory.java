
package factorypattern;

public class ChocolateIceCreamFactory implements IceCreamFactory {
    public IceCream createIceCream() {
        return new ChocolateIceCream();
    }
}
