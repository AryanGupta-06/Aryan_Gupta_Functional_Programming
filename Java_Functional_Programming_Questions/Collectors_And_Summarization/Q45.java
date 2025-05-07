package Java_Functional_Programming_Questions.Collectors_And_Summarization;

import java.util.List;

class Book {
    private String title;
    private double rating;
    private double price;

    public Book(String title, double rating, double price) {
        this.title = title;
        this.rating = rating;
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }
}

class BookSummary {
    private int totalCount;
    private double averageRating;
    private double totalPrice;

    public BookSummary(int totalCount, double averageRating, double totalPrice) {
        this.totalCount = totalCount;
        this.averageRating = averageRating;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "BookSummary{" +
                "totalCount=" + totalCount +
                ", averageRating=" + averageRating +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

public class Q45 {

    public static BookSummary generateSummary(List<Book> books) {
        int totalCount = books.size();
        double totalRating = 0;
        double totalPrice = 0;

        for (Book book : books) {
            totalRating += book.getRating();
            totalPrice += book.getPrice();
        }

        double averageRating = totalCount > 0 ? totalRating / totalCount : 0;

        return new BookSummary(totalCount, averageRating, totalPrice);
    }

    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Book 1", 4.5, 29.99),
                new Book("Book 2", 3.8, 19.99),
                new Book("Book 3", 4.2, 24.99)
        );

        BookSummary summary = generateSummary(books);
        System.out.println(summary);
    }
}

