package com.company;

public class practice_set_5 {
    public static void main(String[] args) {

//        Question 1
//        for (int i = 4; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Question 2
//        int sum = 0;
//        int n = 4;
//        for (int i = 0; i < n; i++) {
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of even numbers is :");
//        System.out.print(sum);

//        Question 3
//          int n = 2;
//          for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

//        Question 4
//        int n = 10;
//        for (int i = 10; i >= 1; i--) {
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

//        Question 5
//        int n = 5;
////        What is factorial n = n * n-1 * n-2.....1
////        5! = 5*4*3*2*1 = 120
//        int factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        System.out.printf("Factorial of %d is : %d ",n ,factorial);

//        Question 6
//        Using while loop
//          int n = 5;
//          int i = 1;
//          int factorial = 1;
//          while (i<=n){
//              factorial *= i;
//              i++;
//          }
//        System.out.printf("Factorial of %d is : %d ",n ,factorial);

//          Question 7
//          Using while loop

        int i = 4;
        while (i>0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i--;
        }

//        Question 9
//        int n = 8;
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += n*i;
//        }
//        System.out.println(sum);

//        Question 11
//        int n = 4;
//        int i = 0;
//        int sum = 0;
//        while (i<n){
//            sum += (2*i);
//            i++;
//        }
//        System.out.print("Sum of even numbers is : ");
//        System.out.print(sum);
    }
}
