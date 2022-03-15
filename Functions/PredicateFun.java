package Functions;

class Employees{
    int getRatings(){
        return 9;
    }
}

public class PredicateFun {

   Predicate<Employees> bonus = (emp) -> emp.getRatings() > 10 ? true : false;

   Predicate<String> emptyStr = s -> s.isEmpty();
}
