package com.company;

public class Methods_31 {
    /* static method se aap static ko bina "obj" create kr ke cl kr sakte he nhi toh apko
           "obj" banana padega or call karna padega  */
     static int logic(int x, int y){
        int z;
        if (x > y) {
            z = x+y;
        }
        else {
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c ;
        // Method invocation using Object creation
//         Methods_31 obj = new Methods_31();
//         c = obj.logic(a, b);
        c = logic(a,b);

        int a1 = 2;
        int b1 = 4;
//        int c1 = obj.logic(a1, b1);
        int  c1 = logic(a1, b1);

        System.out.println(c);
        System.out.println(c1);
    }
}
