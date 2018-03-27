package nl.yourivanleeuwen.storagestore;

public class HardDrive extends Product {

    private int storageSize;

    public HardDrive() {
        super();

        setProductId(1);
        setProductName("Seagate Guardian BarraCuda");
        setProductType("Hard Disk Drive");
        storageSize = 4000;
        setProductPrice(99.00);
    }

    public int getStorageSize() {
        return storageSize;
    }

    @Override
    public void displayProductInfo() {
        System.out.println(getProductId() + ": " + getProductName() + " is a " + getProductType() + ", contains " + getStorageSize() + " GB of storage and costs €" + getProductPrice());
    }

}