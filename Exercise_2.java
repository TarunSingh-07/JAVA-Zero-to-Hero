package com.company;
import java.util.Scanner;
import java.util.Random;

public class Exercise_2 {
    public static void main(String[] args) {
//        User giving the input
//        rock = 0;
//        paper = 1;
//        scissor = 2;

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.println("You enter : "+userInput);

        Random comp = new Random();
        int computerInput = comp.nextInt(3);
        System.out.println("Computer enter : "+computerInput);

        if (computerInput == userInput) {
            System.out.println("Match is DRAW");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 ||
                userInput == 2 && computerInput == 1) {
            System.out.println("You WIN!!! & Computer LOOSE");
        } else if (userInput == 0 && computerInput == 1 || userInput == 1 && computerInput == 2 ||
                userInput == 2 && computerInput == 0) {
            System.out.println("Computer WIN & You LOOSE");
        }
        else {
            System.out.println("You choose invalid choice....Try Again!");
        }

    }
}
