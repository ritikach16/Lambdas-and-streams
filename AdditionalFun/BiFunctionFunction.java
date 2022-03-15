package AdditionalFun;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionFunction {

    BiFunction<Employees, Manager, Employees> empManagerFun = (emp, man) -> emp.getManager().getPersonalAssistant();

    Function<Employees, Employees> emplManagerFunction = emp -> emp.getManager().getPersonalAssistant();

    private void testBiFunction(Employees emp, Manager m){
        Employees employees = empManagerFun.apply(emp, m);
        System.out.println("Employee" + employees);
    }
    private void testAndThen(Employees emp, Manager manager){
        BiFunction<Employees, Manager, Employees> perAssistant = empManagerFun.andThen(emplManagerFunction);
        Employees pa = perAssistant.apply(emp, manager);
    }

    public static void main(String[] args) {
        Employees emp = new Employees(99);
        Manager man = new Manager();

        emp.setManager(man);
        man.setPersonalAssistant(emp);
        new BiFunctionFunction().testBiFunction(emp, man);
        new BiFunctionFunction().testAndThen(emp, man);
    }
}
