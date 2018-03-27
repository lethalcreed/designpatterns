package nl.yourivanleeuwen.storagestore;

public class Categories {
    ProductComponent productList;

    public Categories(ProductComponent newProductList){
        productList = newProductList;
    }

    public void getProductList(){
        productList.displayProductInfo();
    }
}
