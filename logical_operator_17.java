package com.company;

public class logical_operator_17 {
    public static void main(String[] args) {
        System.out.println("For logical AND...");
        boolean a = true;
        boolean b = false;
        boolean c = false;
        if (a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical OR...");

        if (a || b || c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical NOT...");
        System.out.println("Not(a) is ");
        System.out.println(!a);
        System.out.println("Not(b) is ");
        System.out.println(!b);


    }
}
