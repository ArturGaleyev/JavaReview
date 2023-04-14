package com.syntax.review3;

import java.util.Scanner;

public class whileLoopScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        System.out.println("Please enter integer values");
       while (scan.hasNextInt()){
        int num= scan.nextInt();
        sum+=num;
       }
        System.out.println("sum ="+sum);

    }
}
