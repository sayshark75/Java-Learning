package scopes;

public class ScopesClass {
//      there are basically 3 scopes
//
//      Global Scope: has two categories
//          Static scope: the variables which are declared via static keyword are
//          accessible directly or via the class or the class object

//          Instance Scope: the variables which are not declared via static keyword are
//          accessible only via the object of that class

//      Functional Scope: the variables which are declared inside the class methods or
//      in main method are only accessible in the same scope. we cannot nest another method in a method.

//      Block scope: the variables declared inside a block of code, like in a loop, or conditional statements
//      are only accessible to that scope only

//    Examples
    // dynamic or instance scope variable
    int dynamicVar = 200;
    // Static scope variable
    static int staticVar = 300;

    void fun1(){
        // functional scope variable
        int funcVar = 140;
        // nested function not allowed
    }

    public static void main(String[] args) {
        // functional scope variable
        int mainVar = 450;

        if(mainVar==450){
            int blockVar = mainVar + 340;
            System.out.println(blockVar);
        }

        // System.out.println(blockVar);
        // Compilation error: Cannot resolve symbol 'blockVar'
    }
}
