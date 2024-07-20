package loadings;

import variables.VariableClass;

public class LoadingClass {

    //    static keyword is used to declare variables or methods so that they can be loaded statically on compilation
    //    which creates a memory location in the Heap of ram, store the data their,
    //    and assign the memory location to the variable

    //    Dynamic Loading: the variables are declared without static keyword are dynamic or instance variables/methods, the variables or methods are
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
