package nl.yourivanleeuwen.storagestore;

public class USB extends Product {

    private int storageSize;

    public USB() {
        super();

        setProductId(3);
        setProductName("ScanDisk Ultra");
        setProductType("USB Drive");
        storageSize = 32;
        setProductPrice(18.99);
    }

    public int getStorageSize() {
        return storageSize;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(getProductId() + ": " + getProductName() + " is a " + getProductType() + ", contains " + getStorageSize() + " GB of storage and costs €" + getProductPrice());
    }

}