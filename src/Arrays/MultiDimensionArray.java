package Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        // single array Declaration
        int[] array = new int[10];
        int[] array2 = {1, 2, 3};

        // Empty multidimensional Array
        int[][] multiArray = new int[3][3]; // {{0,0,0},{0,0,0},{0,0,0}}

        int[][] multiArray2 = {
                {1, 2, 3}, // 0,0  0,1, 0,2
                {4, 5, 6}, // 1,0  1,1, 1,2
                {7, 8, 9}  // 2,0  2,1, 2,2
        };

        // each value can be accessed and Manipulated via its row index and column index
        System.out.println(multiArray2[0][0]);
        System.out.println(multiArray2[0][1]);
        System.out.println(multiArray2[0][2]);

        System.out.println(multiArray2[1][0]);
        System.out.println(multiArray2[1][1]);
        System.out.println(multiArray2[1][2]);

        System.out.println(multiArray2[2][0]);
        System.out.println(multiArray2[2][1]);
        System.out.println(multiArray2[2][2]);


        /**
         *                 {1, 2, 3}, //0,0  0,1, 0,2
         *                 {4, 5, 6}, //1,0  1,1, 1,2
         *                 {7, 8, 9}  //2,0  2,1  2,2
         */


        System.out.println("_________ Multi Loops _________");

        for (int row = 0; row < 3; row++) {
            String result = "";
            for (int col = 0; col < 3; col++) {
                result += multiArray2[row][col] + "  ";
            }
            System.out.println(result);
        }
        System.out.println("_________________________");

    }
}
