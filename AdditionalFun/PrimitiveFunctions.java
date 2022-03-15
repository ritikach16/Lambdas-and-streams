package AdditionalFun;

import Interfaces.Employee;

import java.util.function.*;

public class PrimitiveFunctions {
    Predicate<Integer> evenNumberPredicate = x -> x%2 == 0;
    IntPredicate evenNumPredicate2 = x -> x%2 == 0;

    Predicate<Double> doublePredicate = x -> x > 10;
    DoublePredicate doublePredicate2 = x -> x%2 > 10;

    LongPredicate longPredicate = null;

    //Consumers
    IntConsumer intConsumer = null;
    DoubleConsumer doubleConsumer = null;
    LongConsumer longConsumer = null;

    // Suppliers
    IntSupplier intSupplier;
    DoubleSupplier doubleSupplier;
    LongSupplier longSupplier;

    //Functions
    Function<Integer, Employee> empFun = null;

    IntFunction<Employee> employeeIntFunction = null;
    DoubleFunction<Employee> doubleFunction;
    LongFunction<Employee> longEmpFunction;

    // double and int
    Function<Double, Integer> doubleIntegerFunction = null;
    DoubleFunction<Integer> doubleToIntFunction;

    // primitive to primitive
    DoubleToIntFunction doubleToIntFunction3;

    private void testPredicate(int i){
        System.out.println("Even number?" + evenNumPredicate2.test(i));
    }

    public static void main(String[] args) {
        int evenNum = 20;
        new PrimitiveFunctions().testPredicate(evenNum);
    }
}
