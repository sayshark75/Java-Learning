package Polymorphism;
// *************************************************/
// Dynamic Polymorphism (Runtime Polymorphism)
// Method Overriding: if a subclass or child class or slave class
// which implements or declares same method from its Super Class or Parent class or Master class
// with the same name and different method definition or body
// the method is said to be Override. but it first needs to be Inherit its Parent class.

public class Son extends Parent {
    int age = 20;
    static String name="SonOne";
    static void test() {
    	System.out.println("Food taste is good");
    }
    void introduce(){
        System.out.println("I am "+name+" and my age is "+age);
    }
    // static methods cannot be overridden by the child class,
    // if the parent methods are non-static.
    // Parent method must be static too...
    // Like below
    //     static void eat(){
    //         System.out.println("SonOne : I eat any food");
    //     }

    // *************************************************/
    // Method overriding or Dynamic Polymorphism

    // the @Override keyword is used to make sure that the name we are using is
    // properly matching with the name of the parent class method
    // check by changing the method name.
    @Override
    void eat(){
        System.out.println("SonOne : I eat any food");
    }

    void newEat(){
        // to call the parent class's eat method we will use
        super.eat();
        // super is simply a previous ancestor class
        // if there is multiLevel Inheritance, super is always
        // considered to be the nearest ancestor class.

        // Example : Parent => Son => Grandson
        // for grandson, super is always the Son
        // for Son, super is always the Parent

        // to access Parent method in Grandson, we need to
        // create different method in Son class and then use
        // that method in grandson using super keyword
    }

    public static void main(String[] args) {
        Son s = new Son();
        // It will call the override method eat in this class
        s.eat();
        // Super keyword not be used in static context, this main is static method
        // the newEat is a non-static method
        s.newEat();
        // we can also call parent methods, untill its not private
        s.eat("chocolet");
        
        // if the object is null and reference is some class assigned
        // still we can access static methods and variables from it
        // from the reference assigned
        Son b = null;
        System.out.println(b.name);
        b.test();
        // it will not give compile time error, It will be NPException for age
        // System.out.println(b.age);
    }
    // *************************************************/
}
