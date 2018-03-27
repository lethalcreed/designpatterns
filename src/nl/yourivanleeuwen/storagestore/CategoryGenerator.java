package nl.yourivanleeuwen.storagestore;

public class CategoryGenerator {
    public CategoryGenerator() {

        //Creating the categories
        ProductComponent internalDrives = new ProductGroup("Internal Drives");

        ProductComponent portableDrives = new ProductGroup("Portable Drives");

        ProductComponent allCategories = new ProductGroup("");

        //Adding products to categories
        allCategories.add(internalDrives);
        internalDrives.add(new HardDrive());
        internalDrives.add(new SSD());

        allCategories.add(portableDrives);
        portableDrives.add(new USB());

        Categories mainCategoryList = new Categories(allCategories);

        mainCategoryList.getProductList();
    }
}
