package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle1 {
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
    public double volume(){
        return ((double) 4 /3) * Math.PI * radius * radius * radius;
    }
}
public class practice_set_9 {
    public static void main(String[] args) {
    /*
        // Problem 1
    Cylinder myCylinder = new Cylinder();
    myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
    myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // Problem 2
        System.out.println("SurfaceArea of cylinder is : " + myCylinder.surfaceArea());
        System.out.println("Volume of cylinder is : " + myCylinder.volume());
     */

        // Problem 3
//        Cylinder myCylinder = new Cylinder(9, 12);
//        System.out.println(myCylinder.getHeight());
//        System.out.println(myCylinder.getRadius());

        // Problem 4
//        Rectangle1 r = new Rectangle1();
//        Rectangle1 r = new Rectangle1(12,56);
//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());

        // Problem 5
        Sphere s = new Sphere();
        s.setRadius(5);
        System.out.println(s.getRadius());
        System.out.println("SurfaceArea of Sphere is : " + s.surfaceArea());
        System.out.println("Volume of Sphere is : " + s.volume());
    }
}
