package com.rushikeshnarkhede;

public class Main { //entry point function

    public static void main(String[] args) {
        System.out.println("Inside main");
        Demo1 obj;  //reference of Demo1 class
        obj=new Demo1();    //object creation
        System.out.println(obj.No);
        obj.Fun();  //inside fun
        System.out.println(obj.hashCode());
        obj=null;
    }
}
