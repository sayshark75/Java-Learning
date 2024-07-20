package variables;

public class VariableClass {



    public static void main(String[] args) {

        // byte example
        byte byteVar = 127; // maximum value for byte => 8Bit
        System.out.println("byteVar: " + byteVar);

        // short example
        short shortVar = 32767; // maximum value for short => 16Bit
        System.out.println("shortVar: " + shortVar);

        // int example
        int intVar = 2147483647; // maximum value for int => 32Bit
        System.out.println("intVar: " + intVar);

        // long example
        long longVar = 9223372036854775807L; // maximum value for long => 64Bit
        System.out.println("longVar: " + longVar);

        // float example
        float floatVar = 3.4028235E38F; // approximate maximum value for float => 32Bit
        System.out.println("floatVar: " + floatVar);

        // double example
        double doubleVar = 1.7976931348623157E308; // approximate maximum value for double => 64Bit
        System.out.println("doubleVar: " + doubleVar);

        // char example
        char charVar = '\uffff'; // maximum value for char => 16Bit
        System.out.println("charVar: " + charVar);

        // boolean example
        boolean booleanVar = true; // true or false => ~1Bit
        System.out.println("booleanVar: " + booleanVar);


    }


}
