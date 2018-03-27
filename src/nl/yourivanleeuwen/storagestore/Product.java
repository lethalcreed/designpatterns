package nl.yourivanleeuwen.storagestore;

public abstract class Product extends ProductComponent implements ProductInterface{
    private int id;
    private String name;
    private double price;
    private String deviceType;

    protected void setProductId(int newId) {
        id = newId;
    }

    public int getProductId() {
        return id;
    }

    protected void setProductName(String newName) {
        name = newName;
    }

    public String getProductName() {
        return name;
    }


    protected void setProductPrice(Double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        } else {
            System.out.println("Price must be highter than 0");
        }
    }

    public double getProductPrice() {
        return price;
    }


    protected void setProductType(String newDeviceType) {
        deviceType = newDeviceType;
    }

    public String getProductType() {
        return deviceType;
    }

    public void displayProductInfo() {
        System.out.println(getProductId() + ": " + getProductName() + " is a " + getProductType() + " and costs " + getProductPrice());
    }
}