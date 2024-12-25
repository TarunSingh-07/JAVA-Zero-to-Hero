package com.company;
class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a Derived class Constructor");
    }
}
public class constructor_Inheritance_46 {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
    }
}
