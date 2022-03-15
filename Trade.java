public class Trade {
    private String s;
    private int quantity;
    private String status;
    Trade(String s, int quantity, String status){
        this.s = s;
        this.quantity = quantity;
        this.status = status;
    }
    public boolean isOpen(){
        if(status.equals("OPEN")) return true;
        else return false;
    }

    public String getStatus(){
        return status;
    }
    public int getQuantity(){
        return quantity;
    }
}
