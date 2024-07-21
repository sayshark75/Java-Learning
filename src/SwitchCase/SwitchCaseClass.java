package SwitchCase;

public class SwitchCaseClass {

    public static void main(String[] args) {

        // Suppose we set a value to 2
        int value = 2;
        // Switch will hold the value and compare with cases
        switch (value){
            // if the case value matches, code block will execute
            case 1 : {
                System.out.println("One");
            }
            // by default, it just executes remaining cases as well,
            // to stop it we use break statement
            break;
            case 2 : {
                System.out.println("two");
            }
            break;
            case 3 : {
                System.out.println("three");
            }
            break;
            default:{
                System.out.println("default");
            }
        }
    }
}
