package com.company;
import java.util.Scanner;

public class practice_set_4 {
    public static void main(String[] args) {
//        Question 1
//        if ke andar assignment nhi dal sakte
//        int a = 10;
//        if (a = 11){
//            System.out.println("i am 11");
//        }else{
//            System.out.println("I am not 11");
//        }

//        Question 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter sub1 mark");
//        int sub1 = sc.nextInt();
//        System.out.println("enter sub2 mark");
//        int sub2 = sc.nextInt();
//        System.out.println("enter sub3 mark");
//        int sub3 = sc.nextInt();
//
//        float total = (sub1+sub2+sub3)/3.0f;
//        System.out.println("The total avg is "+total);
//
//        if (sub1>33 && sub2>33 && sub3>33 && total > 40){
//            System.out.println("you are pass");
//        }else{
//            System.out.println("you are fail");
//        }

//        Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if (income>2.5f && income<=5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income>5f && income<=10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if (income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("Total tax pay by the emp is"+tax);

//        Question 4
//        int day;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter day in num");
//        day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("It's Monday");
//            case 2 -> System.out.println("It's Tuesday");
//            case 3 -> System.out.println("It's Wednesday");
//            case 4 -> System.out.println("It's Thursday");
//            case 5 -> System.out.println("It's Friday");
//            case 6 -> System.out.println("It's Saturday");
//            case 7 -> System.out.println("It's Sunday");
//            default -> System.out.println("You enter invalid data");
//        }

//        Question 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter year");
//        int year;
//        year = sc.nextInt();
//        if((year %4 == 0 && year %100 != 0) || year%400 == 0){
//            System.out.println("It's a Leap year");
//        }else{
//            System.out.println("Not a leap year");
//        }

//        Question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website ");
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }else if(website.endsWith(".com")){
            System.out.println("This is an Commercial website");
        }else if(website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
    }
}
