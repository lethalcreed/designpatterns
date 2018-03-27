package nl.yourivanleeuwen.storagestore;

abstract class ProductDecorator extends Product implements ProductInterface {
    protected Product tempProduct;

    public ProductDecorator(Product newProduct){
        tempProduct = newProduct;
    }

    public String getProductName(){
       return tempProduct.getProductName();
    }

    public double getProductPrice(){
        return tempProduct.getProductPrice();
    }
}
