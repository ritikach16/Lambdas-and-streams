package Interfaces;

public class FunctionalInterfaceAnnotation {
    @java.lang.FunctionalInterface // annotation for functional interface
    interface Cruncher{
        int crunch(int i, int j);
    }

    public int cruncherService(int i, int j, Cruncher cruncher){
        return cruncher.crunch(i, j);
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnnotation client = new FunctionalInterfaceAnnotation();
        int ans = client.cruncherService(3,4, (p, q) -> p*q);
        System.out.println("Ans: " + ans);

        ans = client.cruncherService(3,4, (p, q) -> p-q);
        System.out.println("Ans: " + ans);

        ans = client.cruncherService(3,4, (p, q) -> p+q);
        System.out.println("Ans: " + ans);

        ans = client.cruncherService(3,4, (p, q) -> p/q);
        System.out.println("Ans: " + ans);
    }
}
