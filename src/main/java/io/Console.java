package io;

import Models.Sneakers;
import Models.Whiskey;
import Services.SneakersService;
import Services.WhiskeyService;

import java.util.Scanner;

public class Console {
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***                 Welcome                    ***\n" +
                "***                    to                      ***\n" +
                "***               Diksha's Inventory           ***\n" +
                "**************************************************\n");
    }
    public static void displayMainMenu(){
        System.out.println("Main Menu\n Choose between 1-8 \n"+"1. Create products to be added to inventory\n" +
                "2. Read from existing products\n" +
                "3. Update products\n" +
                "4. Delete products\n" +
                "5. Get different reports about products\n" +
                "6. Save Data\n"+
                "7. Load Data\n"+
                "8. Exit the program");

    }
    public static String getActionFromUser() {
        while (true) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    return "Create";
                case 2:
                    return "Read";
                case 3:
                    return "Update";
                case 4:
                    return "Delete";
                case 5:
                    return "Reports";
                case 6:
                    return "Save";
                case 7:
                    return "Load";
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Try Again\n");
                    displayMainMenu();
                    break;

            }
        }
    }


    public static void createSneaker(SneakersService ss){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter brand:");
        String brand = sc.nextLine();
        System.out.println("Enter sport:");
        String sport = sc.nextLine();
        System.out.println("Enter size:");
        float size = sc.nextFloat();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        System.out.println("Enter price:");
        float price = sc.nextFloat();
        ss.create(name, brand, sport, size, quantity, price);

    }
    public static void updateSneaker(Sneakers s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        if(name!=null){
            s.setName(name);
        }
        System.out.println("Enter brand:");
        String brand = sc.nextLine();
        if(brand!=null){
            s.setBrand(brand);
        }
        System.out.println("Enter sport:");
        String sport = sc.nextLine();
        if(sport!=null){
            s.setSport(sport);
        }
        System.out.println("Enter size:");
        float size = sc.nextFloat();
        s.setSize(size);
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        s.setQuantity(quantity);
        System.out.println("Enter price:");
        float price = sc.nextFloat();
        s.setPrice(price);


    }


    public static void createWhiskey(WhiskeyService ws){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand:");
        String brand = sc.nextLine();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        System.out.println("Enter price:");
        float price = sc.nextFloat();
        ws.create(brand, quantity, price);

    }
    public static void createProduct(SneakersService ss, WhiskeyService ws){
        while (true) {
            System.out.println("Choose product you want to add by writing 1 or 2 \n"+
                    "1. Sneakers\n2. Whiskey");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    createSneaker(ss);
                    return;
                case 2:
                    createWhiskey(ws);
                    return;
                default:
                    System.out.println("Try Again\n");
                    displayMainMenu();
                    break;

            }
        }
    }


    public static void readProduct(SneakersService ss, WhiskeyService ws) {
        while (true) {
            System.out.println("Choose product you want to read by writing 1 or 2 \n"+
                    "1. Sneakers\n2. Whiskey");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    readSneaker(ss);
                    return;
                case 2:
                    readWhiskey(ws);
                    return;
                default:
                    System.out.println("Try Again\n");
                    displayMainMenu();
                    break;

            }
        }
    }

    private static void readWhiskey(WhiskeyService ws) {
        System.out.println();
        for (Whiskey whiskey : ws.getWhiskyInventory()) {
            System.out.println(whiskey);
        }
        System.out.println();
    }

    private static void readSneaker(SneakersService ss) {
        for (Sneakers sneakers : ss.getInventory()) {
            System.out.println(sneakers.toString());
        }
        System.out.println();
    }
    public static void updateProduct(SneakersService ss, WhiskeyService ws) {
        while (true) {
            System.out.println("Choose product you want to update by writing 1 or 2 \n"+
                    "1. Sneakers\n2. Whiskey");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    readSneaker(ss);
                    System.out.println("Choose id you want to update");
                    int productId = sc.nextInt();
                    Sneakers sneaker = ss.findSneaker(productId);
                    updateSneaker(sneaker);
                    return;
                case 2:
                    readWhiskey(ws);
                    System.out.println("Choose id you want to update");
                    int productId1 = sc.nextInt();
                    Whiskey whiskey = ws.findWhiskey(productId1);
                    updateWhiskey(whiskey);
                    return;
                default:
                    System.out.println("Try Again\n");
                    displayMainMenu();
                    break;

            }
        }
    }

    private static void updateWhiskey(Whiskey w) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand:");
        String brand = sc.nextLine();
        if(brand!=null){
            w.setBrand(brand);
        }
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        w.setQuantity(quantity);

        System.out.println("Enter price:");
        float price = sc.nextFloat();
        w.setPrice(price);

    }

    public static void deleteProduct(SneakersService ss, WhiskeyService ws) {
        while (true) {
            System.out.println("Choose product you want to delete by writing 1 or 2 \n"+
                    "1. Sneakers\n2. Whiskey");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    readSneaker(ss);
                    System.out.println("Choose id you want to delete");
                    int productId = sc.nextInt();
                    System.out.println("Item Deleted: "+ss.delete(productId));
                    return;
                case 2:
                    readWhiskey(ws);
                    System.out.println("Choose id you want to delete");
                    int productId1 = sc.nextInt();
                    System.out.println("Item Deleted: "+ws.delete(productId1));
                    return;
                default:
                    System.out.println("Try Again\n");
                    displayMainMenu();
                    break;

            }
        }

    }

    public static void getTotalInventory(SneakersService ss, WhiskeyService ws) {
        while (true) {
            System.out.println("Choose product you want to get total inventory by writing 1 or 2 \n"+
                    "1. Sneakers\n2. Whiskey");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    int totalInventory = 0;
                    for(Sneakers s : ss.getInventory()){
                        totalInventory += s.getQuantity();
                    }
                    System.out.println("Total sneakers in inventory is: "+totalInventory);

                    return;
                case 2:
                    int totalInventoryWhiskey = 0;
                    for(Whiskey w : ws.getWhiskyInventory()){
                        totalInventoryWhiskey += w.getQuantity();
                    }
                    System.out.println("Total whiskey in inventory is: "+ totalInventoryWhiskey);
                    return;
                default:
                    System.out.println("Try Again\n");
                    displayMainMenu();
                    break;

            }
        }
    }
}
