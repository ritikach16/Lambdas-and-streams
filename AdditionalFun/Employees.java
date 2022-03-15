package AdditionalFun;

public class Employees {
    private Manager manager;

    public Manager getManager(){
        return new Manager();
    }
    public void setManager(Manager manager){
        this.manager = manager;
    }
    Employees(){
    }
    Employees(int n){
    }
}
