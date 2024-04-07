package io;

import Services.SneakersService;
import Services.WhiskeyService;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    private SneakersService sneakerService = new SneakersService();
    private WhiskeyService whiskeyService = new WhiskeyService();
    public static void main(String args[]){
        Application application = new Application();
        try {
            application.init();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void init() throws IOException {
        Console.printWelcome();
        while(true){
            Console.displayMainMenu();
            String action = Console.getActionFromUser();
            switch (action){
                case "Create":
                    Console.createProduct(sneakerService, whiskeyService);
                    break;
                case "Read":
                    Console.readProduct(sneakerService, whiskeyService);
                    break;
                case "Update":
                    Console.updateProduct(sneakerService, whiskeyService);
                    break;
                case "Delete":
                    Console.deleteProduct(sneakerService, whiskeyService);
                    break;
                case "Reports" :
                    Console.getTotalInventory(sneakerService,whiskeyService);
                    break;
                case "Save" :
                    whiskeyService.saveData();
                    sneakerService.saveData();
                    break;
                case "Load" :
                    sneakerService.loadData();
                    whiskeyService.loadData();
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }

    }


    }

