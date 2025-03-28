package com.company;

public class Associativity_0f_opera_09 {
    public static void main(String[] args) {
//      Precedence & Associativity
        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on
        the basis of left to right associativity.
           = 30-34/2
           = 30-17
           = 13
        */
        int b = 60/5-34*2;
        /*
           = 12-34*2
           = 12-68
           = -56
        */
        System.out.println(a);
        System.out.println(b);

//        Quick Quiz
        int x = 6;
        int y = 1;
//        int k = x * y/2;
        int c = 1;
        int d = 4;
        int e = 5;
//        int k = c*c - 4*e*d/2*e;
        int k = (c*c - 4*e*d)/(2*e);
        System.out.println(k);

    }
}
