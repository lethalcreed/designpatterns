package nl.yourivanleeuwen.storagestore;

public abstract class ProductComponent {

    public void add(ProductComponent newProductComponent) {
        throw new UnsupportedOperationException();
    }

    public ProductComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public int getProductId(){
        throw new UnsupportedOperationException();
    }

    public String getProductName() {
        throw new UnsupportedOperationException();
    }

    public double getProductPrice() {
        throw new UnsupportedOperationException();
    }

    public String getProductType() {
        throw new UnsupportedOperationException();
    }

    public void displayProductInfo(){
        throw new UnsupportedOperationException();
    }
}
