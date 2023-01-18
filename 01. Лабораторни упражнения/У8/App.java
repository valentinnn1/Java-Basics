package lab_exercises.lab_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<GetProductsTo> products = new ArrayList<>();
        products.add(new Product1("test1P1", 4.99, 201, 12));
        products.add(new Product2("test1P2", 5.99, 202, 11));
        products.add(new Product1("test2P1", 6.99, 203, 11));

        ArrayList<DeliveryAPI> deliveryAPIS = new ArrayList<>();
        deliveryAPIS.add(new Product2("test1P2", 12.2, 122, 1));
        deliveryAPIS.add(new Product2("test2P2", 54.1, 862, 23));
        deliveryAPIS.add(new Product1("test1P1", 2.5, 122, 454));

        PresentStore presentStore = new PresentStore(products, deliveryAPIS);

        presentStore.allProductsCheaperThan(6).forEach(System.out::println);
        System.out.println();
        presentStore.getProviderProducts(122).forEach(System.out::println);
    }
}
