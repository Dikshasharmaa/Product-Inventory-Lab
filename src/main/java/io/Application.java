package io;

import Services.SneakersService;
import Services.WhiskeyService;

import java.util.Scanner;

public class Application {
    private SneakersService sneakerService = new SneakersService();
    private WhiskeyService whiskeyService = new WhiskeyService();
    public static void main(String args[]){
        Application application = new Application();
        application.init();
    }

    private void init() {
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
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }

    }


    }

