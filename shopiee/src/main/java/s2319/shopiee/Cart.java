package s2319.shopiee;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private User user;
    private List<String> items;

    public Cart(User user) {
        this.user = user;
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public double getAllUsers() {
        return user.getUserId();
    }

    public boolean checkout() {
        Storage storage = new Storage();
        double totalPrice = 0.0;
        for (String item : items) {
            if (storage.getPrice(item) != null) {
                totalPrice += storage.getPrice(item);
            }
        }
        if (totalPrice > user.getBalance()) {
            return false;
        } else {
            user.setBalance(user.getBalance() - totalPrice);
            return true;
        }
    }
}