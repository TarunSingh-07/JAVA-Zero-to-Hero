package com.company;

public class practice_set_7 {
//    Method 1
//    static void multiplication(int n){
//        for (int i = 1; i <= 10; i++) {
//            System.out.format("%d x %d = %d",n, i, n*i);
//            System.out.print("\n");
//        }
//    }

//        Method 2
//    static void pattern1(int n){
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }

    //    Method 3
//    static int sumRec(int n){
//        if(n==1){
//            return 1;
//        }
//        else {
//            return n + sumRec(n-1);
//        }
//    }


//    Method 4
//    static void pattern2(int n){
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }

//    Method 5
//    static int fib(int n){
//        if (n == 1){
//            return 0;
//        } else if (n == 2) {
//            return 1;
//        }
//        else {
//            return fib(n-1) + fib(n-2);
//        }
//    }

//    Method 6
//    static int avg(int ...arr){
//        int result = 0;
//        for (int a : arr){
//            result += a;
//        }
//        return result/ arr.length;
//    }

//    Method 7
//static void pattern2_rec(int n){
//        if(n>0){
//            for (int i = n; i > 0 ; i--) {
//                System.out.print("*");
//            }
//            System.out.println();
//            pattern2_rec(n-1);
//        }
//    }

//    Method 8
//      static void pattern1_rec(int n){
//             if(n>0){
//                 pattern1_rec(n-1);
//                 for (int i = 0; i < n; i++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }

//    Method 9
//    static int fahrenheit(int n){
//        int result  = (n*9/5) + 32;
//        return result;
//    }

//    Method 10
    static int sum(int n){
        int total = 0;
        for (int i = n; i > 0; i--) {
            total += i;
        }
        return total;
    }


    public static void main(String[] args) {
//        Problem 1
//        multiplication(7);

//        Problem 2
//        pattern1(4);


//        Problem 3
//        int c = sumRec(4);
//        System.out.println(c);


//        Problem 4
//        pattern2(4);


//        Problem 5
//        fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//        int result = fib(4);
//        System.out.println(result);

//        Problem 6
//        System.out.println("The avg of set of num is : " + avg(8, 9, 10, 89, 56));

//        Problem 7
//        pattern2_rec(4);

//        Problem 8
//        pattern1_rec(4);

//        Problem 9
//        int celsius = 8;
////        fahrenheit(celsius);
//        System.out.println("The fahrenheit of "+ celsius + " celsius is : " +fahrenheit(celsius));

//        Problem 10
        System.out.println("The sum of first n natural number is : " +sum(5));
    }

}
