package Java_Functional_Programming_Questions.Custom_Types_And_Nested_Streams;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String category;
    private double rating;

    public Product(String name, String category, double rating) {
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }
}

public class Q38 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Product1", "Electronics", 4.5),
                new Product("Product2", "Electronics", 4.7),
                new Product("Product3", "Books", 4.8),
                new Product("Product4", "Books", 4.6),
                new Product("Product5", "Clothing", 4.9)
        );

        Map<String, String> categoryToHighestRatedProduct = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                                product -> product.map(Product::getName).orElse(null)
                        )
                ));

        categoryToHighestRatedProduct.forEach((category, productName) ->
                System.out.println("Category: " + category + ", Highest Rated Product: " + productName)
        );
    }
}

