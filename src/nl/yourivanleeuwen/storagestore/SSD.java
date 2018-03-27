package nl.yourivanleeuwen.storagestore;

public class SSD extends Product {

    private int storageSize;

    public SSD() {
        super();

        setProductId(2);
        setProductName("Samsung 860 EVO");
        setProductType("Solid State Drive");
        storageSize = 250;
        setProductPrice(94.90);
    }

    public int getStorageSize() {
        return storageSize;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(getProductId() + ": " + getProductName() + " is a " + getProductType() + ", contains " + getStorageSize() + " GB of storage and costs €" + getProductPrice());
    }

}