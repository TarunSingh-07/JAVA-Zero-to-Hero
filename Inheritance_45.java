package com.company;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am not a Constructor");
    }

}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance_45 {
    public static void main(String[] args) {
        // Creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of Derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
        d.setY(66);
        System.out.println(d.getY());
    }
}
