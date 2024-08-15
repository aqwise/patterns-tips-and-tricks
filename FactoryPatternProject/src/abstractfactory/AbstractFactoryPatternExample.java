
package abstractfactory;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();
        victorianChair.sitOn();
        victorianTable.placeItemsOn();

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        modernChair.sitOn();
        modernTable.placeItemsOn();
    }
}
