package Interfaces_Enum;

// this varAgrs concept allow us to take zero or multiple arguments, as an array list
// this help prevent method overloading issue where we have to create a method who can
// get multiple arguments of the same type, not knowing how many arguments
public class VarArgsClass {
    // example
    static void funG(int i,int j, int k){
        System.out.println("Inside FunG of VarArgs");

    }
    // Vararg concept we can write "int... i" or "int ... i" or "int ...i"
    // now we can add multiple arguments or keep it empty
    void funM(int ...i){

        System.out.println("Inside FunM of VarArgs");
        // to access values inside the i array, we can use for loop
        for(int val:i){
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        VarArgsClass v1 = new VarArgsClass();
        // for different arguments we previously created method overloading,
        // according to that we need 4 methods, empty, with i, with i and j, with i, j and k
        funG(10,20,30);


        v1.funM(10,20,30,40);
    }
}
