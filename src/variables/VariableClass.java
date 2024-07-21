package variables;

public class VariableClass {

    public static void main(String[] args) {

        // byte example
        byte byteVar = 127; // maximum value for byte => 8Bit, default value is 0
        System.out.println("byteVar: " + byteVar);
        // Range: -128 to 127

        // short example
        short shortVar = 32767; // maximum value for short => 16Bit, default value is 0
        System.out.println("shortVar: " + shortVar);
        // Range: -32,768 to 32,767

        // int example
        int intVar = 2147483647; // maximum value for int => 32Bit, default value is 0
        System.out.println("intVar: " + intVar);
        // Range: -2,147,483,648 to 2,147,483,647

        // long example
        long longVar = 9223372036854775807L; // maximum value for long => 64Bit, default value is 0L
        System.out.println("longVar: " + longVar);
        // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // float example
        float floatVar = 3.4028235E38F; // approximate maximum value for float => 32Bit, default value is 0.0f
        System.out.println("floatVar: " + floatVar);
        // Range: approximately ±1.4E-45 to ±3.4E38

        // double example
        double doubleVar = 1.7976931348623157E308; // approximate maximum value for double => 64Bit, default value is 0.0d
        System.out.println("doubleVar: " + doubleVar);
        // Range: approximately ±4.9E-324 to ±1.7E308

        // char example
        char charVar = '\uffff'; // maximum value for char => 16Bit, default value is '\u0000' (null character)
        System.out.println("charVar: " + charVar);
        // Range: '\u0000' (0) to '\uffff' (65,535)

        // boolean example
        boolean booleanVar = true; // true or false => ~1Bit, default value is false
        System.out.println("booleanVar: " + booleanVar);
        // Range: true or false

        // *****************************************************//
        // but the wrapper classes have more features than the primary data types

        // we can use

        Integer intWrap = 10; // default value is null
        Byte byteWrap = 20; // default value is null
        Long longWrap = 30L; // default value is null
        String strWrap = "Hello"; // default value is null
        Character charWrap = 'A'; // default value is null
        Float floatWrap = 0.2F; // default value is null
        Double doubleWrap = 4.5; // default value is null

    }

}
