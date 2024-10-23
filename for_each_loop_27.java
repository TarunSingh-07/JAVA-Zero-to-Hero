package com.company;

public class for_each_loop_27 {
    public static void main(String[] args) {
//        String [] students = {"Tarun", "roshan", "aman", "bunu", "bunty"};
//        System.out.println(students[2]);
//        System.out.println(students.length);

        int [] marks = {98, 45, 79, 99, 80};
        System.out.println(marks.length);

//        Displaying the Array (Naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

//        Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length - 1; i >=0 ; i--) {
            System.out.println(marks[i]);
        }

//        Displaying the Array (for each loop)
        System.out.println("Printing using for-each loop");
        for (int element: marks){
            System.out.println(element);
        }

    }
}
