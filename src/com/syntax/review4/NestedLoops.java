package com.syntax.review4;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=3 ; i++) {
            //outer loop controls number of complete iterations
            System.out.print(i+" ");

            for (int j = 0; j <=1 ; j++) {
                //inner loop always depends on outer loop
                System.out.print(j+" ");
            }
            
        }
    }
}
