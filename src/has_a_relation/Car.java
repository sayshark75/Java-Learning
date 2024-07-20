package has_a_relation;

public class Car {
    String name;
    int speedMPH;
    // **********************************************//
    // Has-A Relation : Car Class has an Engine Class
    Engine engine;
    // **********************************************//

    static String tempColor = "Red";

    // Overriding Default Car constructor
    Car(String name, int speed, Engine eng){
        this.engine = eng;
        this.name = name;
        this.speedMPH = speed;
    }

    public static void main(String[] args) {
        System.out.println("Inside Car Class");

        // access static members of Engine class
        System.out.println(Engine.approxWeightKg);

        // creating new car
        Engine v8 = new Engine("v8",200);
        Car lambo = new Car("Lamborghini Avendator",200,v8);

        // lambo can access dynamic members of both Engine and Car and static members of Car only
        System.out.println(lambo.name);
        System.out.println(lambo.speedMPH);
        System.out.println(lambo.engine.engineType);
        System.out.println(lambo.engine.horsePower);
        System.out.println(lambo.tempColor); // redundant, can access directly here like below
        System.out.println(tempColor);
        lambo.engine.displayEngineInfo();

        // access static members of Engine we can do,
        System.out.println(v8.approxWeightKg); // redundant, to access static member of another class
        // we will do this
        System.out.println(Engine.approxWeightKg);
    }
}


/*
* Outputs:
*
* Inside Car Class
* 40
* Lamborghini Avendator
* 200
* v8
* 200
* Red
* Red
* Engine Type: v8
* Horsepower: 200
* 40
* 40
*
* */