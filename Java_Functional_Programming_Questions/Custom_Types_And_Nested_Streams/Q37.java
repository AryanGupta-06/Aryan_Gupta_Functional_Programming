package Java_Functional_Programming_Questions.Custom_Types_And_Nested_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Itm {
    private String name;
    private double price;

    public Itm(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Ordr {
    private int orderId;
    private List<Itm> items;

    public Ordr(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    public void addItem(Itm item) {
        items.add(item);
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(Itm::getPrice)
                .sum();
    }

    public int getOrderId() {
        return orderId;
    }
}

public class Q37 {
    public static void main(String[] args) {
        // Create some items
        Itm item1 = new Itm("Laptop", 1200.00);
        Itm item2 = new Itm("Mouse", 25.00);
        Itm item3 = new Itm("Keyboard", 45.00);
        Itm item4 = new Itm("Monitor", 300.00);

        // Create some orders and add items to them
        Ordr order1 = new Ordr(1);
        order1.addItem(item1);
        order1.addItem(item2);

        Ordr order2 = new Ordr(2);
        order2.addItem(item3);
        order2.addItem(item4);

        Ordr order3 = new Ordr(3);
        order3.addItem(item1);
        order3.addItem(item3);
        order3.addItem(item4);

        // Add orders to a list
        List<Ordr> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        // Find the order with the highest total price using streams
        Optional<Ordr> highestOrder = orders.stream()
                .max(Comparator.comparingDouble(Ordr::getTotalPrice));

        // Print the order with the highest total price
        highestOrder.ifPresent(order -> {
            System.out.println("Order ID with the highest total price: " + order.getOrderId());
            System.out.println("Total price: $" + order.getTotalPrice());
        });
    }
}

