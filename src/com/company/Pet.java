package com.company;

public class Pet {
    private int age = genereteDefault();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int genereteDefault(){
//     return new Random().nextInt(15)+1;
        return (int) (Math.random()*10+4);
    }
    public String getInfo() {
        return "Age =" + age + "\nColor = " + color + "\nShelter =" + shelter.getName() + ", " + shelter.getAdress();
    }
}
