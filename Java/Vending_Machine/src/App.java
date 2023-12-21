import java.util.ArrayList;
import java.util.List;

import domen.Bottle;
import domen.HotDrink;
import domen.Product;
import service.CoinDispenser;
import service.Holder;
import service.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> product = new ArrayList<>();
        Product product0 = new Product("Lays", 100, 0);
        Product product1 = new Product("Coca-cola", 50, 1);
        Product product2 = new Product("Chocolate", 80, 2);
        Product product3 = new Bottle("Aqua", 40, 3, 0.5);
        Product product4 = new HotDrink("Tea", 35,4,38);
        product.add(product0);
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        Holder holder1 = new Holder();
        CoinDispenser dispenser1 = new CoinDispenser();
        VendingMachine machine = new VendingMachine(holder1, dispenser1, product);
        for (Product prod : machine.getProduct()) {
            System.out.println(prod);
        }

    }
}
