package Java_Functional_Programming_Questions.Data_Processing_And_Transformations;

import java.util.Arrays;
import java.util.List;

class Transaction {
    private double amount;
    private String type;

    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}

public class Q31 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100.0, "DEBIT"),
                new Transaction(200.0, "CREDIT"),
                new Transaction(150.0, "DEBIT"),
                new Transaction(50.0, "DEBIT")
        );

        double totalDebitAmount = transactions.stream()
                .filter(transaction -> "DEBIT".equals(transaction.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println("Total DEBIT amount: " + totalDebitAmount);
    }
}

