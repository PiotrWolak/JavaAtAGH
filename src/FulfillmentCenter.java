import java.util.ArrayList;
import java.util.List;

public class FulfillmentCenter {
    public String name = "magazynek";
    List<Item> myList = new ArrayList<Item>(100);
    // max waga w kilogramach
    double capacity;
    double presentCapacity;

    public FulfillmentCenter(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    boolean addProduct(Item newItem) {
        if (myList.isEmpty()) {
            myList.add(newItem);
            return true;
        }
        //if (this.capacity < this.presentCapacity + (newItem.getMass() * newItem.getQuantity())) {
            for (Item item : myList) {
                if (item.compare(newItem)) {
                    item.setQuantity(item.getQuantity() + newItem.getQuantity());
                    return true;
                }
            }
            myList.add(newItem);
            return true;
        //}

    }

    boolean getProduct(Item item) {
        for (Item thing : myList) {
            if (thing.compare(item)) {
                item.setQuantity(thing.getQuantity() - 1);
                return true;
            }
        }
        return false;
    }
    boolean remove(Item item) {
        for (Item thing : myList) {
            if (thing.compare(item)) {
               myList.remove(thing);
                return true;
            }
        }
        return false;
    }
    //void searchPartial
    //countByCondition
    //search
    //sortByName
    //sortByAmount
    //max
    void summary() {
        if(myList.isEmpty()) System.out.println("lista pusta");
        int i=0;
        for (Item item : myList) {
            System.out.println("nazwa: " + item.getName() + "\nindex: " + i + "\nquantity :" + item.getQuantity());
            System.out.println("~~~~~~~~~~~~~~");
            i++;
        }
    }
}
