package Interfaces;


@java.lang.FunctionalInterface
public interface Employee {
    //abstract method
    Employee find(int id);

    // default method
    default boolean isExec(int id) {
        return true;
    }

    //concrete method
    static String getDefaultCountry(){
        return "INDIA";
}

}

class DefaultStaticMethods{
    public static void main(String[] args) {
        class EmployeeImp implements Employee{
            @Override
            public Employee find(int id){
                return null;
            }
        }

        EmployeeImp impl = new EmployeeImp();
        impl.isExec(1234);

        //static method invoked via interface class itself

        String defCountry = Employee.getDefaultCountry();
        System.out.println(defCountry);
    }
}
