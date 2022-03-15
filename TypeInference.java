import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeInference {
    Map<String, String> map = new HashMap<String, String>();
    Map<String, String> map1 = new HashMap<>(); //type inference
    class PriceSkewer{
        void price(int n){

        }
    }
    interface Pricer{
        public List<Trade> skew(List<Trade> trades, PriceSkewer p);
    }
}
