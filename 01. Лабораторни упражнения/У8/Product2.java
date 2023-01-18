package lab_exercises.lab_8;

public class Product2 implements GetProductsTo, DeliveryAPI {
    private String type;
    private double price;
    private int idOfProduct;
    private int number;

    public Product2(String type, double price, int idOfProduct, int number) {
        this.type = type;
        this.price = price;
        this.idOfProduct = idOfProduct;
        this.number = number;
    }

    @Override
    public int getNumber(int idOfProvider) {
        if (idOfProvider == this.idOfProduct){
            return this.number;
        }
        return 0;
    }

    @Override
    public String getType(int idOfProvider) {
        if (idOfProvider == this.idOfProduct){
            return this.type;
        }
        return null;
    }

    @Override
    public int getIdOfProvider() {
        return this.idOfProduct;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getType() {
        return this.type;
    }
}