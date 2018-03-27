package nl.yourivanleeuwen.storagestore;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductGroup extends ProductComponent {

    ArrayList productComponents = new ArrayList();

    private String groupName;

    public ProductGroup(String newGroupName){
        groupName = newGroupName;
    }

    public String getGroupName(){
        return groupName;
    }

    public void add(ProductComponent newProductComponent){
        productComponents.add(newProductComponent);
    }

    public ProductComponent getComponent(int componentIndex){
        return (ProductComponent) productComponents.get(componentIndex);
    }

    public void displayProductInfo(){
        System.out.println(getGroupName());

        Iterator productIterator = productComponents.iterator();

        while(productIterator.hasNext()){
            ProductComponent productInfo = (ProductComponent) productIterator.next();

            productInfo.displayProductInfo();
        }
    }
}
