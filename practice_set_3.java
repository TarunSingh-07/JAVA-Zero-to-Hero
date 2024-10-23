package com.company;

public class practice_set_3 {
    public static void main(String[] args) {
//        Question 1
        String name = "Tarun";
        System.out.println(name.toLowerCase());

//        Question 2
        String name2 = "    Tarun    ";
        System.out.println(name2.replace(" ","_"));

//        Question 3
        String letter = "Dear <|name|>, Thanks a lot!";
        String replacee = letter.replace("<|name|>","tarun");
        System.out.println(replacee);

//        Question 4
        String myString = "This string contains  Double and    triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        String noTripleSpace = "No  triple space";
        System.out.println(noTripleSpace.indexOf("   "));

//        Question 5
        String letter2 = "Dear Harry,\n\t This java course is nice.\n\t Thanks ";
        System.out.println(letter2);

    }
}
