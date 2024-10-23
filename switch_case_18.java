package com.company;
import java.util.Scanner;

public class switch_case_18 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 68:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my code !!");

//    Enhanced switch
        char alpha = 'r';

        switch (alpha) {
            case 'a' -> System.out.println("you are a");
            case 'r' -> System.out.println("your r");
            case 'c' -> System.out.println("Your chutiya");
            default -> System.out.println("you are hoomaaannnn");
        }
        /*
        if(age>56){
            System.out.println("You are experienced!");
        } else if (age>46) {
            System.out.println("You are semi experienced!");
        } else if (age>36) {
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }*/


    }
}
