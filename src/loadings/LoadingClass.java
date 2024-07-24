package loadings;

// how Java code runs
// 1 - .java file(source code) created
// 2 - java compiler (In JDK) compiles the code of any error and also add constructor if not there.
// 3 - then we get a .class file which has the byte code
// 4 - this byte code executed in JVM.
// 5 - we see the result in terminal or respective IDE console

public class LoadingClass {

    //    static keyword is used to declare variables or methods so that they can be loaded statically on compilation
    //    which creates a memory location in the Heap of ram, store the data their,
    //    and assign the memory location to the variable

    //    Non-Static Loading: the variables are declared without static keyword are dynamic or instance variables/methods, the variables or methods are
    //    only accessible by the Object created by the class

    static int staticVar = 100;
    int dynamicVar = 200;

    public static void main(String[] args) {
        //        Dynamic Loading

        // created an instance of LoadingClass as lc
        LoadingClass lc = new LoadingClass();
        System.out.println(lc.dynamicVar);

        //        static Loading
        System.out.println(staticVar);
        System.out.println(LoadingClass.staticVar);
        System.out.println(lc.staticVar); // redundant to access via object
    }
}
