package Functions;

interface Movies{
    boolean isClassic(int movieId);
}

interface Person{
    boolean isEmployee(int empId);
}

interface Hospital{
    default void admit(Patient patient){
       patient.patientName("PATIENT");
    }
}

interface Predicate<T> {
    boolean test(T t);
}

class Patient{
    void patientName(String name){
        System.out.println(name);
    }
}

public class WhatAreFunctions {
    public static void main(String[] args) {

    }
}
