package lectures.lec6.orders;

import constants.Constants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Order {
    private static final String FOLDER_PATH = Constants.SRC_DIR + "\\lectures\\lec6\\orders\\receipts\\";

    private final String orderID;
    private HashMap<Product, Integer> products;
    private double totalPrice;
    private String clientMail;
    private String shippingAddress;

    public Order(String orderID, String clientMail, String shippingAddress) {
        this.orderID = orderID;
        this.products = new HashMap<>();
        this.clientMail = clientMail;
        this.shippingAddress = shippingAddress;
    }

    private double calculatePrice() {
        double res = 0;
        for (Product product: this.products.keySet()) {
            res += this.products.get(product) * product.getPrice();
        }
        return res;
    }

    public Order(String orderID){
        this.orderID = orderID;
    }

    public void printReceipt() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(String.format("%s%s", FOLDER_PATH, this.orderID)));
        this.totalPrice = calculatePrice();
        for (Product product : products.keySet()) {
            writer.write(String.format("%s -> count %d\n", product, this.products.get(product)));
        }
        writer.write("\n");
        writer.write("Client: " + this.clientMail + "\n");
        writer.write(String.format("Total price: %.2f$ \n", this.totalPrice));
        writer.close();
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Product product, Integer count) {
        this.products.put(product, count);
    }

    public String getClientMail() {
        return clientMail;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderID() {
        return orderID;
    }
}
