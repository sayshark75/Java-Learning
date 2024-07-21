package Arrays;

public class Array_In_Methods {
    // we can use arrays as parameters and return type as well
    // example

    //using array as parameter
    static void printSumOfNumbers(int[] intArr){
        int sum =0;
        for(int i=0;i<intArr.length;i++){
            sum+=intArr[i];
        }
        System.out.println("Sum is : "+sum);
    }

    // using array as a return type

    static int[] getArray(){
        int[] arr = {200,300}; // valid but currently redundant
        return arr;
        // we can return like this too...
        // return new int[]{200,300};
    }

    public static void main(String[] args) {
        int[] myArr = {1,2,3};
        printSumOfNumbers(myArr);
        System.out.println("-------------------");
        // we can directly put an array in methods
        printSumOfNumbers(new int[]{5,4,5});

        System.out.println("-------------------");
        int[] newArr = getArray();
        for(int val:newArr){
            System.out.println(val);
        }
    }
}
