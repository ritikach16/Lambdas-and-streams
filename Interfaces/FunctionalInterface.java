package Interfaces;

public class FunctionalInterface {
    @java.lang.FunctionalInterface
    interface Multiplier{ // functionalInterface
        int multiply(int i, int j);
    }

    //lambda expression
    Multiplier ml = (p, q) -> p*q;

    public static void main(String[] args) {
        FunctionalInterface client = new FunctionalInterface();
    }
}
