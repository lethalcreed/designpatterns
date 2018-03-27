package nl.yourivanleeuwen.storagestore;

public class SataCable extends ProductDecorator {

    public SataCable(Product newProduct){
       super(newProduct);
    }

    public String getProductName(){
        return tempProduct.getProductName() + " + SataCable ";
    }

    public double getProductPrice(){
        return tempProduct.getProductPrice() + 1.99;
    }
}
