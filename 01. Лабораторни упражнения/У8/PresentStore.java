package lab_exercises.lab_8;

import java.util.ArrayList;

public class PresentStore {
    ArrayList<GetProductsTo> products;
    ArrayList<DeliveryAPI> devAPI;

    public PresentStore(ArrayList<GetProductsTo> products, ArrayList<DeliveryAPI> deliveryAPIS) {
        this.products = products;
        this.devAPI = deliveryAPIS;
    }

    public ArrayList<GetProductsTo> allProductsCheaperThan(double maxPrice){
        ArrayList<GetProductsTo> result = new ArrayList<>();
        for (GetProductsTo product : products) {
            if(product.getPrice() < maxPrice){
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<DeliveryAPI> getProviderProducts(int providerId){
        ArrayList<DeliveryAPI> result = new ArrayList<>();
        for (DeliveryAPI deliveryAPI : devAPI) {
            if (deliveryAPI.getIdOfProvider() == providerId){
                result.add(deliveryAPI);
            }
        }
        return result;
    }
}
