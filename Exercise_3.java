package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

// Constructor have no return type .
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number :");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        if (inputNumber == number){
            return true;
        }
        else if (inputNumber<number){
            System.out.println("Too less...");
        }
        else if (inputNumber>number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class Exercise_3 {
    public static void main(String[] args) {
        /*
        Create a class Game, which allows a user to play :Guess the Number"
        game once. Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input to number
        3. isCorrectNumber() to detect whether the number entered by the user is true or false
        4. getter and setter for noOfGuesses
        Use properties such as noOfGuesses, etc. to get this task done!
         */
        System.out.println("Welcome to the Guess the number game");
        Game g = new Game();
        boolean b = false;
        while (!b){
           g.takeUserInput();
           b = g.isCorrectNumber();
           System.out.println(b);
        }
    }
}
