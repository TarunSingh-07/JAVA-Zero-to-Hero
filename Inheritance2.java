package com.company;

class Animal{
    public int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void breed(){
        System.out.println("PitBull");
    }
}
class Dog extends Animal{
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setLegs(4);
        System.out.println("Dog have " + a.getLegs() + " legs");
        a.breed();

        Dog d = new Dog();
        d.setColor("Brown");
        System.out.println("The Dog is " + d.getColor() + " color");
        d.setLegs(6);
        System.out.println("Dog have " + d.getLegs() + " legs");
        d.breed();
    }
}
