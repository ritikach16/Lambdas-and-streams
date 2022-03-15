package AdditionalFun;

import java.util.function.Function;
public class ComposingFunctions {
    Function<Employees, Manager> managerFinder = (emp) -> getManager(emp);
    Function<Manager, Employees> assistantFinder = (manager) -> getPersonalAssistant(manager);
    private void testAndThen(Employees emp){
        Function<Employees, Employees> empManagerAssistantFinder =
                managerFinder.andThen(assistantFinder);
    }

    private void testCompose(Employees emp){
        Function<Employees, Employees> empFinder = assistantFinder.compose(managerFinder);
    }

    private Employees getPersonalAssistant(Manager manager){
        return manager.getPersonalAssistant();
    }

    private Manager getManager(Employees emp){
        return emp.getManager();
    }
}
