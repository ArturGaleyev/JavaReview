package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {
    boolean logicButtonDisplayed=true;
    boolean logicalClickable=false;
    if(logicButtonDisplayed&&logicalClickable){
        System.out.println("Test passed");
    }else{
        System.out.println("Test failed");
    }
        System.out.println("----------Logical OR---------");
    boolean pictureDisplayed=true;
    String accountName="Syntax";
    if (pictureDisplayed||accountName.equals("Syntax")){
        System.out.println("Logical was  sucessful");
    }else {
        System.out.println("User was not able to login");
    }
        System.out.println("______________logical NOT____________");
    boolean hungry=!true;
        System.out.println(hungry);
        boolean cold=false;
        System.out.println(!cold);
        String str="hello";
        if (!str.equals("hello")){
            System.out.println("Value of the string is NOT hello");
        }
        boolean confirmSelected=false;
        if(!confirmSelected){
            System.out.println("Lets click on confirm checkbox");
        }
        System.out.println("click on Pay button");


    }
}
