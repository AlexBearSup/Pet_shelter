package org.example;

import org.example.model.Animal;
import java.util.List;
import java.util.Scanner;

public class SelectAction {
    private Scanner scanner = new Scanner(System.in);
    List<Animal> animals;
    public SelectAction(List<Animal> animals) {
        this.animals = animals;
    }

    public void actionAdd() {
        System.out.println("You want add animal to the shelter list ");
        System.out.println("Please enter the name of animal");
        String enteredName = scanner.nextLine();
        System.out.println("Please enter the breed of animal");
        String enteredBreed = scanner.nextLine();
        System.out.println("Please enter the age of Animal");
        while (!scanner.hasNextInt()){
            System.out.println("please enter age as a number, try again");
            scanner.nextLine();
        }
        int enteredAge = scanner.nextInt();
        scanner.nextLine();
        Animal animal = new Animal(enteredName,enteredBreed,enteredAge);
        animals.add(animal);
        System.out.println(animal.getName()+ " enter to the shelter");
        System.out.println();
    }
    public void showAllAnimals(){
        int count = 1;
        if(!animals.isEmpty()){
            System.out.println("List of animals in the shelter:");
            for (Animal animal : animals) {
                System.out.println(count + "." + " " + "Name: - " + animal.getName() + ". "
                        + "Breed: - " + animal.getBreed() + ". "
                        + "Age: - " + animal.getAge() +".");
                count++;
            }
        }else {
            System.out.println("The list of shelter is empty");
        }
        System.out.println();
    }

    public void removeAnimal(){
        System.out.println("Select number of animal for remove");
        showAllAnimals();
        System.out.println("------------------------------");
        if (!animals.isEmpty()){
            int choiceForRemove = scanner.nextInt();
            scanner.nextLine();
            if (choiceForRemove >=1 && choiceForRemove < animals.size()){
                System.out.println("animal for remove is " + animals.get(choiceForRemove-1));
                animals.remove(choiceForRemove-1);
            } else {
                System.out.println("wrong number");
            }
        } else {
            System.out.println("the list of shelter is empty");
            System.out.println();
        }
    }
}
