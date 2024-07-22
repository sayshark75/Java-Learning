package Interfaces_Enum;

// to create some constant values, we use Enums
// we can separately create it and use it in different classes

public enum Color {
    RED,GREEN,YELLOW,PINK;

    // we can add methods, variables and constructor
    void enumMethod(){
        System.out.println("Inside Enum Method");
    }
    static int enumVal = 20;
}
