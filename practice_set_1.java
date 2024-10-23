package com.company;

import java.util.Scanner;

public class practice_set_1 {
    public static void main(String[] args){
//        Question 1
        int a = 10;
        int b = 30;
        int c = 21;
        int sum = a+b+c;
        System.out.println(sum);

//        Question 2
        float subject_1 = 65;
        float subject_2 = 55;
        float subject_3 = 67;
        float subject_4 = 88;
        float cgpa = (subject_1+subject_2+subject_3+subject_4)/40;
        System.out.println(cgpa);

//        Question 3

        System.out.println("What is your name ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day.");

//        Question 4
        System.out.println("Enter the KM");
        Scanner km = new Scanner(System.in);
        double kilometer = km.nextInt();
        double miles = kilometer/1.609;
        System.out.println("The "+ kilometer+ "km is equal to "+miles+" miles");


//        Question 5
        System.out.println("Enter your number");
        Scanner tr = new Scanner(System.in);
        System.out.println(tr.hasNextInt());

    }

}
