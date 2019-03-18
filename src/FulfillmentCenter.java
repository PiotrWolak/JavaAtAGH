import java.util.ArrayList;
import java.util.List;

public class FulfillmentCenter {
public String name = "magazynek";
List<Item> myList = new ArrayList<Item>(100);
// max waga w kilogramach
double capacity;

    public FulfillmentCenter(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    boolean addProduct(Item newItem){
        for(Item item : myList){
            if(item.compare(newItem)){
            item.quantity
                return true;
            }
        }
        return false;
    }
}
