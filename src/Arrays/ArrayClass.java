package Arrays;


public class ArrayClass {

    public static void main(String[] args) {

        // Arrays are declared using square brackets after the datatype
        // Array length is always fixed, below is an integer array of 3 length
                //  0,  1,  2
        int[] x = {10, 20, 30};

        // we can DECLARE arrays in 3 different ways
        int[] a = {10, 20, 30, 40};
        int[] b = new int[3];
        int[] c;

        // to access an integer from array we use its index starts with 0
        System.out.println(a[0]);
        System.out.println("----------------------");
        // to access all the element we use loops
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("----------------------");
        for (int val : a) {
            System.out.println(val);
        }
    }
}
