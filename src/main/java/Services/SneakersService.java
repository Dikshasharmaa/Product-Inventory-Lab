package Services;

import Models.Sneakers;

import java.util.ArrayList;
import java.util.List;

public class SneakersService {

    private static int nextId = 1;  // (1)

    private List<Sneakers> inventory = new ArrayList<>();

    public List<Sneakers> getInventory() {
        return inventory;
    }
    public void add(Sneakers sneakers){
        inventory.add(sneakers);
    }
}
