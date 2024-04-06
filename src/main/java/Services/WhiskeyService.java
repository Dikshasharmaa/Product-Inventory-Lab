package Services;
import Models.Sneakers;
import Models.Whiskey;

import java.util.ArrayList;
import java.util.List;

public class WhiskeyService {
    private static int nextId = 1;
    private List<Whiskey> WhiskyInventory = new ArrayList<>();

    public Whiskey create(String brand, int quantity, float price) {
        Whiskey createdWhiskey = new Whiskey(nextId++, brand, quantity, price);
        WhiskyInventory.add(createdWhiskey);
        return createdWhiskey;
    }

    public List<Whiskey> getWhiskyInventory() {
        return WhiskyInventory;
    }

    public Whiskey findWhiskey(int id){
        for(Whiskey w : WhiskyInventory){
            if(w.getId() == id){
                return w;
            }
        }
        return null;
    }
    public Whiskey[] findAll() {
        // should return a basic array copy of the ArrayList
        Whiskey[] array = new Whiskey[WhiskyInventory.size()];
        return WhiskyInventory.toArray(array);
    }
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise, return false
        for (Whiskey w : WhiskyInventory) {
            if (w.getId() == id) {
                WhiskyInventory.remove(id);
                return true;
            }
        }
        return false;
    }
}
