package s2319.shopiee;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String, Double> prices;

    public Storage() {
        prices = new HashMap<>();
        prices.put("milk", 4.0);
        prices.put("cheatos", 5.0);
        prices.put("beer", 6.0);
        prices.put("butter", 7.0);
    }

    public Double getPrice(String item) {
        return prices.get(item);
    }
}