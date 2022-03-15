package AdditionalFun;

import java.util.function.BiConsumer;

public class BiConsumerFunctions {
    BiConsumer<Employees, Integer> empBonusConsumer = (emp, bonus) -> System.out.printf("Emp %s is set of %d pct of bonus:", emp, bonus);
    private void testBiConsumer(Employees emp, Integer bonus, Integer salaryHike){}

    BiConsumer<Employees, Integer> empSalary = (emp, sal) -> {
        System.out.printf("Emp %s is set of %d hike in salary:", emp, sal);
    };

    BiConsumer<Employees, Integer> getEmpBonusConsumer = empBonusConsumer.andThen(empSalary);

    private void testBiConsumer2(Employees emp, Integer bonus, Integer salaryHike){
        empBonusConsumer.accept(emp, bonus);
    }

    public static void main(String[] args) {
        Employees emp = new Employees(10);
        int bonus = 5;
        int salaryHike = 15;
        new BiConsumerFunctions().testBiConsumer(emp, bonus, salaryHike);
    }
}
