package com.company;

public class Variable_argument_33 {
//    static int sum(int a, int b){
//        return  a+b;
//    }
//    static int sum(int a, int b, int c){
//        return  a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return  a+b+c+d;
//    }
    static int sum(int ...arr){
//        Available as int [] arr;
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of nothing is : " + sum());
        System.out.println("The sum of 1 is : " + sum(1));
        System.out.println("The sum of 4 and 5 is : " + sum(4, 5));
        System.out.println("The sum of 4, 3 and 5 is : " + sum(4, 5, 3));
        System.out.println("The sum of 4, 3, 7 and 5 is : " + sum(4, 5, 3, 7));
    }
}
