package com.company;

import java.util.Arrays;

public class Dog  extends Pet{
    private String name;
    private String  breed;
    private String[] commands;

    public Dog (){

    }
    public Dog(String name, String breed, Color color, Shelter shelter) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;


    }
    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }


    public void makeVoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
    public void makeVoice( int number,String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(String voice) {
            System.out.println(voice);
    }
    public String getInfo(){
        return super.getInfo()+"\nName = "+name+"\nBread = "+breed+"\nCommands = "+ Arrays.toString(commands)+
                "\n____________________________";
    }

    public void copy(Dog dog){
        this.breed = dog.getBreed();
        this.name = dog.getName();
    }
}
