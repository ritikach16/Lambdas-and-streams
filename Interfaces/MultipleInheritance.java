package Interfaces;

interface Engines{
    default String model(int id){
        return "DEFAULT ENGINE";
    }
}

class Cars implements Engines, Vehicles{

    // re-implementing the method
    public String model(int id){
        return "DEFAULT CAR";
//        return Engines.super.model(id);
    }


    String getModel(int id){
        return model(id);
    }
}

interface Vehicles extends Engines{
    default String model(int id){
        return "DEFAULT Vehicle";
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Cars c = new Cars();
        System.out.println(c.getModel(2));
    }
}
