package lectures.lec6.orders;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("df32", "client1@mail.com", "clientAddress1");
        order.setProducts(new Product("shirt", 44.79), 2);
        order.setProducts(new Product("toothpaste", 6.99), 1);
        order.setProducts(new Product("toothbrush", 1.19), 3);

        try {
            order.printReceipt();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
