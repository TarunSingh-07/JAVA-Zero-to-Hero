package com.company;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("My name is Tarun & my marks are :");
        Scanner marks = new Scanner(System.in);

        System.out.print("Math mark is :");
        int math = marks.nextInt();
        System.out.print("english mark is :");
        int english = marks.nextInt();
        System.out.print("science mark is :");
        int science = marks.nextInt();
        System.out.print("computer mark is :");
        int computer = marks.nextInt();
        System.out.print("history mark is :");
        int history = marks.nextInt();

        int total = math + english + science + computer + history;
        System.out.println("Total mark is :");
        System.out.println(total);
        double percentage = (double) ((total) * 100) /500;
        System.out.println("Total percentage is :");
        System.out.println(percentage);
    }
}