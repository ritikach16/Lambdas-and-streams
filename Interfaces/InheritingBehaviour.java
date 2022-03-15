package Interfaces;

interface Engine{
    default String make(){
        return "DEFAULT MAKE";
    }
}

interface Vehicle{
    default String model(){
        return "DEFAULT MODEL";
    }
}

class Car implements Engine, Vehicle{
    String makeAndModel(){
        return Engine.super.make() + " " + Vehicle.super.model();
    }
}

public class InheritingBehaviour {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.makeAndModel());
    }
}
