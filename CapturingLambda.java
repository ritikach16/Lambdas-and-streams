public class CapturingLambda {
    Trade trade = new Trade("IBM", 20000, "OPEN");
    public interface ITrade{
        public boolean check(Trade t);
    }
    public boolean isOpenTrade(){
        ITrade simpleLambda = (t) -> t.isOpen() ? true : false;
        return simpleLambda.check(trade);
    }

    public boolean checkStatus(String status){
        ITrade statusLambda = (t) -> t.getStatus().equals(status) ? true : false;
        return false;
    }
 int memberCount = 10;
    public boolean isOpenAndBig(String status, int quan){
        int localCount = 0;
        ITrade openAndLargeTrade = (t) -> {
            //localCount++;  // NOT ALLOWED as count is final by default
            memberCount++; // can be modified but WE SHOULD NOT! not a good practice.
            return (t.getStatus().equals(status) && t.getQuantity() > quan);
        };

        return openAndLargeTrade.check(trade);
    }

    public static void main(String[] args) {
        CapturingLambda cl = new CapturingLambda();
        System.out.println("is Open Trade using non-capturing lambda: " + cl.isOpenTrade());
    }
}
