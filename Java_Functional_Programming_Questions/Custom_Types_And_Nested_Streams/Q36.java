package Java_Functional_Programming_Questions.Custom_Types_And_Nested_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}

public class Q36 {
    public static void main(String[] args) {
        // Sample data
        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("Item1"));
        items1.add(new Item("Item2"));

        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("Item3"));
        items2.add(new Item("Item4"));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(items1));
        orders.add(new Order(items2));

        // Get a flat list of all item names
        List<String> itemNames = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .map(Item::getName)
                .collect(Collectors.toList());

        // Print the item names
        itemNames.forEach(System.out::println);
    }
}

