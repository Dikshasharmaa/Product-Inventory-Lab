package Services;
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
}
