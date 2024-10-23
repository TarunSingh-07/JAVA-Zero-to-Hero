package com.company;

public class practice_set_6 {
    public static void main(String[] args) {
//        Question 1
        /* float [] marks = {45.7f, 67.5f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks){
             sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);
         */

//        Question 2
       /* float [] marks = {45.7f, 67.5f, 63.4f, 99.2f, 100.0f};
        float num = 67.5f;
        boolean isInArray = false;

        for (float element : marks){
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value present in Array");
        } else {
            System.out.println("The value not present in Array");
        }
        */

//        Question 3
       /* float [] marks = {45.7f, 67.5f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks){
            sum = sum + element;
        }
        System.out.println("The value of avg marks  is " + sum/ marks.length);
        */

//        Question 4
      /*  int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 7},
                         {5, 8, 9}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) {  // column number of times
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
//        Printing the elements of 2-D Array
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) {  // column number of times
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" "); // Print new line
        }
       */

//        Question 5
     /*   int [] arr = {1, 2, 3, 4 , 5 , 6};
        int n = Math.floorDiv(arr.length, 2);
//        System.out.println(n);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
      */

//        Question 6
    /*    int [] arr = {23, 56, 54, 212, 98, 99};
        int max = Integer.MIN_VALUE;
        for ( int e : arr){
            if (e > max) {
                max = e;
            }
        }
        System.out.println("Maximum value in this arr is : " + max);
     */



//        Question 7
      /*  int [] arr = {23, 56, 54, 212, 98, 99};
//        int min = 0;
        int min = Integer.MAX_VALUE;
        for ( int e : arr){
            if (e < min) {
                min = e;
            }
        }
        System.out.println("Minimum value in this arr is : " + min);

       */

//        Question 8
        boolean isSorted = true;
        int [] arr = {45, 789, 5630, 48, 89, 32};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
