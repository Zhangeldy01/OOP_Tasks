import Products.Product;
import Products.BottleOfWater;
import Products.HotDrink;
import VendingMachines.VendingMachine;
public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снек", 20.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachine.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        itemMachine.addProduct(new HotDrink("Tea", 80.0, 96, 0.2));
        itemMachine.addProduct(new HotDrink("Coffee", 90.0, 92, 0.2));
        itemMachine.addProduct(new HotDrink("Hot chocolate", 110.0, 80, 0.2));

        for(Product prod: itemMachine.getProdAll())
        {
            System.out.println(prod.toString());
        }
        new MainFrameVM(itemMachine);

        System.out.println(itemMachine.getProdByName("Milk"));
    }
}
