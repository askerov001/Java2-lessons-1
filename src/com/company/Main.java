package com.company;

public class Main {

    public static void main(String[] args) {


    Dog dog = new Dog();
    dog.setName("Jack");
    dog.setBreed("Alabai");
    dog.setColor(Color.BROWN);
    Shelter shelter = new Shelter("Shelter 1", "Ibraimova 20");
    dog.setShelter(shelter);
    dog.setCommands(new String[] {"run", "sit", "make voice", });
        System.out.println(dog.getInfo());

        Dog dog1 = new Dog();
        dog1.setBreed("Ovcharka");
        dog1.setName("new name");
        dog.copy(dog1);
        System.out.println(dog.getInfo());
    }
}
