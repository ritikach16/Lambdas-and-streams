package Functions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
public class SupplierFunctionalInterface {
    Supplier<String[]> fruitSupplier = () -> new String[]{"Apple", "Orange"};

    Supplier<List<Trade>> tradeSupplier = () -> new ArrayList<Trade>();

    private void testSupplier(){
        String[] fruits = fruitSupplier.get();
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        List<Trade> trades = tradeSupplier.get();
        for(Trade trade : trades){
            System.out.println("Trade is: " + trade);
        }
    }

    public static void main(String[] args) {
        new SupplierFunctionalInterface().testSupplier();
    }
}
