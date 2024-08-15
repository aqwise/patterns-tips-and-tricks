
package factorypattern;

public class VanillaIceCreamFactory implements IceCreamFactory {
    public IceCream createIceCream() {
        return new VanillaIceCream();
    }
}
