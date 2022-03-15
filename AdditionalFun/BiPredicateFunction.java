package AdditionalFun;

import java.util.function.BiPredicate;

public class BiPredicateFunction {

    BiPredicate<Employees, Manager> empManagerPredicate =
            (emp, manager) -> emp.getManager().equals(manager) ? true : false;

    BiPredicate<Employees, Manager> managerHasAssistant = (emp, manager) -> manager.getPersonalAssistant().equals(emp) ? true : false;

    BiPredicate<Employees, Manager> ispa = empManagerPredicate.and(managerHasAssistant);

    BiPredicate<Employees, Manager> ispa2 = empManagerPredicate.or(managerHasAssistant);

    BiPredicate<Employees, Manager> notAManagerPred = empManagerPredicate.negate();

    private void testBiPredicate(Employees emp, Manager m){
        boolean isManager = empManagerPredicate.test(emp, m);
        System.out.println("Is manager? " + isManager);
    }

    private void testNegate(Employees emp, Manager m){}

    private void testAnd(Employees emp, Manager m){}

    private void testOr(Employees emp, Manager m){}

    public static void main(String[] args) {
        Employees emp = new Employees(99);
        Manager man = new Manager();

        emp.setManager(man);
        new BiPredicateFunction().testBiPredicate(emp, man);

        Manager man2 = new Manager();
    }
}
