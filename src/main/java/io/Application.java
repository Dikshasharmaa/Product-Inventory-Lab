package io;

import Services.SneakersService;
import Services.WhiskeyService;

public class Application {
    private SneakersService sneakerService = new SneakersService();
    private WhiskeyService whiskeyService = new WhiskeyService();
    public static void main(String args[]){
        Application application = new Application();
        application.init();
    }

    private void init() {
        Console.printWelcome();
        Console.displayMainMenu();
    }

}
