package com.company;
import java.util.Scanner;

public class practice_set_2 {
    public static void main(String[] args) {
//        Question 1
//        float a = 7/4.0f * 9/2.0f;
//        System.out.println(a);

//        Question 2
//        we know: char + int = int,so i use (char) for character precedence
        char grade = 'b';
        grade = (char)(grade+8);
        System.out.println(grade);

//        Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

//        Question 3
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num>8);

//        Question 4
        System.out.println("enter v,u,a,s");
        Scanner t = new Scanner(System.in);

        int a = t.nextInt();
        int v = t.nextInt();
        int u = t.nextInt();
        int s = t.nextInt();
        System.out.println((v*v-u*u)/(2*a*s));


    }
}
