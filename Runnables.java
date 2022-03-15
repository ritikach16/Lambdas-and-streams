import java.util.concurrent.Callable;

public class Runnables {
    public void methodAcceptingRunnable(Runnable r){}
    public void methodAcceptingCallable(Callable c){}
    private static void persist(){}
    private static void email(){}
    public static void main(String[] args) {
        Runnable run = () -> System.out.println("Lambda fun");

        new Runnables().methodAcceptingRunnable(run);
        new Runnables().methodAcceptingRunnable(() -> {
            System.out.println("Complex Runnable");
            persist();
            email();
        });

        Callable callable = () -> "Hello, Callable";

        new Runnables().methodAcceptingCallable(callable);
        new Runnables().methodAcceptingCallable(() -> {
            return "Hello";
        });
    }


    interface Tradable<Trade>{
        boolean check(Trade t);
    }

//    Tradable<Trade> bigTradableLambda = (trade) -> trade.isBigTrade();
//    Tradable<Trade> ibmTrade = (trade) -> trade.getInstrument().equals("IBM");
}
