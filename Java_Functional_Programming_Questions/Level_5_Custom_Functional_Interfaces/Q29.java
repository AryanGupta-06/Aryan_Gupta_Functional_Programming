package Java_Functional_Programming_Questions.Level_5_Custom_Functional_Interfaces;

public class Q29 {
    @FunctionalInterface
    public interface TriFunction<X, Y, Z, R> {
        R apply(X t, Y u, Z v);
    }

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers = (a, b, c) -> a + b + c;
        int result = addThreeNumbers.apply(1, 2, 3);
        System.out.println("Result: " + result); // Output: Result: 6
    }

}


