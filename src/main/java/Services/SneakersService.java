package Services;

import Models.Sneakers;

import java.util.ArrayList;
import java.util.List;

public class SneakersService {

    private static int nextId = 1;

    private List<Sneakers> inventory = new ArrayList<>();

    public Sneakers create(String name, String brand, String sport,
                                  float size, int quantity, float price) {

        Sneakers createdSneaker = new Sneakers(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    public List<Sneakers> getInventory() {
        return inventory;
    }
    public Sneakers findSneaker(int id){
        for(Sneakers s : inventory){
            if(s.getId().equals(id)){
               return s;
            }
        }
        return null;
    }
    public Sneakers[] findAll() {
        // should return a basic array copy of the ArrayList
        Sneakers[] array = new Sneakers[inventory.size()];
        return inventory.toArray(array);
    }
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise, return false
        for (Sneakers s : inventory) {
            if (s.getId().equals(id)) {
                inventory.remove(id);
                return true;
            }
        }
        return false;
    }

}
