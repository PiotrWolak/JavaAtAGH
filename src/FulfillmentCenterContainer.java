import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FulfillmentCenterContainer {
    Map<String,FulfillmentCenter> mapka = new HashMap<String, FulfillmentCenter>();

    boolean addProduct(String name, double masa) {

            mapka.put(name, new FulfillmentCenter(name, masa));
            return true;
        }
    boolean removeCenter(String name){
       mapka.remove(name);
       return true;
    }

//    ArrayList<FulfillmentCenter> findEmpty(){
//        ArrayList lista = new ArrayList();
//        if(mapka.isEmpty()) return null;
//        for (int i=0; i<mapka.size(); i++){
//            if (mapka)lista.add(f);
//        }
//        return lista;
//    }
//

    }

