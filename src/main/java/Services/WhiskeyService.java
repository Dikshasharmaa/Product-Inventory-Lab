package Services;
import Models.Sneakers;
import Models.Whiskey;
import Utils.CSVUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
        for (int i =0;i<WhiskyInventory.size();i++) {
            if (WhiskyInventory.get(i).getId() == id) {
                WhiskyInventory.remove(i);
                return true;
            }
        }
        return false;
    }
    public void saveData() throws IOException {
        String csvFile = "/Users/diksha/Desktop/projects-2/Product-Inventory-Lab/Whiskey.csv";
        FileWriter writer = new FileWriter(csvFile);

        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));

        for (Whiskey w : WhiskyInventory) {
            List<String> list = new ArrayList<>();
            list.add(String.valueOf(w.getId()));
            list.add(w.getBrand());
            list.add(String.valueOf(w.getQuantity()));
            list.add(String.valueOf(w.getPrice()));

            CSVUtils.writeLine(writer, list);
        }

        writer.flush();
        writer.close();
    }

    public void loadData(){
        String csvFile = "/Users/diksha/Desktop/projects-2/Product-Inventory-Lab/Whiskey.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] beer = line.split(csvSplitBy);

                int id = Integer.parseInt(beer[0]);
                String brand = beer[1];
                int quantity = Integer.parseInt(beer[2]);
                float price = Float.parseFloat(beer[3]);

                WhiskyInventory.add(new Whiskey(id, brand, quantity, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
