package Is_a_relation_Inheritance;

// *************************************************/
// Inheritance is used to access all static and non-static members of a class
// we inherit the class using extends keyword, as shown below
public class Parent extends GrandParent {
    // *************************************************/
    int age = 40;
    static String name="Parent";
    void introduce(){
        System.out.println("I am "+name+" and my age is "+age);
    }
    static void eat(){
        System.out.println("Parent : I eat sugarless food");
    }

    public static void main(String[] args) {
        // we can now access all members of Grandparent and Parent
        Parent p1 = new Parent();
        System.out.println(p1.age);
        p1.introduce();
        p1.eat(); // redundant
        eat(); // accepted
        System.out.println(p1.name); // redundant
        System.out.println(name); // accepted

        // Grandparent members
        System.out.println(p1.ageG);
        p1.introduceG();
        p1.eatG(); //redundant
        eatG(); // accepted => difference between Has-A and Is-A relation
        System.out.println(p1.nameG); // redundant
        System.out.println(nameG); // accepted
    }
}
