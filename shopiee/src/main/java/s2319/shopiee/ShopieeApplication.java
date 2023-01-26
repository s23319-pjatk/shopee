package s2319.shopiee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ShopieeApplication {

    public static void main(String[] args) {

        User user1 = new User(100d, 1);
        Cart cart1 = new Cart(user1);

        User user2 = new User(10, 2);
        Cart cart2 = new Cart(user2);

        cart1.addItem("milk");
        cart1.addItem("milk");
        cart1.addItem("beer");
        cart1.addItem("chocolate");

        cart2.addItem("beer");
        cart2.addItem("beer");
        cart2.addItem("beer");


        boolean done = cart1.checkout();
        if (done) {
            System.out.println("Zakupy udane, miłego dnia!");
        } else {
            System.out.println("Odmowa, brak wystarczającej kwoty na koncie.");
        }

        boolean apprved = cart2.checkout();
        if (apprved) {
            System.out.println("Zakupy udane, miłego dnia!");
        } else {
            System.out.println("Odmowa, brak wystarczającej kwoty na koncie.");
        }
    }
}