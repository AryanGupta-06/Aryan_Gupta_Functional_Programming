package Java_Functional_Programming_Questions.Level_5_Custom_Functional_Interfaces;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    private String status;
    private double amount;
    private String customerName;

    // Constructor
    public Order(String status, double amount, String customerName) {
        this.status = status;
        this.amount = amount;
        this.customerName = customerName;
    }

    // Getters
    public String getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "status='" + status + '\'' +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}

public class Q30 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("completed", 150.0, "Alice"),
                new Order("pending", 200.0, "Bob"),
                new Order("completed", 100.0, "Charlie"),
                new Order("completed", 250.0, "David"),
                new Order("pending", 300.0, "Eve")
        );

        List<String> processedOrders = orders.stream()
                .filter(order -> "completed".equals(order.getStatus())) // Filter by status
                .sorted(Comparator.comparingDouble(Order::getAmount)) // Sort by amount
                .map(Order::getCustomerName) // Map to customer name
                .collect(Collectors.toList());

        processedOrders.forEach(System.out::println);
    }
}

