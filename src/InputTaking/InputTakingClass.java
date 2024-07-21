package InputTaking;

import java.util.Scanner;

public class InputTakingClass {
    // to get Input from the user,
    // we need a Scanner Library
    // it is a default by java.utils

    public static void main(String[] args) {
        // create an instance of scanner class

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");

        // to get the number datatype as int only, we will use
        int result = scan.nextInt();

        // to get a string as result
        String res = scan.nextLine();

        // there are various datatype to read, like boolean, char, byte, short, float, etc



    }
}
