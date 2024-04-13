package Services;

import Models.Sneakers;
import Utils.CSVUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
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
        for (int i =0;i<inventory.size();i++) {
            if (inventory.get(i).getId().equals(id)) {
                inventory.remove(i);
                return true;
            }
        }
        return false;
    }
    public void saveData() throws IOException {
        //String jsonFile = "/Users/diksha/Desktop/projects-2/Product-Inventory-Lab/Sneakers.json";
        //FileWriter writer = new FileWriter(csvFile);
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File("/Users/diksha/Desktop/projects-2/Product-Inventory-Lab/Sneakers.json"), inventory);
        try {
            FileWriter myWriter = new FileWriter("Sneakers.txt");
            myWriter.write("nextId : "+ this.nextId);
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


//        CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));
//
//        for (Sneakers s : inventory) {
//            List<String> list = new ArrayList<>();
//            list.add(String.valueOf(s.getId()));
//            list.add(s.getName());
//            list.add(s.getBrand());
//            list.add(s.getSport());
//            list.add(String.valueOf(s.getSize()));
//            list.add(String.valueOf(s.getQuantity()));
//            list.add(String.valueOf(s.getPrice()));
//
//            CSVUtils.writeLine(writer, list);
//        }
//
//        writer.flush();
//        writer.close();
    }
    public void loadData() throws IOException {
        String jsonFile = "/Users/diksha/Desktop/projects-2/Product-Inventory-Lab/Sneakers.json";
        ObjectMapper objectMapper = new ObjectMapper();
        this.inventory = objectMapper.readValue(new File(jsonFile), new TypeReference<List<Sneakers>>(){});
        this.nextId = inventory.size()+1;
//        String line = "";
//        String csvSplitBy = ",";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            nextId = Integer.parseInt(br.readLine());
//
//            while ((line = br.readLine()) != null) {
//                // split line with comma
//                String[] beer = line.split(csvSplitBy);
//
//                int id = Integer.parseInt(beer[0]);
//                String name = beer[1];
//                String brand = beer[2];
//                String sport = beer[3];
//                float size = Float.parseFloat(beer[4]);
//                int quantity = Integer.parseInt(beer[5]);
//                float price = Float.parseFloat(beer[6]);
//
//                inventory.add(new Sneakers(id, name, brand, sport, size, quantity, price));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }


}
