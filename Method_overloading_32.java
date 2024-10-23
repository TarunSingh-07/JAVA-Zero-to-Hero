package com.company;

public class Method_overloading_32 {
    /* static method se aap static ko bina "obj" create kr ke cl kr sakte he nhi toh apko
            "obj" banana padega or call karna padega  */
    static void tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }
    static void foo(int a, int b){  // a & b are parameter
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }

    public static void main(String[] args) {
//        tellJoke();

//        Case 1: Changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: " + x);

//        Case 2: Changing the Array
//        int [] marks = {12, 73, 44, 85, 69, 98};
//        change2(marks);
//        System.out.println("The value of marks after running change2 is: " + marks[0]);

//        Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000); // a & b are argument
        // Arguments are actual
    }
}
