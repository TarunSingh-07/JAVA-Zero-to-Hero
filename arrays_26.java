package com.company;

public class arrays_26 {
    public static void main(String[] args) {
  /*    Classroom of 500 students - You have to store marks of these 500 students
        you have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
//        There are 3 main ways to create an array in java
//        1. Declaration and memory allocation
//        int [] marks = new int[5];

//        2. Declaration and then memory allocation
//        int [] marks;
//        marks = new int[5];
//        Initialization
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 85;
//        marks[3] = 64;
//        marks[4] = 98;
//        marks[5] = 100; - throws an error
//        System.out.println(marks[4]);

//        3. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 69, 28, 79};
        System.out.println(marks[4]);

    }
}
