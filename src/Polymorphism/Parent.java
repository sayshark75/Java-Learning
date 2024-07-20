package Polymorphism;

// *************************************************/
// Static Polymorphism is called method overloading
// in which static or non-static methods are declared with same name and
// different parameters WITHIN THE CLASS, the return type is not matters.

// Types of Inheritance
// Class based Inheritances
    // 1 - Single Inheritance
    // 2 - MultiLevel Inheritance
    // 3 - Hierarchical Inheritance
// Interface or Abstract level inheritances
    // 4 - Multiple inheritance
    // 5 - Hybrid Inheritance (Mixed Inheritance)

public class Parent  {
    int age = 40;
    static String name="Parent";
    void introduce(){
        System.out.println("I am "+name+" and my age is "+age);
    }
    // *************************************************/
    // We are overloading eat method with different parameters in the same class

    void eat(){
        System.out.println("Parent : I eat sugarless food");
    }
    void eat(String food){
        System.out.println("Parent : I eat sugarless food: "+food);
    }
    void eat(String food, int kg){
        System.out.println("Parent : I eat sugarless food: "+food + " of "+ kg+" KG");
    }
    // *************************************************/
    public static void main(String[] args) {
        // we can now access all members of Parent
        Parent p1 = new Parent();
        p1.eat();
        p1.eat("grapes");
        p1.eat("apple",1);
    }
}
