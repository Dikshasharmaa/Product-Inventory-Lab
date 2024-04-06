package io;

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
        System.out.println("Main Menu\n Choose between 1-6 \n"+"1. Create products to be added to inventory\n" +
                "2. Read from existing products\n" +
                "3. Update products\n" +
                "4. Delete products\n" +
                "5. Get different reports about products\n" +
                "6. Exit the program");

    }


}
