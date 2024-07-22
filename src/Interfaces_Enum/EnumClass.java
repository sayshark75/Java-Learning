package Interfaces_Enum;

public class EnumClass {
    // we can create enum in the same class as well
    // the text casing doesn't matter. just a rule to follow "Full Capital"
    // MyColor will be accessible to other classes as it is Public by default
    enum MyColor  {
        Blue, VioLet, Purple, GrEen
    }
    public static void main(String[] args) {
        // sometimes we use String to do this things
        String x = "Green";
        // but people maybe insert some wrong values
        String y = "bluee";
        // to prevent such behaviour, we use Enums
        Color c = Color.PINK;
        MyColor m = MyColor.VioLet;
        System.out.println(Color.RED);
        System.out.println(MyColor.GrEen);
        System.out.println(c);
        System.out.println(m);

        // now we cannot do, it needs specific color only from that Enum
        // Color g = "GREEN";

        // we can access the variables and methods of enum as well
        System.out.println(Color.enumVal);
        c.enumMethod();
        System.out.println(c.enumVal); // redundant
        // System.out.println(enumVal); wrong
    }
}
