package Functions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
class Trade{
    private String s;
    private int quantity;
    private String status;
    Trade(String s, int quantity, String status){
        this.s = s;
        this.quantity = quantity;
        this.status = status;
    }
    boolean isBigTrade(){
        return true;
    }

    boolean isCancelledTrade(){
        return false;
    }

    public String getStatus(){
        return status;
    }

    public int  getCount() {
        return 200;
    }
}

public class ComposingPredicates {

    Predicate<Trade> bigTrade = t -> t.isBigTrade();
    Predicate<Trade> cancelledTrade = t -> t.isCancelledTrade();

    Predicate<Trade> bigAndCancelledTrade = t -> t.isBigTrade() && t.isCancelledTrade();
    Predicate<Trade> bigAndCancelledTrade2 = bigTrade.and(cancelledTrade);

    //logical or
    Predicate<Trade> newTrade = t -> t.getStatus().equals("NEW");
    Predicate<Trade> cancelTrade = t -> t.getStatus().equals("CANCEL");
    Predicate<Trade> newOrCancelTrade = newTrade.or(cancelTrade);


    //logical and & or
    Predicate<Trade> newOrCancelButBigTrade = newTrade.or(cancelTrade).and(bigTrade);

    // negate
    Predicate<Trade> notNewTrade = newTrade.negate();

    //equals
 List<Trade> trades = new ArrayList<Trade>();
 Trade t1 = new Trade("GOOG", 20000, "CANCEL");

 Predicate<Trade> p1 = Predicate.isEqual(t1);
//  for(Trade tr : trades){
//    if(p1.test(tr)){
//        System.out.println("MATCHING TRADE: " + tr);
//    }
//    }

    public static void main(String[] args) {

    }
}
