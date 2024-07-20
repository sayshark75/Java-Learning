package has_a_relation;

public class Engine {
    String engineType;
    int horsePower;
    static int approxWeightKg = 40;

    //    Constructor
    Engine(String type, int hp){
        this.engineType = type;
        this.horsePower = hp;
    }

    void displayEngineInfo(){
        System.out.println("Engine Type: " + this.engineType);
        System.out.println("Horsepower: " + this.horsePower);
    }

    public static void main(String[] args) {

    }
}

