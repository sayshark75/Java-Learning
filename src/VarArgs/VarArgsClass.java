package VarArgs;

// this varAgrs concept allow us to take zero or multiple arguments, as an array list
// this help prevent method overloading issue where we have to create a method who can
// get multiple arguments of the same type, not knowing how many arguments

// there are some rules of VarArgs
// 1 - if we want to declare any other parameter along with var-args 
// 	   then in this case var-args should be at last.
// 2 - two var-args in a single method parameter is not possible.
// 3 - if multiple overloaded methods are there then var-args gets the least priority.
// 4 - along with var-args we can not define another method which takes 
//     array of same type as parameter. it will become duplicate method definition.

public class VarArgsClass {
    // example
    static void funG(int i,int j, int k){
        System.out.println("Inside FunG of VarArgs");

    }
    // VarArg concept we can write "int... i" or "int ... i" or "int ...i"
    // now we can add multiple arguments or keep it empty
    void funM(int ...i){

        System.out.println("Inside FunM of VarArgs");
        // to access values inside the i array, we can use for loop
        for(int val:i){
            System.out.println(val);
        }
    }
    
    // we cannot add multiple varArgs in same function
    // if there is different variables and one varArg at the last of params
    // then we can do this
    
    void funB(String message, int... nums) {
        System.out.println("Message: " + message);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        VarArgsClass v1 = new VarArgsClass();
        // for different arguments we previously created method overloading,
        // according to that we need 4 methods, empty, with i, with i and j, with i, j and k
        funG(10,20,30);
        v1.funB("Hello",1,2,3);

        v1.funM(10,20,30,40);
    }
}
