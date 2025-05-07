package Java_Functional_Programming_Questions.Advanced_Optional_And_Stream_API;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Order {
    private LocalDate date;
    private double totalAmount;

    public Order(LocalDate date, double totalAmount) {
        this.date = date;
        this.totalAmount = totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

public class Q50 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(LocalDate.of(2025, 5, 1), 100.0),
                new Order(LocalDate.of(2025, 5, 3), 150.0),
                new Order(LocalDate.of(2025, 5, 5), 200.0),
                new Order(LocalDate.of(2025, 5, 7), 250.0)
        );

        LocalDate startDate = LocalDate.of(2025, 5, 2);
        LocalDate endDate = LocalDate.of(2025, 5, 6);

        double totalSum = orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate))
                .mapToDouble(Order::getTotalAmount)
                .sum();

        System.out.println("Total sum of orders within date range: " + totalSum);
    }
}

