package com.syntax.review3;

public class switchStatement {
    public static void main(String[] args) {
        String color="Green";
        switch (color.toLowerCase()){
            case"red":
                System.out.println("stop");
                break;
            case "orange":
                System.out.println("yield");
                break;
            case "green":
                System.out.println("go");
                break;
            default:
                System.out.println("unknown color , action is also unknown");

        }
    }
}
