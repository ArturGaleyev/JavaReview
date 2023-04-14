package com.syntax.review4;

public class ArrayReview {
    public static void main(String[] args) {

        int ii=10;

        int [] arr=new int[3];
        //we store elements based on indexes
        arr[0]=10;
        arr[1]=11;
        //arr[3]=12;
        //access also by indexes
        //System.out.println(arr[2]);
        for (int i:arr
             ) {
            System.out.println(i);

        }

        String[] planets={"Earth","Mars","Jupiter","Saturn","Neptune"};
//        System.out.println(planets[0]);
//        System.out.println(planets[1]);
//        System.out.println(planets[2]);
       // for (int j = 0; j < planets.length ; j++) {
        //enhanced for loop is used only with arrays and collections
        for (String planet:planets)
       // }
            System.out.println(planet);
        }


    }
