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
}
