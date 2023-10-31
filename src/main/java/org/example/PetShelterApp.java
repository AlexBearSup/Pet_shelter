package org.example;
import org.example.model.Animal;
import org.example.service.Serialize;
import java.util.*;

public class PetShelterApp {

    public static void main(String[] args) {
        Serialize upAndDownInfo = new Serialize();
        List<Animal> animals = upAndDownInfo.deserializeAnimals();

        boolean exit = false;
        System.out.println("Hello, you are in the animal shelter management app");
        SelectAction selectAction = new SelectAction(animals);
        while (!exit){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select what do you want do ?");
            System.out.println("1. Add animal;  2. Show all animal; ");
            System.out.println("3. Remove animal; 4. Exit from app; ");
            System.out.println("--------------------------------------");
            int userChoice = 0;
            boolean correctInput = false;
            while (!correctInput) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter the number of your select");
                    scanner.nextLine();
                }
                userChoice = scanner.nextInt();
                scanner.nextLine();
                if (userChoice > 4 || userChoice < 1) {
                    System.out.println("Number must be from 1 to 4, try again");
                } else {
                    correctInput = true;
                }
            }
            switch (userChoice) {
                case 1:
                    selectAction.actionAdd();
                    break;
                case 2:
                    selectAction.showAllAnimals();
                    break;
                case 3:
                    selectAction.removeAnimal();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("it`s impossible");
            }
        }
        upAndDownInfo.serializeAnimals(selectAction.animals);
        System.out.println("List of animals in shelter saved successfully.");
        System.out.println("You are done with the application, goodbye");
    }
}